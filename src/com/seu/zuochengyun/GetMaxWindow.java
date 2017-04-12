package com.seu.zuochengyun;

import java.util.LinkedList;
import java.util.Scanner;

public class GetMaxWindow {
	public static void main(String[] args) {
		int[] array = { 4, 3, 5, 4, 3, 3, 6, 7 };
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < array.length; i++) {
			while (!ll.isEmpty() && i - ll.peekFirst() > w)
				ll.pollFirst();
			while (!ll.isEmpty() && array[ll.peekLast()] <= array[i])
				ll.pollLast();
			ll.add(i);
			if (i >= w - 1)
				System.out.print(array[ll.peekFirst()]+" ");
		}
	}
}
