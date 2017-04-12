package com.seu.java数据结构;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] table = new int[10];
		for (int i = 0; i < 10; i++) {
			table[i] = (int) (Math.random() * 100);
		}
		// insertSort(table);
		// shellInsertSort(table);
		// bubbleSort(table);
		// quickSort(table);
		// selectSort(table);
		heapSort(table);
		System.out.println(Arrays.toString(table));
	}

	public static void insertSort(int[] table) {
		for (int i = 1; i < table.length; i++) {
			int temp = table[i], j;
			for (j = i - 1; j >= 0 && temp < table[j]; j--)
				table[j + 1] = table[j];
			table[j + 1] = temp;
		}
	}

	public static void shellInsertSort(int[] table) {
		for (int delta = table.length / 2; delta > 0; delta /= 2) {
			for (int i = delta; i < table.length; i++) {
				int temp = table[i], j;
				for (j = i - delta; j >= 0 && temp < table[j]; j -= delta)
					table[j + delta] = table[j];
				table[j + delta] = temp;
			}
		}
	}

	public static void bubbleSort(int[] table) {
		for (int i = table.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (table[j] > table[j + 1]) {
					int temp = table[j];
					table[j] = table[j + 1];
					table[j + 1] = temp;
				}
			}
		}
	}

	public static void quickSort(int[] table) {
		quickSort(table, 0, table.length - 1);
	}

	private static void quickSort(int[] table, int begin, int end) {
		if (begin < end) {
			int i = begin, j = end;
			int temp = table[i];
			while (i != j) {
				while (i < j && table[j] >= temp)
					j--;
				if (i < j)
					table[i++] = table[j];
				while (i < j && table[i] <= temp)
					i++;
				if (i < j)
					table[j--] = table[i];
			}
			table[i] = temp;
			quickSort(table, begin, i - 1);
			quickSort(table, i + 1, end);
		}
	}

	public static void selectSort(int[] table) {
		for (int i = 0; i < table.length - 1; i++) {
			int min = table[i];
			int index = i;
			for (int j = i + 1; j < table.length; j++) {
				index = min > table[j] ? j : index;
				min = table[index];
			}
			table[index] = table[i];
			table[i] = min;
		}
	}

	public static void heapSort(int[] table) {
		for (int i = table.length / 2 - 1; i >= 0; i--) {
			sift(table, i, table.length - 1);
		}
		for (int i = 0; i < table.length; i++) {
			int temp = table[table.length - 1 - i];
			table[table.length - 1 - i] = table[0];
			table[0] = temp;
			sift(table, 0, table.length - 1);
		}
	}

	public static void sift(int[] table, int begin, int end) {
		int i = begin, j = 2 * i + 1;
		int temp = table[i];
		while (j <= end) {
			if (j < end && table[j] > table[j + 1])
				j++;
			if (temp > table[j]) {
				table[i] = table[j];
				i = j;
				j = 2 * i + 1;
			} else
				break;
		}
		table[i] = temp;
	}
}
