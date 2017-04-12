package com.seu.Ëã·¨;

import java.util.Arrays;

public class ¶ÑÅÅĞò {
	public static void main(String[] args) {
		int[] array = { 6, 4, 8, 5, 9, 1, 3 };
		minHeapSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void minHeapSort(int[] array) {
		int i = array.length / 2 - 1;
		while (i >= 0)
			adjustHeap(array, i--, array.length - 1);
		for (i = array.length - 1; i >= 0; i--) {
			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;
			adjustHeap(array, 0, i-1);
		}
	}

	public static void adjustHeap(int[] array, int start, int end) {
		int temp;
		int childIndex;
		for (temp = array[start]; 2 * start + 1 <= end; start = childIndex) {
			childIndex = 2 * start + 1;
			if (childIndex < end && array[childIndex] > array[childIndex + 1])
				childIndex++;
			if (temp > array[childIndex])
				array[start] = array[childIndex];
			else
				break;
		}
		array[start]=temp;
	}
}
