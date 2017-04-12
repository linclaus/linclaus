package com.seu.zuochengyun;

import java.util.Scanner;

public class beike1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			long num = sc.nextInt();
			long i = 1;
			long m = 0;
			long res = 0;
			int maxstep;
			while (i<100000) {
				m = (1000000007L * i) + 1;
				if (m % (num + 1) == 0) {
					res = m / (num + 1);
					break;
				}
				i++;
			}
			if(i>=100000)
				System.out.println("-1");
			else{
				int len = Integer.toBinaryString((int) res).length() - 1;
				int three = len / 3;
				int two = len % 3;
				if (two == 2) {
					System.out.println(three + two - 1);
				} else
					System.out.println(three + two);

			}
			
		}
	}
}
