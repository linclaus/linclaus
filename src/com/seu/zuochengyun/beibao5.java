package com.seu.zuochengyun;

import java.math.BigInteger;
import java.util.Scanner;

public class beibao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigInteger bnum = new BigInteger(num + "");
		BigInteger b_107 = new BigInteger(1000000007 + "");
		BigInteger bsum=new BigInteger(0 + "");
		int i = 0;
		while (true) {
			bsum = b_107.add(bsum);
		}
	}
}

// 281250001
// 125000000
// 289869954