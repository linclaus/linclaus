package com.seu.Test;

import java.util.Arrays;
import java.util.Scanner;

public class 用平方数个数最少表示 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] dp=new int[num+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=num;i++){
			dp[i]=Integer.MAX_VALUE;
			if(Math.pow((int)Math.sqrt(i),2)==i){
				dp[i]=1;
				continue;
			}
			int m,n;
			for(m=1,n=i-m;m<=n;m++,n--){
				dp[i]=Math.min(dp[m]+dp[n],dp[i]);
			}
		}
		System.out.println(Arrays.toString(dp));
	}
}
