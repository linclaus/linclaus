package com.seu.zuochengyun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> Q = new LinkedList<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			Q.add(sc.nextInt());
		}
		while (!Q.isEmpty()) // ���в��գ�ִ��ѭ��
		{
			int x = Q.peek(); // ȡ����ǰ��ͷ��ֵx
			Q.poll(); // ������ǰ��ͷ
			Q.add(x); // ��x�����β
			x = Q.peek();
			System.out.print(x+" ");// ȡ����ʱ���ͷ��ֵ
			Q.poll(); // ������ʱ��Ķ�ͷ
		}
	}
}
