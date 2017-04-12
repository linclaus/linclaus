package com.seu.算法;

import java.util.Stack;


public class 迷宫回溯法求解 {

	public static void main(String[] args) {
		// 迷宫定义
		int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 0, 0, 0, 0, 1, 1 },
				{ 1, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
				{ 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		int[][] move = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		Stack s = new Stack();
		Stack s1 = new Stack();
		int a = path(maze, move, s);
		if (a == 1)
			System.out.println("Success");
		else
			System.out.println("Failure");
		while (!s.isEmpty()) {
			Step step = (Step) s.pop();
			System.out.println(step.x + ":" + step.y);
		}
	}

	public static int path(int[][] maze, int[][] move, Stack s) {
		Step temp = new Step(1, 1); // 起点
		s.push(temp);
		while (!s.isEmpty()) {
			temp = (Step) s.pop();
			int x = temp.x;
			int y = temp.y;
			int d = 0;
			while (d < 4) {
				int i = x + move[d][0];
				int j = y + move[d][1];
				if (maze[i][j] == 0) { // 该点可达
					temp = new Step(i, j); // 到达新点
					s.push(temp);
					x = i;
					y = j;
					maze[x][y] = -1; // 到达新点，标志已经到达
					if (x == 6 && y == 8) {
						return 1; // 到达出口，迷宫有路，返回1
					} else {
						d = 0; // 重新初始化方向
					}
				} else {
					d++; // 改变方向
				}
			}
		}
		return 0;
	}

}