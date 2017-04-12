package com.seu.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {//5个人参加选票 第一位预计得票5 第二位预计得票1第三位预计得票11 第四位预计得票6 第五位预计得票8 求第一位应该拉几票
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum;
		while(sc.hasNextLine()){
			sum=sc.nextInt();
			int number=sc.nextInt();
			int[] num=new int[sum-1];
			for(int i=0;i<sum-1;i++){
				num[i]=sc.nextInt();
			}
			Arrays.sort(num);
			int n=number;
			while(n<=num[sum-2]){
				n++;
				num[sum-2]--;
				Arrays.sort(num);
			}
			System.out.println(n-number);
		}
	}
	
}
