package com.seu.À„∑®;

import java.util.Scanner;

public class √‘π¨ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] array = new int[R][C];
		int[][] dp = new int[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		boolean flag = func(0, 0, array);
		System.out.println(flag);
	}

	public static boolean func(int i, int j, int[][] array) {
		array[i][j]=1;
		boolean flag = false;
		if(i==array.length-1&&j==array[0].length-1)
			flag=true;
		if (!flag && i - 1 >= 0 && array[i - 1][j] != 1) {
			flag = func(i - 1, j, array);
		}
		if (!flag && i + 1 < array.length && array[i + 1][j] != 1) {
			flag = func(i + 1, j, array);
		}
		if (!flag && j - 1 >= 0 && array[i][j - 1] != 1) {
			flag = func(i, j - 1, array);
		}
		if (!flag && j + 1 < array.length && array[i][j + 1] != 1) {
			flag = func(i, j + 1, array);
		}
		return flag;
	}
}
