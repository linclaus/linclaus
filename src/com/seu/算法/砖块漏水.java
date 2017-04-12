package com.seu.算法;

import java.util.Scanner;

public class 砖块漏水 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] array=new int[m][n];
		int[] result=new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<result.length;i++){
			result[i]=array[0][i];
		}
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(result[j]==0&&array[i][j]==0){
					result[j]=0;
				}else
					result[j]=1;
			}
			for(int j=0;j<array[i].length;j++){
				if(result[j]==0){
					int k=j;
					while(k>=0&&array[i][k]==0){
						result[k--]=0;
					}
					k=j;
					while(k<array[i].length&&array[i][k]==0){
						result[k++]=0;
					}
					j=k;
				}
			}
		}
		int t=0;
		for(;t<result.length;t++){
			if(result[t]==0){
				System.out.println("漏水");
				break;
			}
		}
		if(t==result.length)
			System.out.println("不漏水");
	}
}
