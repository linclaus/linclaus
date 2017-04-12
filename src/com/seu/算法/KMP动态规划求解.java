package com.seu.算法;

import java.util.Arrays;

public class KMP动态规划求解 {// 动态规划
	public static void main(String[] args) {
		String str = "abcabdabcabcaa";
		int[] array = new int[str.length()];
		array[0] = -1;
		for (int i = 1; i < array.length; i++) {// 和那个字符的后一个开始比较
			char c = str.charAt(i);
			int temp = array[i - 1];
			while (true) {
				if (c == str.charAt(temp + 1)) {
					array[i] = temp + 1;
					break;
				} else {
					if (temp == -1) {
						array[i] = -1;
						break;
					}
					temp = array[temp];
				}
			}
		}
		System.out.println(Arrays.toString(array));

		String strs = "11abcabdabcabcaa1a1";
		int temp = array[0];
		for (int i = 0; i < strs.length(); i++) {
			char c = strs.charAt(i);
			while (true) {
				if (c == str.charAt(temp + 1)) {
					temp++;
					break;
				} else {
					if (temp == -1)
						break;
					temp = array[temp];
				}
			}
			if (temp == str.length() - 1) {
				System.out.println(i - str.length() + 1);
				break;
			}
		}

	}
}
