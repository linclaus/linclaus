package com.seu.ÔÓÆßÔÓ°Ë;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ×ÖµäĞò {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[] array=new String[N];
		for(int i=0;i<N;i++){
			array[i]=sc.nextInt()+"";
		}
		Arrays.sort(array,new MyComparator());
		System.out.println(Arrays.toString(array));
		String temp;
		for(int i=1;i<N-1;i++){
			int a1=Integer.parseInt(array[i]);
			int a2=Integer.parseInt(array[i-1]);
			int a3=Integer.parseInt(array[i+1]);
			if(a1==a2+1){
				temp=new String(array[i+1]);
				array[i+1]=new String(array[i]);
				array[i]=new String(temp);
			}
		}
		
		for(int i=0;i<N;i++)
			System.out.print(array[i]+" ");
	}
	static class MyComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			return (o1+o2).compareTo((o2+o1));
		}
	}
}
