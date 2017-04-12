package com.seu.huawei;
import java.util.Scanner;
public class 合唱队 {//计算最少出列多少位同学，使得剩下的同学排成合唱队形
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int[] height = new int[num];
			for (int i = 0; i < num; i++) {
				height[i] = sc.nextInt();
			}
			int max = 0;
			for (int k = 1; k < num; k++) {
				int[] height1 = new int[k];
				int[] height2 = new int[num - k];
				for (int i = 0; i < num; i++) {
					if (i < k) {
						height1[i] = height[i];
					} else {
						height2[i - k] = height[num - 1 - i + k];
					}
				}
				int max1 = function(height1);
				int max2 = function(height2);
				max = (Math.max(max, max1 + max2));
			}
			System.out.println(num - max);
		}
	}

	public static int function(int[] height) {
		int num = height.length;
		int[] array = new int[num];
		array[num - 1] = 1;
		for (int i = num - 2; i >= 0; i--) {
			int j = i + 1;
			int tmp = 0;
			for (; j < num; j++) {
				if (height[i] < height[j]) {
					tmp = (tmp > array[j] ? tmp : array[j]);
					continue;
				}
			}
			array[i] = tmp + 1;
		}
		int max = 0;
		for (int i = 0; i < num; i++) {
			max = (max > array[i] ? max : array[i]);
		}
		return max;
	}
}
