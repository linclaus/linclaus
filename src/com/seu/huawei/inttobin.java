package com.seu.huawei;

import java.util.Scanner;

public class inttobin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str=Integer.toBinaryString(num);
		char[] cs=str.toCharArray();
		int sum=0;
		for(int i=0;i<cs.length;i++){
			sum+=Integer.parseInt(cs[i]+"");
		}
		System.out.println(sum);
	}
}
