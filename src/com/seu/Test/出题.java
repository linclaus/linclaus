package com.seu.Test;

import java.util.Arrays;
import java.util.Scanner;

public class ³öÌâ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int cnt = 0;
		int flag = 1;
		int j = 0;
		for (int i = 0; i < n - 5;) {
			if (array[i + 2] - array[i + 1] <= 10
					&& array[i + 1] - array[i] <= 10) {
				i += 3;
				continue;
			}
			if (array[i + 1] - array[i] <= 10
					&& array[i + 2] - array[i + 1] > 10) {
				cnt++;
				i += 2;
				continue;
			}
			if (array[i + 1] - array[i] > 10 && array[i + 1] - array[i] <= 20) {
				cnt++;
				i += 2;
				continue;
			}
			if (array[i + 1] - array[i] > 20) {
				cnt += 2;
				i += 1;
				continue;
			}
		}
		System.out.println(cnt);
	}
}
