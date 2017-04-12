package com.seu.Test;

import java.util.Scanner;

public class ∑÷∏Ó”Œœ∑ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		String str = N + "";
		for (int i = 1; i <= 5; i++) {
			String[] result = func(str, i, new String[0]);
			if(i==1)
				System.out.println(result[0]);
		}
	}

	public static String[] func(String str, int t, String[] ss) {
		String[] result = new String[t];
		String[] sss = new String[ss.length + 1];
		for (int j = 0; j < ss.length; j++)
			sss[j] = new String(ss[j]);
		if (t == 1) {
			result[0] = new String(str);
		} else {
			for (int i = 0; i < str.length() + 1 - t; i++) {
				result[0] = str.substring(0, i + 1);
				sss[ss.length] = new String(result[0]);
				String[] temp = func(str.substring(i + 1, str.length()), t - 1,
						sss);
				for (int j = 0; j < temp.length; j++) {
					result[j + 1] = new String(temp[j]);
				}
				for (int j = 0; j < ss.length; j++)
					System.out.print(ss[j] + " ");
				for (int j = 0; j < result.length; j++) {
					System.out.print(result[j] + " ");
				}
				System.out.println();
			}
		}
		return result;
	}
}
