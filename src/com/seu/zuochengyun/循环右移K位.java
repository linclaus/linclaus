package com.seu.zuochengyun;

import java.util.Arrays;
import java.util.Scanner;

public class —≠ª∑”““∆KŒª {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int i, j;
		for (i = 0, j = length - k - 1; i < j; i++, j--) {
			array[i] += array[j];
			array[j] = array[i] - array[j];
			array[i] -= array[j];
		}
		for (i = length - k, j = length - 1; i < j; i++, j--) {
			array[i] += array[j];
			array[j] = array[i] - array[j];
			array[i] -= array[j];
		}
		for (i = 0, j = length - 1; i < j; i++, j--) {
			array[i] += array[j];
			array[j] = array[i] - array[j];
			array[i] -= array[j];
		}
		System.out.print(Arrays.toString(array));
	}
}
