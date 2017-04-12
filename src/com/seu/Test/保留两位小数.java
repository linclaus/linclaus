package com.seu.Test;

import java.text.DecimalFormat;

public class 保留两位小数 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00.0");

		double d1 = 13.53556;
		double d2 = 0.0;
		double d3 = 2.0;
		int i1=12;
		System.out.println(df.format(d1));
		System.out.println(df.format(d2));
		System.out.println(df.format(d3));
		System.out.println(df.format(i1));
	}
}
