package com.seu.huawei;

import java.util.Scanner;

public class quzuzhe {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			count=0;
			int num = sc.nextInt();
			String[] str = new String[num];
			for (int i = 0; i < num; i++) {
				str[i] = sc.next();
			}
			function(str, num - 1, new char[num]);
			System.out.println(count);
		}
	}

	public static void function(String[] strs, int index, char[] cs) {
		if (index == 0) {
			String str = strs[index];
			for (int i = 0; i < str.length(); i++) {
				int flag = 0;
				cs[index] = str.charAt(i);
				for (int j = 0; j < cs.length; j++) {
					for (int k = j + 1; k < cs.length; k++) {
						if (cs[j] == cs[k])
							flag = 1;
					}
				}
				if (flag == 0)
					count++;
			}
			return;
		}
		String str = strs[index];
		for (int i = 0; i < str.length(); i++) {
			cs[index] = str.charAt(i);
			function(strs, index - 1, cs);
		}
	}
}
