package com.seu.矩阵;

import java.util.Arrays;
import java.util.Scanner;

public class 打印相加和为定值二元组 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int start = 0, end = num - 1;
		while (start < end) {
			if (array[start] + array[end] == k) {
				System.out.print(array[start] + "+" + array[end] + " ");
				start++;
				end--;
			} else if (array[start] + array[end] < k) {
				start++;
			} else {
				end--;
			}
		}
		System.out.println();
		int another = 0;
		int k1;
		while (another < num - 2) {
			start = another + 1;
			end = num - 1;
			k1 = k-array[another];
			while (start < end) {
				if (array[start] + array[end] == k1) {
					System.out.print(array[another] + "+" + array[start] + "+"
							+ array[end] + " ");
					start++;
					end--;
				} else if (array[start] + array[end] < k1) {
					start++;
				} else {
					end--;
				}
			}
			another++;
		}
	}
}
