package com.seu.算法;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 笨笨熊问题 {
	static int k = 0;
	static int h = 0;
	static int m = 0;
	static int n = 0;
	static String[][] strArray2 = null;

	public static void main(String[] args) {

		System.out.println("请输入行：");
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		System.out.println("请输入列：");
		Scanner sc1 = new Scanner(System.in);
		int C = sc1.nextInt();

		try {
			while (true) {
				System.out.println("输入由" + R * C + "个B、-、#、H组成的地图，并以逗号隔开");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						System.in));
				String inputString = br.readLine();

				// if("ok".equals(inputString)){
				// break;
				// }else{

				String[] strArray = null;
				strArray = inputString.split(","); // 拆分字符为" "
													// ,然后把结果交给数组strArray
				if (strArray.length != R * C) {
					System.out.println("输入错误，请重新输入：");

				} else {
					strArray2 = new String[R][C];
					int count = 0;
					for (int i = 0; i < R; i++) {
						for (int j = 0; j < C; j++) {
							strArray2[i][j] = strArray[count++];
						}
					}
					System.out.println("输入的地图为：");
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
