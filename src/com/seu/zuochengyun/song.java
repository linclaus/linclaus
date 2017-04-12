package com.seu.zuochengyun;

import java.util.Scanner;

public class song {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();
		int maxs = (l + 1) / (s + 1);
		int count=0;
		int res=n;
		if(maxs%13==0)
			maxs--;
		while(res!=0){
			if(res<=maxs){
				count++;
				break;
			}
			res-=maxs;
			count++;
		}
		System.out.println(count);
	}
}
