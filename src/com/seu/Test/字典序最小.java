package com.seu.Test;

import java.util.Arrays;
import java.util.Scanner;

public class ×ÖµäĞò×îĞ¡ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] array=new int[N];
		for(int i=0;i<N;i++){
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		int temp;
		for(int i=1;i<N-1;i++){
			if(array[i]==array[i-1]+1){
				temp=array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
			}
		}
		for(int i=0;i<N;i++)
			System.out.print(array[i]+" ");
	}
}
