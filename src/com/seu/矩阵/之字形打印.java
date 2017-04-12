package com.seu.¾ØÕó;

import java.util.Arrays;
import java.util.Scanner;

public class Ö®×ÖĞÎ´òÓ¡ {
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
		for(int i=0;i<num;i++){
			System.out.println(Arrays.toString(array[i]));
		}
		int tR = 0, tC = 0, dR = 0, dC = 0;
		int endR=array.length-1;
		int endC=array[0].length-1;
		boolean fromUp=false;
		while(tR<=endR){
			printlevel(array, tR, tC, dR, dC, fromUp);
			tR=tC==endC?tR+1:tR;
			tC=tC==endC?tC:tC+1;
			dC=dR==endR?dC+1:dC;
			dR=dR==endR?dR:dR+1;
			fromUp=!fromUp;
		}
	}

	public static void printlevel(int[][] m, int tR, int tC, int dR, int dC,
			boolean f) {
		if (f) {
			while (tR <= dR) {
				System.out.print(m[tR++][tC--] + " ");
			}
		} else {
			while (dR >= tR) {
				System.out.print(m[dR--][dC++] + " ");
			}
		}
	}
}
