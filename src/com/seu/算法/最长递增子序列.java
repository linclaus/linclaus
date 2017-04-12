package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 最长递增子序列 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] array=new int[num];
		for(int i=0;i<num;i++){
			array[i]=sc.nextInt();
		}
		int[] dp=new int[num];
		for(int i=0;i<num;i++){
			dp[i]=1;
			for(int j=0;j<i;j++){
				if(array[i]>array[j]){
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
	}
}
