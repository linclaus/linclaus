package com.seu.Test;

import java.util.Scanner;

public class 指定年份的每一天 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		showDate(year);
	}

	public static void showDate(int year) {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 31; j++) {
				switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(year + "年" + i + "月" + j + "日");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (j <= 30)
						System.out.println(year + "年" + i + "月" + j + "日");
					break;
				case 2:
					if (year % 4 != 0 || year % 400 != 0) {
						if (j <= 28)
							System.out.println(year + "年" + i + "月" + j + "日");
					} else if (j <= 29)
						System.out.println(year + "年" + i + "月" + j + "日");
					break;
				}
			}
		}
	}
}
