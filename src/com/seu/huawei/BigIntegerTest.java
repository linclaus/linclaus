package com.seu.huawei;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerTest {
	public static void main(String[] args) {
		BigInteger bi=new BigInteger("12345678901234567890");
		bi.multiply(new BigInteger("2"));
		System.out.println(bi.bitCount());
		BigDecimal bd=new BigDecimal("12.523455");
		System.out.println(bd.plus());
		System.out.println(bi.toString(16));
	}
}
