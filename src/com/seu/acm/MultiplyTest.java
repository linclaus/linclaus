package com.seu.acm;

import java.util.Scanner;

public class MultiplyTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.println(multiply(a,b));
	}
	public static String multiply(String a,String b){
		StringBuffer sba=new StringBuffer(a);
		StringBuffer sbb=new StringBuffer(b);
		sba.reverse();
		sbb.reverse();
		int[] answer=new int[sba.length()+sbb.length()];
		for(int i=0;i<sba.length();i++){
			for(int j=0;j<sbb.length();j++){
				answer[i+j]+=Integer.parseInt(sba.charAt(i)+"")*Integer.parseInt(sbb.charAt(j)+"");
			}
		}
		translate(answer);
		String ans="";
		for(int i=answer.length-1;i>=0;i--){
			ans+=answer[i];
		}
		if(ans.charAt(0)=='0')
			ans=ans.substring(1);
		return ans;
	}
	public static void translate(int[] answer){
		int c=0;
		for(int i=0;i<answer.length;i++){
			answer[i]+=c;
			c=answer[i]/10;
			answer[i]%=10;
		}
	}
}
