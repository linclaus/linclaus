package com.seu.Test;

import java.util.Scanner;

public class 字符串数组首尾相连 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = sc.next();
		}
		int[] record = new int[26];
		boolean[] same = new boolean[26];
		int index;
		for (int i = 0; i < n; i++) {
			index = strs[i].charAt(0) - 'a';
			if (strs[i].charAt(0) != strs[i].charAt(strs[i].length() - 1))
				record[index]++;
			else
				same[index] = true;
		}
		boolean flag = true;
		for (int i = 0; i < 26; i++) {
			if (same[i]) {
				if (record[i] != 0) {
					same[i] = false;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			index = strs[i].charAt(strs[i].length() - 1) - 'a';
			if (strs[i].charAt(0) != strs[i].charAt(strs[i].length() - 1)) {
				if (record[index]-- == 0) {
					flag = false;
					break;
				} else
					record[index]++;
			}
		}
		if (flag) {
			for (int i = 0; i < 26; i++) {
				if (same[i]) {
					if (record[i] == 0) {
						flag = false;
						break;
					}
				}
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
