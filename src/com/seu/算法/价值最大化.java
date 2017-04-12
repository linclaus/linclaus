package com.seu.算法;

import java.util.Arrays;
import java.util.Scanner;

public class 价值最大化 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] desk = new int[n];
		int[][] customer = new int[m][2];
		for (int i = 0; i < n; i++) {
			desk[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			customer[i][0] = sc.nextInt();
			customer[i][1] = sc.nextInt();
		}
		Arrays.sort(desk);
		for (int i = 0; i < m - 1; i++) {
			int max = i;
			int[] temp;
			for (int j = i + 1; j < m; j++) {
				if (customer[max][1] < customer[j][1])
					max = j;
				if (customer[max][1] == customer[j][1]) {
					if (customer[max][0] > customer[j][0])
						max = j;
				}
			}
			temp = customer[max];
			customer[max] = customer[i];
			customer[i] = temp;
		}
		System.out.println(Arrays.toString(desk));
		int sum = 0;
		for (int i = 0; i < m; i++) {
			int j = 0;
			while (j < n) {
				if (desk[j] >= customer[i][0]) {
					desk[j] = 0;
					break;
				}
				j++;
			}
			if (j < n) {
				sum += customer[i][1];
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.print(Arrays.toString(customer[i])+" ");
		}
		System.out.println();
		System.out.println(sum);

	}
}
//3 5
//2 4 2
//1 3
//3 5
//3 7
//5 9
//1 10
