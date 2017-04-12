package com.seu.算法;

import java.util.Scanner;

public class 动态规划之动态图 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a=1,b=0,c=1,d=0;
		long tempa,tempb,tempc,tempd;
//		int[][][] dp=new int[n+1][2][2];
//		dp[2][0][0]=1;
//		dp[2][0][1]=0;
//		dp[2][1][0]=1;
//		dp[2][1][1]=0;
		for(int i=3;i<=n;i++){
			tempa=a+2*c;
			tempb=b+2*d;
			tempc=a+c;
			tempd=b+2*d+c;
			a=tempa;
			b=tempb;
			c=tempc;
			d=tempd;
			
//			dp[i][0][0]=dp[i-1][0][0]+2*dp[i-1][1][0];
//			dp[i][0][1]=dp[i-1][0][1]+2*dp[i-1][1][1];
//			dp[i][1][0]=dp[i-1][0][0]+dp[i-1][1][0];
//			dp[i][1][1]=dp[i-1][0][1]+2*dp[i-1][1][1]+dp[i-1][1][0];
		}
//		for(int i=0;i<=n;i++){
//			System.out.println(dp[i][0][0]+" "+dp[i][0][1]+" "+dp[i][1][0]+" "+dp[i][1][1]);
//		}
//		System.out.println(3*dp[n][0][1]+6*dp[n][1][1]);
		System.out.println(3*a+6*c);
	}
}
