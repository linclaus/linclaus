package com.seu.huawei;

import java.util.Scanner;
import java.util.TreeSet;

public class SortAndtreeset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int count = sc.nextInt();
			int[] receive = new int[count];
			for (int i = 0; i < count; i++) {
				receive[i] = sc.nextInt();
			}

			int[] sort = new SortAndtreeset().sort(receive);
			for (int i = 0; i < sort.length; i++) {
				System.out.println(sort[i]);
			}
		}
	}

	public int[] sort(int[] receive) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < receive.length; i++) {
			ts.add(receive[i]);
		}
		int[] sort = new int[ts.size()];
		for (int i = 0; i < sort.length; i++) {
			sort[i] = ts.pollFirst();
		}
		return sort;

	}
}
