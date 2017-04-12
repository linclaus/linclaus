package com.seu.ÔÓÆßÔÓ°Ë;

import java.util.Arrays;

public class Í¼±éÀú {
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 ,3};
		int[][] graph={{0,1,2,3},{1,0,4,5},{2,4,0,2},{3,5,2,0}};
		pailie(array, 0,graph);
		System.out.println(min);
	}

	public static void pailie(int[] array, int index,int[][] graph) {
		if (index >= array.length - 1) {
			System.out.println(Arrays.toString(array));
			min=Math.min(min, graph[array[0]][array[1]]+graph[array[1]][array[2]]+graph[array[2]][array[3]]);
			return;
		}
		for (int i = index; i < array.length; i++) {
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			pailie(array, index + 1,graph);
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
	}
}
