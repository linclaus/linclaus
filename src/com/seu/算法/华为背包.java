package com.seu.算法;

import java.util.Scanner;

public class 华为背包 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int moneysum = sc.nextInt();
		int goodsum = sc.nextInt();
		int[][] goods = new int[goodsum][3];
		for (int i = 0; i < goodsum; i++) {
			goods[i][0] = sc.nextInt();
			goods[i][1] = sc.nextInt() * goods[i][0];
			goods[i][2] = sc.nextInt();
		}
		System.out.println(Maxvalue(goods,moneysum));
	}

	static int Maxvalue(int[][] goods, int moneysum) {
		int[][] state = new int[goods.length + 1][moneysum + 1];
		for (int i = 1; i < state.length; i++) {
			for (int j = 1; j <= moneysum; j++) {
				if (goods[i - 1][2] == 0) {
					if (j - goods[i - 1][0] >= 0) {
						state[i][j] = Math.max(state[i - 1][j], state[i - 1][j
								- goods[i - 1][0]]
								+ goods[i - 1][1]);
					} //else {
//						state[i][j] = state[i - 1][j];
//					}
				} else {
					if (j - goods[i - 1][0] - goods[goods[i - 1][2]][0] >= 0) {
						state[i][j] = Math.max(state[i - 1][j], state[i - 1][j
								- goods[i - 1][0]]
								+ goods[i - 1][1]);
					} //else {
//						state[i][j] = state[i - 1][j];
//					}
				}
			}
		}
		return state[state.length-1][moneysum];
	}
}