package com.seu.算法;

public class 可重复排列 {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		pailie(array, 0, "");
	}

	public static void pailie(int[] array, int index, String result) {
		if (index >= array.length) {
			System.out.println(result);
			return;
		}
		String temp = new String(result);
		for (int i = 0; i < array.length; i++) {
			temp += array[i];
			pailie(array, index + 1, temp);
			temp = temp.substring(0, temp.length() - 1);
		}
	}
}
