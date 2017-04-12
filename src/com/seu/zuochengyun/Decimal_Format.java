package com.seu.zuochengyun;
import java.text.DecimalFormat;

public class Decimal_Format {
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println(df.format(1110));
	}
}
