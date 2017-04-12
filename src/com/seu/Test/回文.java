package com.seu.Test;

import java.util.Scanner;

public class ╩ьнд {
	public static void main(String[] args) {
		System.out.println(new StringBuffer(123));
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s).reverse();
		
		int len=sb.length();
		char tmp=s.charAt(0);
		int res=0;
		for(int i=0;i<len;++i){
			int j=i;
			res=1;
			if(sb.charAt(i)==tmp){
				for(j=i+1;j<len;++j){
					if(sb.charAt(j)!=s.charAt(j-i))
						break;
					res++;
				}
			}
			if(j==len)
				break;
		}
		System.out.println(res);
	}
}
