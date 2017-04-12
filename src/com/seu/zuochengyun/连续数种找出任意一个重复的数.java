package com.seu.zuochengyun;

import java.util.Scanner;

public class 连续数种找出任意一个重复的数 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		//链表求入环点
		int x=array[0]+1;
		int y=array[array[0]+1]+1;
		while(x!=y){
			x=array[x]+1;
			y=array[array[y]+1]+1;
		}
		System.out.println(x-1);
		//取反
		int temp;
		for(int i=0;i<length;i++){
			temp=Math.abs(array[i]);
			if(array[temp]>=0){
				array[temp]=-array[temp];
			}else{
				System.out.println(temp);
			}
		}
	}
}
