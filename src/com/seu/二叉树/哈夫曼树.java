package com.seu.¶þ²æÊ÷;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ¹þ·òÂüÊ÷ {
	static int length = 0;

	static class HafumanTree implements Comparable<HafumanTree> {
		HafumanTree left;
		HafumanTree right;
		int power;
		char value;

		public HafumanTree() {

		}
		public HafumanTree(HafumanTree left, HafumanTree right, int power,char value) {
			super();
			this.left = left;
			this.right = right;
			this.power = power;
			this.value=value;
		}
		public HafumanTree(HafumanTree left, HafumanTree right, int power) {
			super();
			this.left = left;
			this.right = right;
			this.power = power;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return power + "";
		}

		@Override
		public int compareTo(HafumanTree o) {
			// TODO Auto-generated method stub
			return this.power - o.power;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			length = 0;
			String str = sc.nextLine();
			TreeMap<Character, Integer> treemap = new TreeMap<Character, Integer>();
			for (int i = 0; i < str.length(); i++) {
				if (!treemap.containsKey(str.charAt(i)))
					treemap.put(str.charAt(i), 1);
				else {
					int value = treemap.get(str.charAt(i));
					treemap.put(str.charAt(i), value + 1);
				}
			}
			Set<Entry<Character, Integer>> entryset = treemap.entrySet();
			Iterator<Entry<Character, Integer>> iterator = entryset.iterator();
			ArrayList<HafumanTree> arraylist = new ArrayList<HafumanTree>();
			for (int i = 0; iterator.hasNext(); i++) {
				Entry<Character, Integer> next = iterator.next();
				arraylist.add(new HafumanTree(null, null, next.getValue(),next.getKey()));
			}
			while (arraylist.size() > 1) {
				Collections.sort(arraylist);
				HafumanTree h1 = arraylist.get(0);
				HafumanTree h2 = arraylist.get(1);
				HafumanTree h3 = new HafumanTree(h1, h2, h1.power + h2.power);
				arraylist.remove(0);
				arraylist.remove(0);
				arraylist.add(h3);
			}
			HafumanTree root = arraylist.remove(0);
			function(root, 0,"");
			System.out.println();
			System.out.println(length);
		}
	}

	public static void function(HafumanTree tree, int count,String bianma) {
		String str=bianma;
		if (tree == null) {
			return;
		}
		if (tree.left == null && tree.right == null) {
			length += (tree.power * count);
			System.out.print(tree.value+"("+tree.power+":"+str+")"+" ");
		}
		function(tree.left, count + 1,str+"0");
		function(tree.right, count + 1,str+'1');
	}
}
