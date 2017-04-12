package com.seu.zuochengyun;

import java.util.Scanner;

public class 是否2的幂次方 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  num=sc.nextInt();
		int count=0;
		int cnt=Integer.bitCount(num);
		while(num!=0){
			if(num%2==1)
				count++;
			num>>=1;
		}
		if(count==1&&cnt==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
