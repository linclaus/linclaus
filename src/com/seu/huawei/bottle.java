package com.seu.huawei;

import java.util.Scanner;

public class bottle {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while ((num = sc.nextInt()) != 0) {
			count = 0;
			function(num);
			System.out.println(count);
		}
	}

	public static void function(int num) {
		if (num == 2 || num == 3) {
			count++;
			return;
		}
		if (num == 1) {
			return;
		}
		count += (num/3);
		function(num / 3 + num % 3);
	}
}
