package com.seu.算法;

import java.util.ArrayList;
import java.util.Scanner;

public class 必赢或必输 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		int begin = sc.nextInt();
		ArrayList<Integer> win = new ArrayList<Integer>();
		ArrayList<Integer> loss = new ArrayList<Integer>();
		loss.add(begin);
		for (int i = begin - 1; i >= 0; i--) {
			if (isLoss(i, loss, array)) {
				loss.add(i);
			} else {
				win.add(i);
			}
		}
		System.out.println("loss: " + loss.toString());
		System.out.println("win: " + win.toString());
		if (win.contains(0))
			System.out.println("先取必胜");
		else
			System.out.println("先取必败");
	}

	public static boolean isLoss(int num, ArrayList<Integer> loss, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (loss.contains(num + array[i])) {
				return false;
			}
		}
		return true;
	}
}
