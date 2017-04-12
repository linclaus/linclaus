package com.seu.Ëã·¨;

import java.util.Arrays;
import java.util.Scanner;

public class Ô²×ÀÎÊÌâ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int[][] dp = new int[n][4];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		dp[0][0] = 0;
		dp[0][1] = array[0];
		dp[n - 1][2] = 0;
		dp[n - 1][3] = array[n - 1];
		for (int i = 1, j = n - 2; i < n; i++, j--) {
			dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
			dp[i][1] = dp[i - 1][0] + array[i];
			dp[j][2] = Math.max(dp[j + 1][2], dp[j + 1][3]);
			dp[j][3] = dp[j + 1][2] + array[j];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(Arrays.toString(dp[i]));
		}
		int max = 0;
		max = Math.max(dp[0][2], dp[n - 1][0]);
		System.out.println();
		System.out.println(max);
	}
}
