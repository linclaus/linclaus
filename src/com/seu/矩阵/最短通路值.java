package com.seu.矩阵;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 最短通路值 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] array = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println(minPathValue(array));
		func(array, 0, 0, 0);

	}

	public static void func(int[][] array, int i, int j, int minpath) {
		if (i == array.length - 1 && j == array[0].length - 1) {
			System.out.println(minpath + 1);
			return;
		}
		array[i][j] = 0;
		if (j + 1 < array[0].length && array[i][j + 1] == 1) {
			func(array, i, j + 1, minpath + 1);
		}
		if (i + 1 < array.length && array[i + 1][j] == 1) {
			func(array, i + 1, j, minpath + 1);
		}
		if (j - 1 >= 0 && array[i][j - 1] == 1) {
			func(array, i, j - 1, minpath + 1);
		}
		if (i - 1 >= 0 && array[i - 1][j] == 1) {
			func(array, i - 1, j, minpath + 1);
		}
	}

	public static int minPathValue(int[][] array) {
		if (array == null || array.length == 0 || array[0].length == 0
				|| array[0][0] != 1
				|| array[array.length - 1][array[0].length - 1] != 1) {
			return 0;
		}
		Queue<Integer> row = new LinkedList<Integer>();
		Queue<Integer> col = new LinkedList<Integer>();
		int[][] dp = new int[array.length][array[0].length];
		row.add(0);
		col.add(0);
		int r = 0, c = 0;
		while (!row.isEmpty()) {
			r = row.poll();
			c = col.poll();
			if (r == array.length - 1 && c == array[0].length - 1) {
				return dp[r][c]+1;
			}
			if (r - 1 >= 0 && array[r - 1][c] == 1 && dp[r - 1][c] == 0) {
				row.add(r - 1);
				col.add(c);
				dp[r - 1][c] = dp[r][c] + 1;
			}
			if (c - 1 >= 0 && array[r][c - 1] == 1 && dp[r][c - 1] == 0) {
				row.add(r);
				col.add(c - 1);
				dp[r][c - 1] = dp[r][c] + 1;
			}
			if (r + 1 < array.length && array[r + 1][c] == 1
					&& dp[r + 1][c] == 0) {
				row.add(r + 1);
				col.add(c);
				dp[r + 1][c] = dp[r][c] + 1;
			}
			if (c + 1 < array[0].length && array[r][c + 1] == 1
					&& dp[r][c + 1] == 0) {
				row.add(r);
				col.add(c + 1);
				dp[r][c + 1] = dp[r][c] + 1;
			}
		}
		return 0;
	}
}
