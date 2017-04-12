package com.seu.huawei;

import java.util.Scanner;

public class Stringfor8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		while(true){
			if(str1.length()>8){
				System.out.println(str1.subSequence(0, 8));
				str1=str1.substring(8);
			}else{
				str1=str1+"0000000";
				System.out.println(str1.subSequence(0, 8));
				break;
			}
		}
		while(true){
			if(str2.length()>8){
				System.out.println(str2.subSequence(0, 8));
				str2=str2.substring(8);
			}else{
				str2=str2+"0000000";
				System.out.println(str2.subSequence(0, 8));
				break;
			}
		}
	}
}
