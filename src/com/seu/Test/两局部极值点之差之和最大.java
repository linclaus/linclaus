package com.seu.Test;

import java.util.Scanner;

public class 两局部极值点之差之和最大 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int max = 0;
		int ia = 0, ib = 0, ic = 0, id = 0;
		for (int i = 2; i < n - 2; i++) {
			int min1 = array[0];
			int max1 = 0;
			int a, b, c, d;
			a = b = 0;
			for (int j = 1; j <= i; j++) {
				if (array[j] < min1) {
					min1 = array[j];
					a = j;
				} else if (max1 < array[j] - min1) {
					max1 = array[j] - min1;
					b = j;
				}
			}
			int min2 = array[i];
			int max2 = 0;
			c = d = i;
			for (int j = i; j < n; j++) {
				if (array[j] < min2) {
					min2 = array[j];
					c = j;
				} else if (max2 < array[j] - min2) {
					max2 = array[j] - min2;
					d = j;
				}
			}
			if (max < max1 + max2) {
				max = max1 + max2;
				ia = a;
				ib = b;
				ic = c;
				id = d;
			}
		}
		System.out.println(ia + ":" + array[ia] + " " + ib + ":" + array[ib]
				+ " " + ic + ":" + array[ic] + " " + id + ":" + array[id] + " "
				+ max);
	}
}
