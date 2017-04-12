package com.seu.算法;

public class 最长公共子串改进 {
	public static void main(String[] args) {
		String str1="abcbae";
		String str2="eabcba";
		int max=0;
		int last=0;
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<Math.min(str1.length()-i, str2.length());j++){
				if(str1.charAt(i+j)==str2.charAt(j)){
					last++;
					max=Math.max(max, last);
				}
				else
					last=0;
			}
		}
		for(int i=0;i<str2.length();i++){
			for(int j=0;j<Math.min(str2.length()-i, str1.length());j++){
				if(str2.charAt(i+j)==str1.charAt(j)){
					last++;
					max=Math.max(max, last);
				}
				else
					last=0;
			}
		}
		System.out.println(max);
	}
}
