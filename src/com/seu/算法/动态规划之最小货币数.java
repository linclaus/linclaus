package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 动态规划之最小货币数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int max = Integer.MAX_VALUE;
		System.out.println(max+1);
		int[] money = { 2, 3, 5 };
		int[][] dp = new int[money.length][sum + 1];
		for (int i = 1; i < sum + 1; i++) {
			dp[0][i] = max;
			if (i - money[0] >= 0 && dp[0][i - money[0]] != max)
				dp[0][i] = dp[0][i - money[0]] + 1;
		}
		for (int i = 1; i < money.length; i++) {
			for (int j = 1; j <= sum; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - money[i] >= 0 && dp[i][j - money[i]] != max)
					dp[i][j] = Math.min(dp[i][j], dp[i][j - money[i]] + 1);
			}
		}
		for (int i = 0; i < dp.length; i++)
			System.out.println(Arrays.toString(dp[i]));
	}
}
