package com.seu.huawei;

import java.util.Scanner;

public class inversestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			System.out.print(str.charAt(str.length()-i-1));
		}
	}
}
