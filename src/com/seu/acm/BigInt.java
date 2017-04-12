package com.seu.acm;

import java.util.Scanner;

public class BigInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1<<31;
		int i1=0|i;
		System.out.println(i1);
		String s="7fffffff";
		System.out.println(Integer.parseInt(s, 16));
		int j=011;
		System.out.println(j);
		System.out.println(Integer.MAX_VALUE+","+i);
		
		long ll1=Integer.MAX_VALUE+1;
		System.out.println((int)ll1);
		long l=sc.nextLong();
		int high,low;
		System.out.println(Integer.bitCount(3));
		low=(int)l&Integer.MAX_VALUE;
		System.out.println(Integer.toBinaryString(low));
		long ll=1L<<31;
		
		System.out.println(ll);
		high=(int) (l>>31);
		System.out.println(high+","+low+","+l+","+Integer.MAX_VALUE+","+Long.MAX_VALUE);
	}
}
