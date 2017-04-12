package com.seu.算法;

import java.util.Arrays;

public class 最长公共子串 {
	public static void main(String[] args) {
		String str1="abcbae";
		String str2="eabcba";
		int[][] array=new int[str1.length()][str2.length()];
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==str2.charAt(0))
				array[i][0]=1;
		}
		for(int i=0;i<str2.length();i++){
			if(str1.charAt(0)==str2.charAt(i))
				array[0][i]=1;
		}
		int max=0;
		for(int i=1;i<str1.length();i++){
			for(int j=1;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					array[i][j]=array[i-1][j-1]+1;
					max=Math.max(max, array[i][j]);
				}
			}
		}
		System.out.println(max);
		for(int i=0;i<str1.length();i++){
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
