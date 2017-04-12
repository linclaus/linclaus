package com.seu.huawei;

import java.text.DecimalFormat;
import java.util.Scanner;

public class duanjinchen {
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
			int[] time = new int[num];
			time[0] = array[0][0];
			for (int i = 1; i < num; i++) {
				time[i] = time[i - 1] + array[i - 1][1];
			}
			int sum = 0;
			for (int i = 0; i < num; i++) {
				sum += (time[i] - array[i][0]);
			}
			DecimalFormat df = new DecimalFormat("######0.0000");
			Double ds=sum / (num + 0.0);
			System.out.println(df.format(ds));
		}
	}
}
