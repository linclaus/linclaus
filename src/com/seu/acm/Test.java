package com.seu.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("number of test");
		int num = sc.nextInt();
		
		int[] N=new int[num];
		int[] P=new int[num];
		int[] W=new int[num];
		int[] H=new int[num];
		for(int i=0;i<num;i++){
			System.out.println("N,P,W,H");

			N[i] = sc.nextInt();
			P[i] = sc.nextInt();
			W[i] = sc.nextInt();
			H[i] = sc.nextInt();
			System.out.println("N");
			int[] PN=new int[N[i]];
			for(int j=0;j<N[i];j++){
				PN[j]=sc.nextInt();
			}
			int NW=0;
			int CO=0;

			for(int j=0;j<N[i];j++){
				NW+=PN[j];
			}
			CO=NW/P[i];
			
			int[] mi=new int[CO];
			for(int k=CO;k>0;k--){
				mi[CO-k]=Math.min(H[i]/(CO/k), W[i]/k);
			}
			Arrays.sort(mi);
			System.out.println(mi[CO-1]);
		}
	}
}
