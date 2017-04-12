package com.seu.Test;

import java.util.Scanner;

public class À¨ºÅ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			int left = n, right = n;
			String result = "";
			if (n > 0)
				func(result, left, right);
			if(n==0)
				System.out.println();
			System.out.println();
		}
	}

	public static void func(String result, int left, int right) {
		if (left == 0 && right == 0) {
			System.out.println(result);
			return;
		}
		if (left == 0) {
			for (int t = 0; t < right; t++)
				result += ")";
			System.out.println(result);
			return;
		}
		if (left == right) {
			func(result + "(", left - 1, right);
		}
		if (left < right) {
			func(result + "(", left - 1, right);
			func(result + ")", left, right - 1);
		}
	}
}
