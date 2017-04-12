package com.seu.huawei;

import java.util.Scanner;

public class Containchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ch=sc.next();
		char c=ch.charAt(0);
		char[] cs=str.toCharArray();
		int num=0;
		for(int i=0;i<cs.length;i++){
			if(cs[i]==c)
				num++;
		}
		System.out.println(num);
	}
}
