package com.seu.zuochengyun;

import java.util.Scanner;

public class HanNoProblem {
	private static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			count=0;
			int i = sc.nextInt();
			move(i - 1, 0);
			System.out.println(count);
		}
	}

	public static void move(int i, int flag) {
		if (i <= 1 && flag != 0) {
			if (i < 1)
				return;
			switch (flag) {
			case 1:
				System.out.println("move 1 from left to mid");
				System.out.println("move 1 from mid to right");
				count += 2;
				break;
			case 2:
				System.out.println("move 1 from right to mid");
				System.out.println("move 1 from mid to left");
				count += 2;
				break;
			}
			return;
		} else {
			move(i - 1, 1);
			System.out.println("move " + i + " from left to mid");
			count++;
			move(i - 1, 2);
			System.out.println("move " + i + " from mid to right");
			count++;
			move(i - 1, 1);
			System.out.println("move " + (i + 1) + " from left to mid");
			count++;
			move(i - 1, 2);
			System.out.println("move " + i + " from right to mid");
			count++;
			move(i - 1, 1);
			System.out.println("move " + i + " from mid to left");
			count++;
			move(i - 1, 2);
			System.out.println("move " + (i + 1) + " from mid to right");
			count++;
			move(i - 1, 1);
			System.out.println("move " + i + " from left to mid");
			count++;
			move(i - 1, 2);
			System.out.println("move " + i + " from mid to right");
			count++;
			move(i - 1, 1);
		}
	}
}
