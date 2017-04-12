package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 动态规划之背包问题 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int[] weight = { 2, 2, 6, 5, 4 };
		int[] value = { 2, 2, 6, 5, 4 };
		int[][] array = new int[weight.length + 1][sum + 1];

		int count = 0;

		for (int i = 1; i < weight.length + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {
				array[i][j] = array[i - 1][j];
				if (weight[i - 1] <= j) {
					if (value[i - 1] + array[i - 1][j - weight[i - 1]] > array[i - 1][j]) {
						array[i][j] = value[i - 1]
								+ array[i - 1][j - weight[i - 1]];
					}
				}
				count++;
			}
		}
		System.out.println(count);
		for (int i = 0; i < weight.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
