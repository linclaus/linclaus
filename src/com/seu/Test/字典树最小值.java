package com.seu.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ×ÖµäÊ÷×îĞ¡Öµ {
	static List<int[]> allSorts = new ArrayList<int[]>();

	public static void permutation(int[] nums, int start, int end) {

		if (start == end) {
			int[] newNums = new int[nums.length];
			for (int i = 0; i <= end; i++) {
				newNums[i] = nums[i];
			}
			if (isFlag(newNums)) {
				allSorts.add(newNums);
			}
		} else {
			for (int i = start; i <= end; i++) {
				int temp = nums[start];
				nums[start] = nums[i];
				nums[i] = temp;
				permutation(nums, start + 1, end);
				nums[i] = nums[start];
				nums[start] = temp;
			}
		}
	}

	public static void get(int n, int[] nums) {
		permutation(nums, 0, n - 1);
		Collections.sort(allSorts, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				String res = "";
				for (int i = 0; i < o1.length; i++) {
					res += o1[i];
				}
				String res1 = "";
				for (int i = 0; i < o2.length; i++) {
					res1 += o2[i];
				}
				return (res + res1).compareTo(res1 + res);
			}
		});
		for (int i = 0; i < n - 1; i++) {
			System.out.print(allSorts.get(0)[i] + " ");
		}
		System.out.println(allSorts.get(0)[n - 1]);
	}

	private static boolean isFlag(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] == a[i] + 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}
			get(n, nums);
		}
	}

}

//147 183 382 530 588 678 719 917 91
