package com.seu.¾ØÕó;

import java.util.Arrays;
import java.util.Scanner;

public class ×î´ó×Ó¾ØÕó {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][] array=new int[row][column];
		int[][] value=new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				array[i][j]=sc.nextInt();
			}
		}
		value[0]=array[0].clone();
		for(int i=1;i<row;i++){
			for(int j=0;j<column;j++){
				value[i][j]=array[i][j]==0?0:(value[i-1][j]+1);
			}
			System.out.println(Arrays.toString(value[i]));
			int[] temp=new int[column];
			temp[0]=value[i][0];
			for(int j=1;j<column;j++){
				int min=value[i][j];
				for(int k=j-1;k>=0;k--){
					min=Math.min(value[i][k], min);
					temp[j]=Math.max(min*(j-k+1), temp[j-1]);
				}
			}
			System.out.println(Arrays.toString(temp));
		}
	}
}
//3 4
//1 0 1 1
//1 1 1 1
//1 1 1 0