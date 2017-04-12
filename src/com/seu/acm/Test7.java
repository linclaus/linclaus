package com.seu.acm;

import java.util.StringTokenizer;

public class Test7 {
	public static void main(String[] args) {
		String str="a ";
		String str1="a ";
		int[] a={1,2,3};
		int[] b=a.clone();
		for(int bb:b){
			System.out.print(bb);
		}
		System.out.println(new String(b,0,0));
		System.out.println(str==str1);
		StringTokenizer st=new StringTokenizer("welcome,to,china welcome to",",");
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
