package com.seu.zuochengyun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ����2 {
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
				while (!Q.isEmpty()) // ���в��գ�ִ��ѭ��
				{
					int x = Q.peek(); // ȡ����ǰ��ͷ��ֵx
					Q.poll(); // ������ǰ��ͷ
					Q.add(x); // ��x�����β
					x = Q.peek();
					Q1.add(x);
					Q.poll(); // ������ʱ��Ķ�ͷ
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