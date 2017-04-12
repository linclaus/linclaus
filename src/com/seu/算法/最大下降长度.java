package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 最大下降长度 {
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
		// int[][] array = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 },
		// { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
		// { 13, 12, 11, 10, 9 } };
		// int[][] dp = new int[5][5];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				max = Math.max(max, fun(i, j, array, dp));
			}
		}
		System.out.println(max);
		for (int i = 0; i < array.length; i++)
			System.out.println(Arrays.toString(dp[i]));
	}

	public static int fun(int i, int j, int[][] array, int[][] dp) {
		int max = 0;
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		if (i - 1 >= 0 && array[i - 1][j] < array[i][j]) {
			max = Math.max(max, fun(i - 1, j, array, dp));
		}
		if (i + 1 < array.length && array[i + 1][j] < array[i][j]) {
			max = Math.max(max, fun(i + 1, j, array, dp));
		}
		if (j - 1 >= 0 && array[i][j - 1] < array[i][j]) {
			max = Math.max(max, fun(i, j - 1, array, dp));
		}
		if (j + 1 < array[0].length && array[i][j + 1] < array[i][j]) {
			max = Math.max(max, fun(i, j + 1, array, dp));
		}
		dp[i][j] = max + 1;
		return dp[i][j];
	}
}
