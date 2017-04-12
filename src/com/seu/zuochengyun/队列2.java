package com.seu.zuochengyun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 队列2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			array[i]=sc.nextInt();
		}
		
		for(int k=0;k<count;k++){
			Queue<Integer> Q = new LinkedList<Integer>();
			Queue<Integer> Q1 = new LinkedList<Integer>();
			Queue<Integer> temp = new LinkedList<Integer>();
			Queue<Integer> result = new LinkedList<Integer>();
			for (int i = 0; i < array[k]; i++) {
				Q.add(i + 1);
			}
			if(array[k]==1){
				System.out.println(1);
				continue;
			}
			temp.addAll(Q);
			int cnt=0;
			while (true) {
				cnt++;
				Q1.clear();
				while (!Q.isEmpty()) // 队列不空，执行循环
				{
					int x = Q.peek(); // 取出当前队头的值x
					Q.poll(); // 弹出当前队头
					Q.add(x); // 把x放入队尾
					x = Q.peek();
					Q1.add(x);
					Q.poll(); // 弹出这时候的队头
				}
				Q.addAll(Q1);
				if (Q.equals(temp))
					break;
				result.clear();
				result.addAll(Q1);
			}
			System.out.println(cnt-1);
			for(Integer tmp:result){
				System.out.print(tmp+" ");
			}
			System.out.println();
		}
		
	}
}