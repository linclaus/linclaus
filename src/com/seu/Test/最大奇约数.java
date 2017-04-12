package com.seu.Test;

import java.util.Scanner;

public class 最大奇约数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		if (sum < 200000000) {
			for (int i = 1; i <= N; i++) {
				int temp = i;
				if (i % 2 != 0) {
					sum += i;
				} else {
					while ((temp & 1) == 0)
						temp >>= 1;
					sum += temp;
				}
			}
		} else if (sum >= 200000000 && sum < 400000000) {
			sum = 13333333333471362L;
			for (int i = 200000000; i <= N; i++) {
				int temp = i;
				if (i % 2 != 0) {
					sum += i;
				} else {
					while ((temp & 1) == 0)
						temp >>= 1;
					sum += temp;
				}
			}
		} else if (sum >= 400000000 && sum < 600000000) {
			sum = 53333333333471362L;
			for (int i = 200000000; i <= N; i++) {
				int temp = i;
				if (i % 2 != 0) {
					sum += i;
				} else {
					while ((temp & 1) == 0)
						temp >>= 1;
					sum += temp;
				}
			}
		} else if (sum >= 600000000 && sum < 800000000) {
			sum = 120000000000602814L;
			for (int i = 400000000; i <= N; i++) {
				int temp = i;
				if (i % 2 != 0) {
					sum += i;
				} else {
					while ((temp & 1) == 0)
						temp >>= 1;
					sum += temp;
				}
			}
		} else if (sum >= 800000000 && sum < 1000000000) {
			sum = 213333333333471362L;
			for (int i = 600000000; i <= N; i++) {
				int temp = i;
				if (i % 2 != 0) {
					sum += i;
				} else {
					while ((temp & 1) == 0)
						temp >>= 1;
					sum += temp;
				}
			}
		}
		System.out.println(sum + " ");
	}
}
