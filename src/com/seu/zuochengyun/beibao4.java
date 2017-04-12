package com.seu.zuochengyun;

import java.math.BigInteger;
import java.util.Scanner;

public class beibao4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigInteger bnum = new BigInteger(num + "");
		int i = 0;
		while (true) {
			if (i >= 100000) {
				System.out.println("-1");
			}
			BigInteger tmp = bnum.multiply(new BigInteger(4 + "")).add(
					new BigInteger(3 + ""));
			if (Integer.parseInt(tmp.mod(new BigInteger(1000000007 + ""))
					.toString()) == 0) {
				i++;
				break;
			}
			bnum = bnum.multiply(new BigInteger(8 + "")).add(
					new BigInteger(7 + ""));
			if (Integer.parseInt(bnum.mod(new BigInteger(1000000007 + ""))
					.toString()) == 0) {
				i++;
				break;
			}
			BigInteger tmp1 = tmp.multiply(new BigInteger(4 + "")).add(
					new BigInteger(3 + ""));
			if (Integer.parseInt(tmp1.mod(new BigInteger(1000000007 + ""))
					.toString()) == 0) {
				i++;
				i++;
				break;
			}
			i++;
		}
		System.out.println(bnum.toString(10).length());
		if (i < 100000)
			System.out.println(i);
	}
}

// 281250001
// 125000000
// 289869954