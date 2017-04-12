package com.seu.Test;

public class 不可变类形参问题 {
	public static void main(String[] args) {//和八大基本类型一样，都是值传，若要址传则要用数组[0]。
		String testString="shican";
		sfunc(testString);
		System.out.println("实参："+testString);
		
		Integer testInteger=1;
		ifunc(testInteger);
		System.out.println("实参："+testInteger);
	}
	
	public static void sfunc(String testString){
		testString="xingcan";
		System.out.println("形参："+testString);
	}
	public static void ifunc(Integer testInteger){
		testInteger=2;
		System.out.println("形参："+testInteger);
	}
}
