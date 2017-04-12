package com.seu.Ëã·¨;

import java.util.ArrayList;

public class È«ÅÅÁĞDFS {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3 };
		boolean[] dp = new boolean[array.length];
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++){
			result.add(array[i]);
			pailie(array, i, dp, 0, result);
			result.remove(new Integer(array[i]));
		}
	}

	private static void pailie(int[] array, int i, boolean[] dp, int level,
			ArrayList<Integer> result) {
		if (level == array.length - 1) {
			System.out.println(result);
			return;
		}
		dp[i] = true;
		for (int j = 0; j < array.length; j++) {
			if (!dp[j]) {
				result.add(array[j]);
				pailie(array, j, dp, level + 1, result);
				result.remove(new Integer(array[j]));
			}
		}
		dp[i] = false;
	}

}
