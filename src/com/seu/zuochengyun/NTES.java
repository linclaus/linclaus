package com.seu.zuochengyun;

import java.util.ArrayList;
import java.util.Scanner;

public class NTES {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<Integer> N = new ArrayList<Integer>();
		ArrayList<Integer> T = new ArrayList<Integer>();
		ArrayList<Integer> E = new ArrayList<Integer>();
		ArrayList<Integer> S = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case 'n':
				N.add(i);
				break;
			case 't':
				T.add(i);
				break;
			case 'e':
				E.add(i);
				break;
			case 's':
				S.add(i);
				break;
			}
		}
		int count = 0;
		for (int i = 0; i < N.size(); i++) {
			for (int j = 0; j < T.size(); j++) {
				if (N.get(i) < T.get(j)) {
					for (int m = 0; m < E.size(); m++) {
						if (T.get(j) < E.get(m)) {
							for (int n = 0; n < S.size(); n++) {
								if (E.get(m) < S.get(n))
									count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
