package com.seu.huawei;

import java.util.Scanner;

public class LastWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] cs=str.split(" ");
		System.out.println(cs[cs.length-1].length());
	}
}
