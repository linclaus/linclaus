package com.seu.acm;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long k=sc.nextLong();
		long x=System.currentTimeMillis();
		long l=0;
//		long[][] mn=new long[n][m];
		LinkedList<Long> list=new LinkedList<Long>();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
//					mn[i][j]=(long)((i+1)*(j+1));
					list.add((long)((i+1)*(j+1)));
//					if(i!=j)
//						list.add((long)((i+1)*(j+1)));
			}
		}
//		1461295213326
//		1461295216070start
//		1461295216942end
//		1
//		1461295217056
		System.out.println(System.currentTimeMillis()-x+"start");
		Collections.sort(list);
		System.out.println(System.currentTimeMillis()-x+"end");
		long i=1;
		for(Long li:list){
			if(i==k)
				System.out.println(li);
			i++;
		}
		System.out.println(System.currentTimeMillis()-x);

	}
}
