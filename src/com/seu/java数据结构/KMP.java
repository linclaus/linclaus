package com.seu.java数据结构;

import java.util.Arrays;

public class KMP {
	public static void main(String[] args) {
		String str = new String("abcabdabcabcaa");
		int[] array = getNext1(str);
		System.out.println(Arrays.toString(array));
		System.out.println(indexOf(str, "cab", 0));
	}
	public static int indexOf(String target,String pattern,int begin){
		int i=begin,j=0;
		int[] next=getNext1(pattern);
		System.out.println(Arrays.toString(next));
		while(i<target.length()){
			if(j==-1||target.charAt(i)==pattern.charAt(j)){
				i++;
				j++;
			}else
				j=next[j];
			if(j==pattern.length())
				return i-j;
		}
		return -1;
	}

	public static int[] getNext1(String pattern) {
		int[] next = new int[pattern.length()];
		next[0] = -1;
		int k = -1;
		for (int i = 1; i < pattern.length(); i++) {
			while (true) {
				if (k == -1 || pattern.charAt(i-1) == pattern.charAt(k)) {
					k++;
					next[i] = k;
					break;
				} else
					k = next[k];
			}
			k=next[i];
		}
		return next;
	}

	public static int[] getNext(String pattern) {
		int[] next = new int[pattern.length()];
		next[0] = -1;
		int k = next[0], j = 0;
		while (j < pattern.length() - 1) {
			if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
				j++;
				k++;
				next[j] = k;
			} else
				k = next[k];
		}
		return next;
	}
}
