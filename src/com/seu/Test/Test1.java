package com.seu.Test;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		int n = sc.nextInt();
		int m = sc.nextInt();
		double sqrtn = n;
		double sum = 0;
		for (int i = 0; i < m; i++) {
			sum += sqrtn;
			sqrtn = Math.sqrt(sqrtn);
		}
		System.out.print(df.format(sum));
	}
}
