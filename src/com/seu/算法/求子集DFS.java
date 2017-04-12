package com.seu.算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 求子集DFS {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		ArrayList<int[]> result = new ArrayList<int[]>();
		int[] temp = new int[0];
		subset(array, 0, result, temp);
		for (int[] res : result) {
			System.out.println(Arrays.toString(res));
		}
	}

	public static void subset(int[] array, int level, ArrayList<int[]> result,
			int[] temp) {
		int[] tmp = temp.clone();
		if (level == array.length) {
			result.add(tmp.clone());
			return;
		}
		subset(array, level + 1, result, tmp);
		int[] ntmp=new int[tmp.length+1];
		for(int i=0;i<ntmp.length-1;i++){
			ntmp[i]=tmp[i];
		}
		ntmp[ntmp.length-1]=array[level];
		subset(array, level + 1, result, ntmp);
	}
}
