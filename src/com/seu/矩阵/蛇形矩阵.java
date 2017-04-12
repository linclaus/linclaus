package com.seu.¾ØÕó;

import java.util.Scanner;

public class ÉßĞÎ¾ØÕó {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[][] array=new int[num][num];
		int cnt=1;
		int m=0;
		int n=num-1;
		while(m<=n){
			for(int i=m;i<=n;i++){
				array[m][i]=cnt++;
			}
			for(int i=m+1;i<=n;i++){
				array[i][n]=cnt++;
			}
			for(int i=n-1;i>=m;i--){
				array[n][i]=cnt++;
			}
			for(int i=n-1;i>m;i--){
				array[i][m]=cnt++;
			}
			m++;
			n--;
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print(array[i][j]+" ");
			}
		}
	}
}
