package com.seu.‘”∆ﬂ‘”∞À;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ≥£øºÀ„∑® {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.poll();
		list.push(1);
		list.pop();
		int[] array = new int[] { 4, 5, 3, 2, 7 };
		heapSort(array);
		mergeSort(array, 0, array.length - 1);
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
		System.out.println(binarySearch(array, 7));
	}

	public static void preOrder(BTreeNode root) {
		Stack<BTreeNode> stack = new Stack<>();
		BTreeNode temp = root;
		if (temp == null)
			return;
		stack.push(temp);
		while (!stack.isEmpty()) {
			temp = stack.pop();
			System.out.println(temp);
			if (temp.right != null)
				stack.push(temp.right);
			if (temp.left != null)
				stack.push(temp.right);
		}
	}

	public static void postOrder(BTreeNode root) {
		Stack<BTreeNode> stack1 = new Stack<BTreeNode>();
		Stack<BTreeNode> stack2 = new Stack<BTreeNode>();
		BTreeNode temp = root;
		if (root == null)
			return;
		stack1.push(temp);
		while (!stack1.isEmpty()) {
			temp = stack1.pop();
			stack2.push(temp);
			if (temp.left != null)
				stack1.push(temp.left);
			if (temp.right != null)
				stack2.push(temp.right);
		}
		while (!stack2.isEmpty())
			System.out.println(stack2.pop());
	}

	public static void inOrder(BTreeNode root) {
		Stack<BTreeNode> stack = new Stack<BTreeNode>();
		BTreeNode temp = root;
		if (temp == null)
			return;
		while (!stack.isEmpty() || temp != null) {
			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.println(temp);
				temp = temp.right;
			}
		}
	}

	public static boolean binarySearch(int[] array, int value) {
		int start = 0, end = array.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (array[mid] == value)
				return true;
			else if (array[mid] < value)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return false;
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

class Singleton {
	private static volatile Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
}

class BTreeNode {
	public BTreeNode right, left;
}
