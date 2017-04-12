package com.seu.Test;

import java.util.Arrays;

public class ÅÅĞòÈıÖÖ {
	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 3, 2, 7 };
		heapSort(array);
//		mergeSort(array, 0, array.length - 1);
//		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int mid = quickFind(array, start, end);
			quickSort(array, start, mid);
			quickSort(array, mid + 1, end);
		}
	}

	private static int quickFind(int[] array, int start, int end) {
		int temp = array[start];
		int i = start, j = end;
		while (i < j) {
			while (i < j && array[j] > temp)
				j--;
			if (i < j)
				array[i] = array[j];
			while (i < j && array[i] <= temp)
				i++;
			if (i < j)
				array[j] = array[i];
		}
		array[j] = temp;
		return j;
	}

	public static void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}

	private static void merge(int[] array, int start, int mid, int end) {
		int[] array1 = new int[mid - start + 1];
		int[] array2 = new int[end - mid];
		for (int i = 0; i < array1.length; i++)
			array1[i] = array[start + i];
		for (int i = 0; i < array2.length; i++)
			array2[i] = array[mid + 1 + i];
		int i = 0, j = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j])
				array[start++] = array1[i++];
			else
				array[start++] = array2[j++];
		}
		while (i < array1.length)
			array[start++] = array1[i++];
		while (j < array2.length)
			array[start++] = array2[j++];
	}

	public static void heapSort(int[] array) {
		int len = array.length;
		for (int i = len / 2 - 1; i >= 0; i--)
			adjustHeap(array, i, len - 1);
		for (int i = len - 1; i >= 0; i--) {
			adjustHeap(array, 0, i);
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
		}
	}

	private static void adjustHeap(int[] array, int i, int len) {
		int child;
		int temp = array[i];
		while (i <= len) {
			child = 2 * i + 1;
			if (child + 1 <= len && array[child] > array[child + 1])
				child = child + 1;
			if (child <= len && array[i] > array[child])
				array[i] = array[child];
			else
				break;
			i = child;
		}
		array[i] = temp;
	}
}
