package com.seu.zuochengyun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 队列 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> Q = new LinkedList<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			Q.add(sc.nextInt());
		}
		while (!Q.isEmpty()) // 队列不空，执行循环
		{
			int x = Q.peek(); // 取出当前队头的值x
			Q.poll(); // 弹出当前队头
			Q.add(x); // 把x放入队尾
			x = Q.peek();
			System.out.print(x+" ");// 取出这时候队头的值
			Q.poll(); // 弹出这时候的队头
		}
	}
}
