package com.seu.算法;

import java.util.HashSet;
import java.util.Scanner;

public class 求子集位运算 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		HashSet<HashSet<Integer>> result = new HashSet<HashSet<Integer>>();
		int max = 1 << num;
		for (int i = 0; i < max; i++) {
			int[] index=find(i);
			HashSet<Integer> hs=new HashSet<Integer>();
			for(int j:index){
				hs.add(array[j]);
			}
			result.add(hs);
		}
		for(HashSet<Integer> res:result){
			System.out.println(res);
		}
	}

	public static int[] find(int num) {
		int n = Integer.bitCount(num);
		int[] index = new int[n];
		int i = 0;
		int j = 0;
		while (num > 0) {
			if ((num & 1) == 1) {
				index[i++] = j;
			}
			num = num >> 1;
			j++;
		}
		return index;
	}
}
