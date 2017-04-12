package com.seu.算法;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class 求子集 {  
    public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		@SuppressWarnings("unchecked")
		HashSet<HashSet<Integer>>[] hs=new HashSet[num];
		ArrayList<String>[] ls=new ArrayList[10];
		ArrayList<?>[] ls1=new ArrayList<?>[10];
		ls1[0].add(1, null);
		
		int[] cs=new int[num];
		for(int i=0;i<num;i++){
			cs[i]=sc.nextInt();
		}
		hs[0]=new HashSet<HashSet<Integer>>();
		HashSet<Integer> hs0=new HashSet<Integer>();
		hs0.add(cs[0]);
		hs[0].add(hs0);
		for(int i=1;i<num;i++){
			hs[i]=new HashSet<HashSet<Integer>>();
			for(HashSet<Integer> it:hs[i-1]){
				@SuppressWarnings("unchecked")
				HashSet<Integer> temp=(HashSet<Integer>) it.clone();
				temp.add(cs[i]);
				hs[i].add(temp);
			}
			HashSet<Integer> hsi=new HashSet<Integer>();
			hsi.add(cs[i]);
			hs[i].add(hsi);
		}
		for(int i=0;i<num;i++){
			System.out.println(hs[i]);
		}
	}
} 
