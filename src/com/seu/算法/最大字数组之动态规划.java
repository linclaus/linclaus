package com.seu.算法;
import java.util.Arrays;
import java.util.Scanner;

public class 最大字数组之动态规划 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] array=new int[length];
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		int[] dp=new int[length];
		dp[0]=array[0];
		for(int i=1;i<length;i++){
			dp[i]=Math.max(dp[i-1]+array[i], array[i]);
		}
		System.out.println(Arrays.toString(dp));
	}
}
