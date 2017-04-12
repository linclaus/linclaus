package com.seu.zuochengyun;

import java.util.Arrays;
import java.util.Scanner;

public class blackhole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String snum = num + "";
		String snum1 = "";
		String snum2 = "";
		int result = 10;
		while (result != 6174 && result != 0) {
			int[] array = new int[4];
			snum1 = "";
			snum2 = "";
			for (int i = 0; i < snum.length(); i++) {
				array[i] = snum.charAt(i) - '0';
			}
			Arrays.sort(array);
			for (int i = 0; i < 4; i++) {
				snum1 += (array[i] + "");
				snum2 += (array[3 - i] + "");
			}
			result = Integer.parseInt(snum2) - Integer.parseInt(snum1);
			String sresult = result + "";
			int[] results = new int[4];
			for (int i = 0; i < sresult.length(); i++)
				results[3 - i] = sresult.charAt(i) - '0';
			sresult = "";
			for (int i = 0; i < 4; i++)
				sresult += results[i];
			System.out.println(snum2 + " - " + snum1 + " = " + sresult);
			snum = result + "";
		}
	}
}
