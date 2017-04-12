package com.seu.ÔÓÆßÔÓ°Ë;

import java.util.ArrayList;
import java.util.Arrays;

public class ÁÚ½Ó¾ØÕó±éÀú {
	public static void main(String[] args) {
		int[][] graph = { { 0, 1, 2, 3 }, { 1, 0, 4, 5 }, { 2, 4, 0, 2 },
				{ 3, 5, 2, 0 } };
		ArrayList<int[]> path = new ArrayList<int[]>();
		boolean[] dp = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			graphDFS(i, graph, dp, 0, path,0);
		}
	}

	public static void graphDFS(int i, int[][] graph, boolean[] dp,
			int level, ArrayList<int[]> path,int sum) {
		if (level == graph.length - 1) {
			for (int[] p : path) {
				System.out.print(Arrays.toString(p));
			}
			System.out.println(sum);
			return;
		}
		dp[i] = true;
		for (int j = 0; j < graph[0].length; j++) {
			if (!dp[j]) {
				int[] loc = { i, j };
				path.add(loc);
				sum+=graph[i][j];
				graphDFS(j, graph, dp, level + 1, path,sum);
				sum-=graph[i][j];
				path.remove(loc);
			}
		}
		dp[i] = false;
	}
}
