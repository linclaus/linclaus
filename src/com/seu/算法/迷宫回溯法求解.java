package com.seu.�㷨;

import java.util.Stack;


public class �Թ����ݷ���� {

	public static void main(String[] args) {
		// �Թ�����
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
		Step temp = new Step(1, 1); // ���
		s.push(temp);
		while (!s.isEmpty()) {
			temp = (Step) s.pop();
			int x = temp.x;
			int y = temp.y;
			int d = 0;
			while (d < 4) {
				int i = x + move[d][0];
				int j = y + move[d][1];
				if (maze[i][j] == 0) { // �õ�ɴ�
					temp = new Step(i, j); // �����µ�
					s.push(temp);
					x = i;
					y = j;
					maze[x][y] = -1; // �����µ㣬��־�Ѿ�����
					if (x == 6 && y == 8) {
						return 1; // ������ڣ��Թ���·������1
					} else {
						d = 0; // ���³�ʼ������
					}
				} else {
					d++; // �ı䷽��
				}
			}
		}
		return 0;
	}

}