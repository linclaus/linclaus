package com.seu.Test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l1, l2, s1, s2, r1;
		while (sc.hasNext()) {
			l1 = sc.nextLine();
			l2 = new StringBuffer(l1).reverse().toString();
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			r1 = ".*";
			for (int i = 0; i < s1.length(); i++) {
				r1 += s1.charAt(i) + ".*";
			}
			for (int i = 0; i < s2.length(); i++) {
				r1 += s2.charAt(i) + ".*";
			}
			if (l1.matches(r1) && l2.matches(r1)) {
				System.out.println("both");
			} else if (l1.matches(r1) && !l2.matches(r1)) {
				System.out.println("forward");
			} else if (!l1.matches(r1) && l2.matches(r1)) {
				System.out.println("backward");
			} else {
				System.out.println("invalid");
			}
		}
	}
}
