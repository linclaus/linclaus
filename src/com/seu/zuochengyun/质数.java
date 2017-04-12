package com.seu.zuochengyun;

import java.util.Scanner;

public class ÖÊÊı {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt=0;
		for(int i=2;i<num/2+1;i++){
			if(func(i)){
				if(func(num-i)){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	public static boolean func(int n) {
		int i = 2;
		while (n % i != 0 && i < n / 2 + 1)
			i++;
		if (i == n / 2 + 1) {
			return true;
		} else
			return false;
	}
}
