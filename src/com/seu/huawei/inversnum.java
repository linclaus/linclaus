package com.seu.huawei;

import java.util.Scanner;

public class inversnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		StringBuffer snum=new StringBuffer(num+"");
		System.out.println(snum.reverse());
	}
}
