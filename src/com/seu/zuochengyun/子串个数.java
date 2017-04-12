package com.seu.zuochengyun;

import java.util.Scanner;

public class ×Ó´®¸öÊý {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int cnt=0;
		int index=str1.indexOf(str2);
		while(index!=-1){
			cnt++;
			str1=str1.substring(index+str2.length());
			index=str1.indexOf(str2);
		}
		System.out.println(cnt);
	}
}
