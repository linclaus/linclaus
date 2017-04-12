package com.seu.zuochengyun;

import java.util.Arrays;
import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int count = max - min;
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		if (array[0] != min)
			System.out.println(min);
		else if (array[array.length-1] != max)
			System.out.println(max);
		else
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i + 1] - array[i] != 1) {
					System.out.println(array[i] + 1);
					break;
				}
			}
	}
}
