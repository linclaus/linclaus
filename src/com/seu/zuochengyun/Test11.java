package com.seu.zuochengyun;

public class Test11 {
	private int test;
	private void fun() {
		new Test11().test=1;
	}
	public static void main(String[] args) {
		int n = 1147483648;
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MIN_VALUE);
		System.out.println(function(n));
	}

	public static int function(int n) {
		String str = n + "";
		String result = "";
		if (n == Integer.MIN_VALUE)
			result = "0";
		else if (str.contains("-")) {
			result = "-";
			for (int i = str.length() - 1; i > 0; i--) {
				result += str.charAt(i);
			}
		} else {
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
		}
		try {
			Integer.parseInt(result);
			return Integer.parseInt(result);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
