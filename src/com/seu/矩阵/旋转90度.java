package com.seu.¾ØÕó;

import java.util.Arrays;
import java.util.Scanner;

public class Ğı×ª90¶È {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] array = new int[num][num];
		int cnt = 1;
		int m = 0;
		int n = num - 1;
		while (m <= n) {
			for (int i = m; i <= n; i++) {
				array[m][i] = cnt++;
			}
			for (int i = m + 1; i <= n; i++) {
				array[i][n] = cnt++;
			}
			for (int i = n - 1; i >= m; i--) {
				array[n][i] = cnt++;
			}
			for (int i = n - 1; i > m; i--) {
				array[i][m] = cnt++;
			}
			m++;
			n--;
		}
		int tR=0,tC=0;
		int dR=array.length-1;
		int dC=array[0].length-1;
		for(int i=0;i<num;i++){
			System.out.println(Arrays.toString(array[i]));
		}
		while(tR<dR)
			rotateEdge(array,tR++,tC++,dR--,dC--);
		for(int i=0;i<num;i++){
			System.out.println(Arrays.toString(array[i]));
		}
	}
	public static void rotateEdge(int[][] m,int tR,int tC,int dR,int dC){
		int times=dC-tC;
		int tmp=0;
		for(int i=0;i!=times;i++){
			tmp=m[tR][tC+i];
			m[tR][tC+i]=m[dR-i][tC];
			m[dR-i][tC]=m[dR][dC-i];
			m[dR][dC-i]=m[tR+i][dC];
			m[tR+i][dC]=tmp;
		}
	}
}
