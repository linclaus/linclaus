package com.seu.�㷨;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ���������� {
	static int k = 0;
	static int h = 0;
	static int m = 0;
	static int n = 0;
	static String[][] strArray2 = null;

	public static void main(String[] args) {

		System.out.println("�������У�");
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		System.out.println("�������У�");
		Scanner sc1 = new Scanner(System.in);
		int C = sc1.nextInt();

		try {
			while (true) {
				System.out.println("������" + R * C + "��B��-��#��H��ɵĵ�ͼ�����Զ��Ÿ���");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				String inputString = br.readLine();

				// if("ok".equals(inputString)){
				// break;
				// }else{

				String[] strArray = null;
				strArray = inputString.split(","); // ����ַ�Ϊ" "
													// ,Ȼ��ѽ����������strArray
				if (strArray.length != R * C) {
					System.out.println("����������������룺");

				} else {
					strArray2 = new String[R][C];
					int count = 0;
					for (int i = 0; i < R; i++) {
						for (int j = 0; j < C; j++) {
							strArray2[i][j] = strArray[count++];
						}
					}
					System.out.println("����ĵ�ͼΪ��");
					for (int i = 0; i < R; i++) {
						for (int j = 0; j < C; j++) {
							if (strArray2[i][j].equals("B")) {
								k = i;
								h = j;
							}
							if (strArray2[i][j].equals("H")) {
								m = i;
								n = j;
							}

							System.out.print(strArray2[i][j] + " ");
						}
						System.out.println();
					}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		way(k, h);

		// if(strArray2[m][n] == "2"){
		// System.out.println("y");}
		// else if(strArray2[k][h] == "3"){
		// System.out.println("n");}
		/*
		 * boolean f = way(k,h); if(f){ System.out.println("y"); } else{
		 * System.out.println("n"); }
		 */
	}

	public static boolean way(int x, int y) {
		if (strArray2[m][n].equals("2")) {
			System.out.println("y");

			return true;
		}
		// else if(strArray2[k][h].equals("3")){
		// System.out.println("n");
		// return false;
		// }
		else if (strArray2[x][y].equals("H") || strArray2[x][y].equals("B")
				|| strArray2[x][y].equals("-")) {
			strArray2[x][y] = "2";

			if ((y - 1 >= 0) && way(x, y - 1)) {

				return true;

			} else if ((x + 1 < strArray2.length) && way(x + 1, y)) {

				return true;

			} else if ((y + 1 < strArray2[x].length) && way(x, y + 1)) {

				return true;

			} else if ((x - 1 >= 0) && way(x - 1, y)) {

				return true;

			} else {
				strArray2[x][y] = "3";
				if (strArray2[k][h].equals("3")) {
					System.out.println("n");
				}
				return false;
			}

		} else {
			return false;
		}

	}
}
