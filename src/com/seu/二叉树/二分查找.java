package com.seu.二叉树;

import java.util.Scanner;

public class 二分查找 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int start = 0, end = n - 1;
		int mid = (start + end) / 2;
		boolean flag = false;
		while (start <= end) {
			if (array[mid] == x) {
				flag = true;
				break;
			} else if (x < array[mid]) {
				end = mid - 1;
				mid = (start + end) / 2;
			} else {
				start = mid + 1;
				mid = (start + end) / 2;
			}
		}
		if (mid == 0)
			System.out.println(-1);
		else if (flag) {
			System.out.println(mid);
		} else {
			System.out.println((-2 - mid));
		}
	}
}
