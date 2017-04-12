package com.seu.acm;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int num = sc.nextInt();
			System.out.println(sum(num));
		}
	}

	public static String sum(int n) {
		int[] num = new int[] { 0, 1, -1 };
		int s = 0;
		String str = "";
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				for (int c = 0; c < 3; c++) {
					for (int d = 0; d < 3; d++) {
						for (int e = 0; e < 3; e++) {
							s = 1 * num[e] + 3 * num[d] + 9 * num[c] + 27
									* num[b] + 81 * num[a];
							if (s == n) {
								str = (81 * num[a] + "+") + (27 * num[b] + "+")
										+ (9 * num[c] + "+")
										+ (3 * num[d] + "+")
										+ (1 * num[e] + "");
								str = str.replace("+0", "").replace("0+", "").replace("+-", "-");
								break;
							}
						}
					}
				}
			}
		}
		return str;
	}
}
