package com.seu.zuochengyun;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class 两两之和为定值 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++) {
			if (set.contains(20 - array[i])) {
				System.out.println(array[i] + "," + (20 - array[i]));
			} else
				set.add(array[i]);
		}
	}
}
