package com.seu.Test;

import java.util.Scanner;

public class tu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		while(sc.hasNextLine()){
			String temp=sc.nextLine();
			if(temp.equals(""))
				break;
			str+=temp;
		}
		String result="";
		int num=0;
		for(int i=0;i<str.length();){
			int cnt1=0;
			while(i<str.length()&&str.charAt(i)!=' '){
				cnt1++;
				result+=str.charAt(i++);
			}
			int cnt2=0;
			while(i<str.length()&&str.charAt(i)==' '){
				i++;
				cnt2++;
			}
			if(cnt2>num){
				while(cnt2>num){
					result+="(";
					cnt2--;
				}
				num++;
			}else if(cnt2==num){
				result+=",";
			}else{
				while(cnt2<num){
					result+=")";
					num--;
				}
				result+=",";
			}
		}
		System.out.println(result.substring(0,result.length()-1));
	}
}
