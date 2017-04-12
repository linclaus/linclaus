package com.seu.Test;

import java.util.Scanner;

public class 最大奇数约束 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		int temp=N;
		while(temp!=0){
			for(int i=1;i<=temp;i+=2){
				sum+=i;
			}
			temp/=2;
		}
		System.out.println(sum);
	}
}
//333333333334181226 3333333333471362 13333333333471362 53333333333471362