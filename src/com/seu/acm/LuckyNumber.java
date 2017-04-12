package com.seu.acm;

import java.util.Arrays;
import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int luckynum=sc.nextInt();
		int num=sc.nextInt();
		int[] arry=new int[num];
		for(int i=0;i<num;i++){
			arry[i]=sc.nextInt();
		}
		Arrays.sort(arry);
		int k=0;
		while(k<arry.length){
			if(luckynum>arry[k])
				break;
			k++;
		}
		int sum=0;
		for(int i=0;i<k;i++){
			if(luckynum%arry[i]==0)
				System.out.println("NO");
		}
	}
}
