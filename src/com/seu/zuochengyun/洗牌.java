package com.seu.zuochengyun;

import java.util.Scanner;

public class Ï´ÅÆ {

	public static int[] get(int[] a) {
		int size = a.length;
		int half = size / 2;
		int[] arr = new int[size];
		int count = size - 1;
		for (int i = half - 1, j = size - 1; i >= 0; i--, j--) {
			arr[count--] = a[j];
			arr[count--] = a[i];
		}
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int l = 0;
		while (l < T) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			l++;
			int count = 0;
			int[] a = new int[2 * n];
			for (int i = 0; i < 2 * n; i++) {
				a[i] = sc.nextInt();
			}
			while (count != k) {
				a = get(a);
				count++;
			}
			for (int t = 0; t < a.length - 1; t++) {
				System.out.print(a[t] + " ");
			}
			System.out.print(a[a.length - 1]);
			System.out.println();
		}
	}
}
