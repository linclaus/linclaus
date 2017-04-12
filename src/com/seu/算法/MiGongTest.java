package com.seu.Ëã·¨;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Step {
	int x, y;

	public Step(int x, int y) {
		this.x = x;// ºá×ø±ê
		this.y = y;// ×Ý×ø±ê
	}
}
//3
//0 1 1
//0 0 1
//0 0 1
public class MiGongTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] array = new int[n + 2][n + 2];
		for (int i = 0; i < array.length; i++) {
			array[0][i] = 1;
			array[array.length - 1][i] = 1;
			array[i][0] = 1;
			array[i][array.length - 1] = 1;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++)
			System.out.println(Arrays.toString(array[i]));

		int[][] move = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
		Stack<Step> stack = new Stack<Step>();
		stack.push(new Step(1, 1));
		lable: while (!stack.isEmpty()) {
			Step temp = stack.pop();
			for (int k = 0; k < 4; k++) {
				int i = temp.x + move[k][0];
				int j = temp.y + move[k][1];
				if (array[i][j] == 0) {
					if (i == n && j == n) {
						System.out.println("Success");
						break lable;
					}
					temp = new Step(i, j);
					stack.push(temp);
					array[i][j] = 1;
					k = -1;
				} 
			}
		}
		if(stack.isEmpty())
			System.out.println("Failure");
	}
}
