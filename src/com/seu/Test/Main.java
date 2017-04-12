package com.seu.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int T = Integer.parseInt(s);
		int count = 1;
		while (count <= T) {
			String str = sc.nextLine();
			String[] strs = str.split(" ");
			int n = Integer.parseInt(strs[0]);
			int m = Integer.parseInt(strs[1]);
			String[] astrs = new String[n];
			String[] bstrs = new String[m];
			for (int i = 0; i < n; i++) {
				astrs[i] = sc.nextLine();
			}
			for (int i = 0; i < m; i++) {
				bstrs[i] = sc.nextLine();
			}
			System.out.println("Case #" + count + ":");
			for (int i = 0; i < bstrs.length; i++) {
				int result = 0;
				for (int j = 0; j < astrs.length; j++) {
					if (astrs[j].length() >= bstrs[i].length()) {
						String st = astrs[j].substring(0, bstrs[i].length());
						if (st.equals(bstrs[i])) {
							result++;
						}
					}
				}
				System.out.println(result);
			}
			count++;
		}
		sc.close();
	}

}
