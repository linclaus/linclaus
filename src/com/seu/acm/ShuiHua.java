package com.seu.acm;

import java.util.Scanner;

public class ShuiHua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			boolean flag=false;
			for (int i = left; i < right + 1; i++) {
				if ((Math.pow(i / 100, 3) + Math.pow((i % 100)/10, 3) + Math.pow(
						i % 10, 3)) == i) {
					flag=true;
					System.out.print(i+" ");
				}
			}
			if(!flag)
				System.out.println("no");
			System.out.println();
		}
	}
}
