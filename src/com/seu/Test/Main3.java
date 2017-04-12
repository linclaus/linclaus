package com.seu.Test;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] array = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			array[i] = sc.nextInt();
		}
		int i = 1;

		while (i < cnt) {
			if (array[i] < array[i - 1])
				break;
			i++;
		}
		int max;
		if (i == 1)
			max = Integer.MIN_VALUE;
		else
			max = array[i - 2];

		while (i < cnt) {
			if (array[i] > array[i - 1])
				break;
			i++;
		}
		int min = array[i - 1];

		while (i < cnt) {
			if (array[i] < array[i - 1])
				break;
			i++;
		}
		if (max <= min) {
			if (i >= cnt - 1)
				System.out.println("yes");
			else
				System.out.println("no");
		} else {
			System.out.println("no");
		}
	}
}
