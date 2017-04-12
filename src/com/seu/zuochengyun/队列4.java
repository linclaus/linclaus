package com.seu.zuochengyun;

import java.util.Scanner;

public class ╤сап4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int count=0;
//		int[] array=new int[size];
//		for(int j=0;j<size;j++){
//			array[j]=j+1;
//		}
		int[] array={8, 1, 6, 2, 10, 3, 7, 4, 9, 5};
		boolean flag=true;
		while(count<size){
			for(int i=0;i<size;i++){
				if(array[i]!=-1){
					flag=!flag;
					if(flag){
						System.out.print(array[i]+" ");
						count++;
						array[i]=-1;
					}
				}
			}
		}
	}
}
