package com.seu.huawei;

import java.util.*;

public class ²¹Ïà¿ò {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int U = sc.nextInt();
			int L = sc.nextInt();
			int R = sc.nextInt();
			int D = sc.nextInt();
			sc.nextLine();
			String[] strs = new String[M];
			for (int i = 0; i < M; i++) {
				strs[i] = sc.nextLine();
			}
			int flag1 = 0;
			int flag2 = 0;
			for (int i = 0; i < U; i++) {
				if (flag2 == 0) {
					flag1 = 0;
					flag2 = 1;
				} else {
					flag1 = 1;
					flag2 = 0;
				}
				for (int j = 0; j < L; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}

				for (int j = 0; j < N; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				for (int j = 0; j < R; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				System.out.println();
			}

			for (int i = 0; i < M; i++) {
				if (flag2 == 0) {
					flag1 = 0;
					flag2 = 1;
				} else {
					flag1 = 1;
					flag2 = 0;
				}
				for (int j = 0; j < L; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				for (int j = 0; j < N; j++) {
					if (flag1 == 0) {
						System.out.print(strs[i].charAt(j));
						flag1 = 1;
					} else {
						System.out.print(strs[i].charAt(j));
						flag1 = 0;
					}
				}
				for (int j = 0; j < R; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				System.out.println();
			}

			for (int i = 0; i < D; i++) {
				if (flag2 == 0) {
					flag1 = 0;
					flag2 = 1;
				} else {
					flag1 = 1;
					flag2 = 0;
				}
				for (int j = 0; j < L; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				for (int j = 0; j < N; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				for (int j = 0; j < R; j++) {
					if (flag1 == 0) {
						System.out.print("#");
						flag1 = 1;
					} else {
						System.out.print(".");
						flag1 = 0;
					}
				}
				System.out.println();

			}
		}
	}
}
