package com.seu.zuochengyun;

import java.math.BigInteger;
import java.util.Scanner;

public class beibao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = 1000000008 % (num + 1);
		int res1 = 1000000007 % (num + 1);
		int i = 1;
		while (res != 0) {
			res = (res + res1) % (num + 1);
			i++;
		}
		BigInteger bnum = new BigInteger(1000000007 + "").multiply(
				new BigInteger(i + "")).add(new BigInteger(1 + ""));
		// System.out.println(i+":"+bnum);
		BigInteger bres0 = bnum.divide(new BigInteger(num + 1 + ""));
		int c=0;
		BigInteger bres=bres0;
		while(bres0.bitCount()!=1){
			System.out.println(bres0);
			bres0=bres.add(bres0);
//			if(c++==10000)
//				break;
		}
		
		
		int len = bres0.bitLength() - 1;
		System.out.println(len);
		int three = len / 3;
		int two = len % 3;
		if (two == 2) {
			System.out.println(three + two - 1);
		} else
			System.out.println(three + two);
	}
}
// 281250001
// 125000000
// 289869954

// 156250002
// 31250001
// 187500002
// 62500001
// 218750002
// 93750001
// 250000002
// 125000001
// 0