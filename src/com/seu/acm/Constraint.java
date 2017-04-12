package com.seu.acm;

import java.util.HashSet;
import java.util.Scanner;


public class Constraint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] constraints = new String[num];
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < num; i++) {
			constraints[i] = sc.nextLine();
			for (int j = 0; j < constraints[i].length(); j++) {
				if (constraints[i].charAt(j) <= 'Z'
						&& constraints[i].charAt(j) >= 'A') {
					hs.add(constraints[i].charAt(j));
				}
			}
		}
		num = sc.nextInt();
		sc.nextLine();
		String str;
		for (int m = 0; m < num; m++) {
			String[] constraint = constraints.clone();
			boolean out = false;
			for (int j = 0; j < hs.size(); j++) {
				str = sc.next();
				String replace = new String(sc.next());
				for (int k = 0; k < constraint.length; k++) {
					constraint[k] = constraint[k].replace(str, replace);
				}
			}

			for (int i = 0; i < constraint.length; i++) {
				String[] ss = constraint[i].split("<");
				boolean[] flag = new boolean[ss.length];
				for (int j = 0; j < ss.length; j++) {
					if (ss[j].contains("=")) {
						ss[j] = ss[j].replace("=", "");
						flag[j - 1] = true;
					}
				}
				for (int j = 0; j < ss.length - 1; j++) {
					int num1 = Integer.parseInt(ss[j]);
					int num2 = Integer.parseInt(ss[j + 1]);
					if (num1 > num2 || (num1 == num2 && !flag[j])) {
						out = true;
						break;
					}
				}
				if (out)
					break;
			}
			if (out)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
//2
//A<B<=E
//3<E<=5
//2
//A 2
//B 3
//E 5
//A 3
//B 1
//E 5
//