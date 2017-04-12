package com.seu.zuochengyun;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ¶Ì½ø³Ì {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int[][] array = new int[num][2];
			for (int i = 0; i < num; i++) {
				array[i][0] = sc.nextInt();
				array[i][1] = sc.nextInt();
			}
			for (int i = 0; i < num; i++) {
				for (int j = i; j < num; j++) {
					if (array[i][0] > array[j][0]) {
						int[] temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					} else if (array[i][0] == array[j][0]) {
						if (array[i][1] > array[j][1]) {
							int[] temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
			}
			int time = 0;
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				int j = 0;
				int min = Integer.MAX_VALUE;
				int index = 0;
				while (j < array.length && array[j][0] <= time
						&& array[j][1] != 0) {
					if (min > array[j][1]) {
						min = array[j][1];
						index = j++;
						continue;
					}
					j++;
				}
				sum += (time - array[index][0] > 0 ? time - array[index][0] : 0);
				time += array[index][1];
				remove(array, index);
			}
			System.out.println(sum);
			DecimalFormat df = new DecimalFormat("######0.0000");
			Double ds = sum / (num + 0.0);
			System.out.println(df.format(ds));
		}
	}

	public static void remove(int[][] array, int i) {
		for (i++; i < array.length && array[i][0] != 0; i++) {
			int[] temp = array[i - 1];
			array[i - 1] = array[i];
			array[i] = temp;
		}
		if (i <= array.length) {
			array[i - 1][0] = 0;
			array[i - 1][1] = 0;
		}
	}
}
