package com.seu.huawei;

import java.util.Scanner;

public class supersubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num=sc.nextInt();
			String str="";
			String[] strs=new String[num];
			for(int i=0;i<num;i++){
				str=str+sc.next();
			}
			char c=str.charAt(str.length()-1);
			str=str.substring(0,str.length()-1);
			while(str.contains(c+"")){
				c=str.charAt(str.length()-1);
				str=str.substring(0,str.length()-1);
			}
			str=str+c;
			c=str.charAt(0);
			str=str.substring(1);
			while(str.contains(c+"")){
				c=str.charAt(0);
				str=str.substring(1);
			}
			str=c+str;
			System.out.println(str);
		}
	}
}
