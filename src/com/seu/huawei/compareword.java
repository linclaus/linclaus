package com.seu.huawei;

import java.util.Scanner;

public class compareword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String[] str=new String[num];
		for(int i=0;i<num;i++){
			str[i]=sc.next();
		}
		String tmp;
		for(int i=0;i<num;i++){
			for(int j=i;j<num;j++){
				if(str[i].compareTo(str[j])>0){
					tmp=str[i];
					str[i]=str[j];
					str[j]=tmp;
				}
			}
		}
		for(int i=0;i<num;i++){
			System.out.println(str[i]);
		}
	}
}
