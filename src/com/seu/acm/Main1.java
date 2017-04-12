package com.seu.acm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, num;
		DecimalFormat df = new DecimalFormat(".##");
		while (sc.hasNextLine()) {
			number = sc.nextInt();
			num = sc.nextInt();
			double inumber = number;
			double sum = Double.parseDouble(df.format(inumber));
			for (int j = 0; j < num - 1; j++) {
				sum += Double.parseDouble(df.format(Math.sqrt(inumber)));
				inumber = Double.parseDouble(df.format(Math.sqrt(inumber)));
			}
			System.out.println(df.format(sum));
		}
	}
}
