package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 最小编辑代价 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int icount = 5;
		int dcount = 3;
		int rcount = 2;
		String str1 = "ab12cd3";
		String str2 = "abcdf";
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<=str2.length();i++){
			dp[0][i]=icount*i;
		}
		for(int i=0;i<=str1.length();i++){
			dp[i][0]=dcount*i;
		}
		for(int i=1;i<=str1.length();i++){
			for(int j=1;j<=str2.length();j++){
				dp[i][j]=Math.min(dp[i-1][j]+dcount, dp[i][j-1]+icount);
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j]=Math.min(dp[i][j], dp[i-1][j-1]);
				}else{
					dp[i][j]=Math.min(dp[i][j], dp[i-1][j-1]+rcount);
				}
			}
		}
		for(int i=0;i<dp.length;i++){
			System.out.println(Arrays.toString(dp[i]));
		}
	}
}
