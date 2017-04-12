package com.seu.Test;

public class StringReverse{
	public static void main(String[] args) {
		int ii = 97;
		char a = (char) ii;
		a = 97;
		System.out.println(a);
		int i;
		for (i = 0; i < 5; System.out.println(i), i++) {
			if (i == 2)
				continue;

		}
		String str = "abcdefg";
		System.out.println(reverse(str.toCharArray(), 0, str.length() - 1));
		System.out.println(rev(str,1));
	}

	public static String reverse(char[] cstr, int start, int end) {
		if (start <= end) {
			char temp = cstr[start];
			cstr[start] = cstr[end];
			cstr[end] = temp;
		} else
			return new String(cstr);
		return reverse(cstr, start + 1, end - 1);
	}

	public static String rev(String str, int cnt) {
		if (cnt < str.length()) {
			str = str.substring(0, cnt - 1) + str.charAt(str.length() - 1)
					+ str.substring(cnt - 1, str.length() - 1);
		}else
			return str;
		return rev(str, cnt + 1);
	}
}

class A {
	int i;
	{
		this.i = 1;
	}
	public void fun(){
		
	}
}

class B extends A {
	{
		this.i = 1;
	}
	public void func(){
		super.fun();
	}
	public static void main(String[] args) {
	}
}
