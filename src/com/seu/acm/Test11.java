package com.seu.acm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		StringBuffer[] sb = new StringBuffer[num];
		for (int i = 0; i < num; i++) {
			sb[i] = new StringBuffer(sc.nextLine()).reverse();
		}
		Set<Character> set = new HashSet<Character>();
		T[] t = new T[10];
		for (int i = 0; i < t.length; i++) {
			t[i] = new T((char) ('A' + i));
		}
		for (int i = 0; i < sb.length; i++) {
			set.add(sb[i].charAt(sb[i].length() - 1));
			for (int j = 0; j < sb[i].length(); j++) {
				t[sb[i].charAt(j) - 'A'].ivalue += (Math.pow(10, j));
			}
		}
		List<T> list = new ArrayList<T>();
		for (int i = 0; i < t.length; i++)
			list.add(t[i]);
		Collections.sort(list);
		long sumt = 0;
		boolean flag = false;
		for (int i = 0; i < t.length; i++) {
			if (t[i].ivalue == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			for (int i = 0; i < list.size(); i++) {
				if (!set.contains(list.get(i).cvalue)) {
					list.get(i).ivalue = 0;
					break;
				}
			}
		}
		Collections.sort(list);
		for (int i = t.length - 1; i >= 0; i--) {
			sumt += (list.get(i).ivalue * (i));
		}
		System.out.println(sumt);
	}

	public static class T implements Comparable<T> {
		long ivalue;
		char cvalue;

		public T(char cvalue) {
			this.cvalue = cvalue;
		}

		public boolean equals(T obj) {
			// TODO Auto-generated method stub
			return this.ivalue==obj.ivalue;
		}

		@Override
		public int compareTo(T o) {
			if (this.ivalue > o.ivalue) {
				return (int)(this.ivalue - o.ivalue);
			}
			if (this.ivalue < o.ivalue) {
				return (int)(this.ivalue - o.ivalue);
			}
			return 0;
		}

	}
}
