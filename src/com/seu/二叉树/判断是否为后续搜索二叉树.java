package com.seu.二叉树;

import java.util.Scanner;

public class 判断是否为后续搜索二叉树 {
	public static void main(String[] args) {
		int[] array = {2,1,3,6,5,7,4};
		System.out.println(isPostArray(array, 0, array.length - 1));
	}

	public static boolean isPostArray(int[] array, int start, int end) {
		if(start==end)
			return true;
		int temp = array[end];
		int less = -1;
		int more = end;
		for (int i = start; i < end; i++) {
			if (temp > array[i])
				less = i;
			else {
				if (more == end)
					more = i;
			}
		}
		if (less == -1 || more == end) {
			return isPostArray(array, start, end - 1);
		}
		if (more - less != 1)
			return false;
		return isPostArray(array, start, less)
				&& isPostArray(array, more, end - 1);
	}
}
