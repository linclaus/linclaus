package com.seu.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {//5���˲μ�ѡƱ ��һλԤ�Ƶ�Ʊ5 �ڶ�λԤ�Ƶ�Ʊ1����λԤ�Ƶ�Ʊ11 ����λԤ�Ƶ�Ʊ6 ����λԤ�Ƶ�Ʊ8 ���һλӦ������Ʊ
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
