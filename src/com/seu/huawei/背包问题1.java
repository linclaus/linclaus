package com.seu.huawei;

import java.util.Scanner;
//1000 5
//800 2 0
//400 5 1
//300 5 1
//400 3 0
//500 2 0
public class ±≥∞¸Œ Ã‚1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int moneysum = sc.nextInt();
		int numsum = sc.nextInt();
		int[][] goods = new int[numsum][3];
		for (int i = 0; i < numsum; i++) {
			goods[i][0] = sc.nextInt();
			goods[i][1] = sc.nextInt();//*goods[i][0];
			goods[i][2] = 0;
		}
		get01PackageAnswer(goods, moneysum);
	}

	public static void get01PackageAnswer(int[][] goods, int bagsize) {
		int[][] bagMatrix = new int[goods.length][bagsize];
		for (int i = 0; i < bagsize; i++) {
			if (i + 1 >= goods[0][0])
				bagMatrix[0][i] = goods[0][1];
			for (int j = 1; j < goods.length; j++) {
				if(goods[j][2]==0){
					if (i + 1 - goods[j][0] > 0) {
						if (bagMatrix[j - 1][i - goods[j][0]]
								+ goods[j][1] > bagMatrix[j - 1][i])
							bagMatrix[j][i] = bagMatrix[j - 1][i
									- goods[j][0]]
									+ goods[j][1];
						else
							bagMatrix[j][i] = bagMatrix[j - 1][i];
					} else if (i + 1 - goods[j][0] == 0) {
						if (goods[j][1] > bagMatrix[j - 1][i])
							bagMatrix[j][i] = goods[j][1];
						else
							bagMatrix[j][i] = bagMatrix[j - 1][i];
					} else
						bagMatrix[j][i] = bagMatrix[j - 1][i];
				}else{
					if (i + 1 - goods[j][0]-goods[goods[j][2]][0] > 0) {
						if (bagMatrix[j - 1][i - goods[j][0]]
								+ goods[j][1] > bagMatrix[j - 1][i])
							bagMatrix[j][i] = bagMatrix[j - 1][i
									- goods[j][0]]
									+ goods[j][1];
						else
							bagMatrix[j][i] = bagMatrix[j - 1][i];
					} else if (i + 1 - goods[j][0] == 0) {
						if (goods[j][1] > bagMatrix[j - 1][i])
							bagMatrix[j][i] = goods[j][1];
						else
							bagMatrix[j][i] = bagMatrix[j - 1][i];
					} else
						bagMatrix[j][i] = bagMatrix[j - 1][i];
				}
			}
		}
		System.out.println(bagMatrix[bagMatrix.length-1][bagsize-1]);
	}
}

class PackageItem {
	String name;
	int weight;
	int value;

	public PackageItem(String name, int weight, int value) {
		this.name = name;
		this.value = value;
		this.weight = weight;
	}
}
