package com.seu.huawei;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (str == null || str.length() <= 8) {
				System.out.println("NG");
				continue;
			}
			int flag = 0;
			int[] sum = new int[4];
			char[] cs = str.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				if (cs[i] >= '0' && cs[i] <= '9') {
					sum[0] = 1;
				} else if (cs[i] >= 'a' && cs[i] <= 'z') {
					sum[1] = 1;
				} else if (cs[i] >= 'A' && cs[i] <= 'Z') {
					sum[2] = 1;
				} else {
					sum[3] = 1;
				}
			}
			if (sum[0] + sum[1] + sum[2] + sum[3] >= 3) {
				Lable: for (int m = 0; m < cs.length - 2; m++) {
					String substr1 = str.substring(m, m + 3);
					for (int n = m + 1; n < str.length() - 2; n++) {
						if (str.substring(n).contains(substr1)) {
							System.out.println("NG");
							flag = 1;
							break Lable;
						}
					}
				}
				if (flag == 0)
					System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
}
