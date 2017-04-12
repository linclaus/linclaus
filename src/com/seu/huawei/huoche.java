package com.seu.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class huoche {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			int w = 20;
			int k = 0;
			Collections.sort(list);
			while (list.size() != 0) {
				for (int i = list.size() - 1; i >= 0; i--) {
					if (w >= list.get(i)) {
						w = w - list.remove(i);
					}
				}
				w = 20;
				k++;
			}
			System.out.println(k);
		}
	}

}
