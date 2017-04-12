package com.seu.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ะกวเอÜ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int P = sc.nextInt();
		int[][] array = new int[R][C];
		boolean[][] dp = new boolean[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		ArrayList<int[]> path = new ArrayList<int[]>();
		int[] loc = { 0, 0 };
		path.add(loc);
		int[] min = { Integer.MAX_VALUE };
		String[] result = {""};
		int pow = func(0, 0, array, 0, path, P, dp, min, result);
		if (pow > P) {
			System.out.println("Can not escape!");
		}else{
			System.out.println(result[0]);
		}
		// System.out.println(flag);
	}

	public static int func(int i, int j, int[][] array, int pow,
			ArrayList<int[]> path, int P, boolean[][] dp, int[] min,
			String[] result) {
		dp[i][j] = true;
		if (i == 0 && j == array[0].length - 1) {
			if (min[0] > pow && array[i][j] == 1) {
				min[0] = pow;
				result[0]="";
				for (int[] p : path) {
					result[0] += "[" + p[0] + "," + p[1] + "]" + ",";
				}
				result[0] = result[0].substring(0, result[0].length() - 1);
			}
		}
		if (i - 1 >= 0 && array[i - 1][j] != 0 && !dp[i - 1][j]) {
			int[] loc = { i - 1, j };
			path.add(loc);
			func(i - 1, j, array, pow + 3, path, P, dp, min,result);
			path.remove(loc);
			dp[i - 1][j] = false;
		}
		if (j + 1 < array.length && array[i][j + 1] != 0 && !dp[i][j + 1]) {
			int[] loc = { i, j + 1 };
			path.add(loc);
			func(i, j + 1, array, pow + 1, path, P, dp, min,result);
			path.remove(loc);
			dp[i][j + 1] = false;
		}
		if (i + 1 < array.length && array[i + 1][j] != 0 && !dp[i + 1][j]) {
			int[] loc = { i + 1, j };
			path.add(loc);
			func(i + 1, j, array, pow, path, P, dp, min,result);
			path.remove(loc);
			dp[i + 1][j] = false;
		}
		if (j - 1 >= 0 && array[i][j - 1] != 0 && !dp[i][j - 1]) {
			int[] loc = { i, j - 1 };
			path.add(loc);
			func(i, j - 1, array, pow + 1, path, P, dp, min,result);
			path.remove(loc);
			dp[i][j - 1] = false;
		}

		return min[0];
	}
}
