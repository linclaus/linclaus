package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 增加最少字符使成回文串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[][] array = new int[str.length()][str.length()];
		for (int i = 1; i < str.length(); i++) {
			array[i - 1][i] = str.charAt(i - 1) == str.charAt(i) ? 0 : 1;
			for (int j = i - 2; j > -1; j--) {
				if (str.charAt(i) == str.charAt(j)) {
					array[j][i] = array[j + 1][i - 1];
				} else {
					array[j][i] = Math.min(array[j + 1][i], array[j][i - 1]) + 1;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println(array[0][str.length() - 1]);

		char[] result=new char[str.length()+array[0][str.length()-1]-1];
		int i=0;
		int j=str.length()-1;
		int resl=0;
		int resr=result.length-1;
		while(i<j){
			if(str.charAt(i)==str.charAt(j)){
				result[resl++]=str.charAt(i++);
				result[resr--]=str.charAt(j--);
			}else if(array[i][j-1]<array[i+1][j]){
				result[resl++]=str.charAt(j);
				result[resr--]=str.charAt(j--);
			}else{
				result[resl++]=str.charAt(i);
				result[resr--]=str.charAt(i++);
			}
		}
		System.out.println(new String(result));
	}
}
