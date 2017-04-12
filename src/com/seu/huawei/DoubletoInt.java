package com.seu.huawei;

import java.util.Scanner;

public class DoubletoInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double d=sc.nextDouble();
		String s=Math.floor(d+0.5)+"";
		System.out.println(s.split("\\.")[0]);
	}
}
