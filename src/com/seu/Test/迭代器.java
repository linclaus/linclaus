package com.seu.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class µü´úÆ÷ {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			if (it.next() == 1)
				it.remove();
		}
		System.out.println(al);
	}
}
