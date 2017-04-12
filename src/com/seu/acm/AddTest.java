package com.seu.acm;

import java.util.Scanner;

public class AddTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(add(a, b));
	}

	public static String add(String a, String b) {
		StringBuffer sba = new StringBuffer(a);
		StringBuffer sbb = new StringBuffer(b);
		a = sba.reverse().toString();
		b = sbb.reverse().toString();
		int[] sum = new int[Math.max(a.length(), b.length()) + 1];
		int i = 0;
		while (i < Math.min(a.length(), b.length())) {
			sum[i] = Integer.parseInt(a.charAt(i) + "")
					+ Integer.parseInt(b.charAt(i) + "");
			i++;
		}
		while (i < a.length()) {
			sum[i] = Integer.parseInt(a.charAt(i) + "");
			i++;
		}
		while (i < b.length()) {
			sum[i] = Integer.parseInt(b.charAt(i) + "");
			i++;
		}
		int c=0;
		for(int j=0;j<sum.length;j++){
			sum[j]+=c;
			c=sum[j]/10;
			sum[j]%=10;
		}
		String ssum = "";
		for (int j = sum.length - 1; j >= 0; j--) {
			ssum += sum[j];
		}
		if(ssum.charAt(0)=='0')
			ssum=ssum.substring(1);
		return ssum;
	}
}
