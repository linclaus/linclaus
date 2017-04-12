package com.seu.acm;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int n = sc.nextInt();
			int number = sc.nextInt();
			int flag = 1;
			int[] array = getArray(n);
			int[] temp = getArray(n);
			int[] arraysum = getArraySum(temp);
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();

			for (int i = 0; i < arraysum.length; i++) {
				System.out.print(arraysum[i] + " ");
			}

			System.out.println();
			int[] result = new int[n];
			int absnum = number;
			for (int i = n - 1; i > 0; i--) {
				if (absnum > arraysum[i - 1] && absnum <= arraysum[i]) {
					result[i] = flag;
				} else {
					result[i] = 0;
					i--;
					continue;
				}
				number = flag * (absnum - array[i]);
				absnum = (int) Math.abs(number);
				if (number == 0)
					break;
				flag = number / absnum;
			}
			if (absnum == 1)
				result[0] = flag;
			for (int i = 0; i < n; i++) {
				System.out.print(result[i] + " ");
			}
		}
		// String str = (81 * result[4] + "+") + (27 * result[3] + "+")
		// + (9 * result[2] + "+")
		// + (3 * result[1] + "+")
		// + (1 * result[0] + "");
		// str = str.replace("+0", "").replace("0+", "").replace("+-", "-");
		// System.out.println(str);
	}

	public static int[] getArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) Math.pow(3, i);
		}
		return array;
	}

	public static int[] getArraySum(int[] arraysum) {
		int n = arraysum.length;
		for (int i = 1; i < n; i++) {
			arraysum[i] += arraysum[i - 1];
		}
		return arraysum;
	}
}
