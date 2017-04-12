package com.seu.acm;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		divide(a, b);
	}

	public static void divide(String a, int b) {
		int mod = 0;
		String answer = "";
		for (int i = 0; i < a.length(); i++) {
			mod = mod * 10 + Integer.parseInt(a.charAt(i) + "") % b;
			answer += mod / b;
			mod = mod % b;
		}
		int i = 0;
		while (answer.charAt(i) == '0' && i < answer.length()-1) {
			i++;
		}
		if (i == answer.length()-1&&answer.charAt(i)=='0')
			answer = "0";
		else
			answer = answer.substring(i);
		System.out.println(answer);
		System.out.println(mod);
	}
}
