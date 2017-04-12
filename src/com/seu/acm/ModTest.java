package com.seu.acm;

import java.util.Scanner;

public class ModTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int mod=sc.nextInt();
		mod(str,mod);
	}
	public static void mod(String str,int mod){
		int mo=0;
		for(int i=0;i<str.length();i++){
			mo=mo*10+Integer.parseInt(str.charAt(i)+"");
			mo%=mod;
			System.out.print(mo+",");
		}
		System.out.println();
		System.out.println(mo);
	}
}
