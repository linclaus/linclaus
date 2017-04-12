package com.seu.算法;

import java.util.Arrays;

public class 最长公共子序列 {
	public static void main(String[] args) {
		String str1 = "1A2C3D4B56";
		String str2 = "B1D23CA45B6A";
		int[][] array = new int[str1.length()][str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				while (i < str1.length()) {
					array[i++][0] = 1;
				}
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == str1.charAt(0)) {
				while (i < str2.length()) {
					array[0][i++] = 1;
				}
			}
		}
		for(int i=1;i<str1.length();i++){
			for(int j=1;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)){
					array[i][j]=array[i-1][j-1]+1;
				}
				array[i][j]=Math.max(Math.max(array[i-1][j], array[i][j-1]),array[i][j]);
			}
		}
		for(int i=0;i<str1.length();i++){
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
