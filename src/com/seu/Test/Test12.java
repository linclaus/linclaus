package com.seu.Test;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp1 = 1, temp2 = 1;
		int result = 2;
		for (int i = 3; i <= num; i++) {
			result = temp1 + temp2;
			temp1 = temp2;
			temp2 = result;
		}
		System.out.print(result);
	}
}
