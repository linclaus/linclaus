package com.seu.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}
			int[] dp = new int[n];
			dp[0] = 1;
			dp[1] = 1;
			int max = array[0];
			int index = 0;
			for (int i = 0; i < n; i++) {
				if (max < array[i]) {
					max = array[i];
					index = i;
				}
			}
			int[] arr = new int[n];
			int j = index + 1;
			for (int i = 0; i < n; i++) {
				arr[i] = array[j % n];
				j++;
			}
			int sum = 2;
			for (int i = 2; i < n; i++) {
				j = i - 1;
				max = arr[j];
				while (j >= 0) {
					if (arr[j] >= max) {
						dp[i]++;
						max = arr[j];
					}
					j--;
				}
				sum += dp[i];
			}
			for (index = 1; index < n - 1; index++) {
				if (arr[index] < arr[index - 1])
					break;
				sum += 1;
			}
			max = arr[index++-1];
			int temp = max;
			for (; index < n - 1; index++) {
				temp = Math.max(temp, arr[index]);
			}
			if (temp == max)
				sum--;
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(dp));
			System.out.println(sum);
		}

	}
}
