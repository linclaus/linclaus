package com.seu.Test;

import java.util.Arrays;
import java.util.Scanner;

public class ¹ÉÆ± {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] split = str.split(",");
		int[] array = new int[split.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(split[i]);
		}
		int[] max = new int[array.length];
		int[] min = new int[array.length];
		min[0] = array[0];
		max[array.length - 1] = array[array.length - 1];
		for (int i = 1; i < array.length; i++) {
			min[i] = Math.min(array[i], min[i - 1]);
			max[array.length - i - 1] = Math.max(array[array.length - 1 - i],
					max[array.length - i]);
		}
		System.out.println(Arrays.toString(min));
		System.out.println(Arrays.toString(max));
		int result=0;
		for(int i=0;i<array.length;i++){
			result=Math.max(result, max[i]-min[i]);
		}
		System.out.println(result);
	}
}
