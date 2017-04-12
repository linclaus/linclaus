package com.seu.Test;

import java.util.Scanner;

public class π……Ò {
	// public static void main(String[] args) {
	// int date;
	// Scanner sc = new Scanner(System.in);
	// while (sc.hasNext()) {
	// date = sc.nextInt();
	//
	// int price, priceDownNum;
	// priceDownNum = (int) (Math.sqrt(2 * date + 0.25) - 1.5);
	// price = date - 2 * priceDownNum;
	// System.out.println(price);
	// }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int sum = 0;
			int i = 1;
			int j=1;
			int result=4;
			while (sum <= n) {
				sum += i++;
				while(j<sum&&j<=n){
					j++;
					result++;
				}
				result-=2;
			}
			System.out.println(result);
		}
	}
}
