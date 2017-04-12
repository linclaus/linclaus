package com.seu.Ëã·¨;

import java.util.Arrays;

public class È«ÅÅÁÐ {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2,3};
		pailie(array,0);
	}

	public static void pailie(int[] array, int index) {
		if (index >= array.length-1) {
			System.out.println(Arrays.toString(array));
			return;
		}
		for (int i = index; i < array.length; i++) {
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			pailie(array, index + 1);
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
	}
}
