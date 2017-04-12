package com.seu.zuochengyun;

import java.math.BigInteger;
import java.util.Scanner;

public class beike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			int i = 1;
			BigInteger bnum = new BigInteger(num + 1 + "");
			BigInteger m = new BigInteger(0 + "");
			BigInteger a = new BigInteger(1000000007 + "");
			BigInteger res = new BigInteger(0 + "");
			while (true) {
				m = a.multiply(new BigInteger(i + "")).add(
						new BigInteger(1 + ""));
				if (m.mod(bnum).compareTo(new BigInteger(0 + "")) == 0) {
					res = m.divide(bnum);
					break;
				}
				i++;
			}
			int len=res.bitLength()-1;
			System.out.println(len);
			int three = len / 3;
			int two = len % 3;
			if (two == 2) {
				System.out.println(three + two - 1);
			} else
				System.out.println(three + two);

		}
	}
}
// 125000000
// 281250001

