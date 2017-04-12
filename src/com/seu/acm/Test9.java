package com.seu.acm;

public class Test9 {
	public static void main(String[] args) {
		Integer a=new Integer(0);
		Integer b=a;
		b=1;
		int[] ia={0};
		int[] ib=ia;
		ib[0]=1;
		System.out.println(ia[0]);
		System.out.println(a);
	}
}
