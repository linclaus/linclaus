package com.seu.算法;


public class 最小包含子串的长度 {
	public static void main(String[] args) {
		String str1 = "abecde", str2 = "eab";
		int[] map = new int[26];
		for (int i = 0; i < str2.length(); i++) {
			map[str2.charAt(i) - 'a']++;
		}
		int left = 0, right = 0, match = str2.length(), minLen = Integer.MAX_VALUE;
		while (right < str1.length()) {
			map[str1.charAt(right) - 'a']--;
			if (map[str1.charAt(right) - 'a'] >= 0)
				match--;
			if (match == 0) {
				while (map[str1.charAt(left) - 'a'] < 0)
					map[str1.charAt(left++) - 'a']++;
				minLen = Math.min(minLen, right - left + 1);
				match++;
				map[str1.charAt(left++) - 'a']++;
			}
			right++;
		}
		System.out.println(minLen);
	}
}
