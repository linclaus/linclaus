package com.seu.算法;

import java.util.Scanner;

public class 砖块漏水回溯法 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] array = new int[R][C];
		int[][] dp = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		boolean flag = false;
		for (int i = 0; i < array[0].length; i++) {
			if (flag)
				break;
			flag = fun(0, i, array);
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static boolean fun(int i, int j, int[][] array) {
		boolean flag = false;
		if (i == array.length - 1 && array[i][j] == 0)
			flag = true;
		array[i][j] = 1;
		if (!flag && i - 1 >= 0 && array[i - 1][j] != 1) {
			flag = fun(i - 1, j, array);
		}
		if (!flag && i + 1 < array.length && array[i + 1][j] != 1) {
			flag = fun(i + 1, j, array);
		}
		if (!flag && j - 1 >= 0 && array[i][j - 1] != 1) {
			flag = fun(i, j - 1, array);
		}
		if (!flag && j + 1 < array[0].length && array[i][j + 1] != 1) {
			flag = fun(i, j + 1, array);
		}
		return flag;
	}
}
