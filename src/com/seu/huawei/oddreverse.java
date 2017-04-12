package com.seu.huawei;

import java.util.Scanner;

public class oddreverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int[] array = new int[num];
			for (int i = 0; i < num; i++) {
				array[i] = sc.nextInt();
			}
			for (int i = 0; i < num; i++) {
				String str = Integer.toBinaryString(array[i]);
				if (str.charAt(str.length() - 1) == '0') {
					char[] cs = str.toCharArray();
					char tmp;
					for (int j = 0; j < Math.ceil(cs.length / 2); j++) {
						tmp = cs[j];
						cs[j] = cs[cs.length - 1 - j];
						cs[cs.length - 1 - j] = tmp;
					}
					str = new String(cs);
					array[i] = Integer.parseInt(str, 2);
				}
			}
			String str = "";
			for (int i = 0; i < num; i++) {
				str += (array[i] + " ");
			}
			System.out.println(str.substring(0, str.length() - 1));
		}
	}
}
