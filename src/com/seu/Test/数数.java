package com.seu.Test;

import java.util.HashSet;
import java.util.Scanner;

public class ÊýÊý {
	public static final native int fun();
	public static void main(String[] args) {
		String s="";
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		HashSet<Integer> set=new HashSet<>();
		for(int i=1;i<=num;i++){
			set.add(i);
		}
		for(int i=1;set.size()>1;){
			while(!set.contains(i)){
				i=i%num+1;
			}
			i=i%num+1;
			while(!set.contains(i)){
				i=i%num+1;
			}
			i=i%num+1;
			while(!set.contains(i)){
				i=i%num+1;
			}
			set.remove(i);
			i=i%num+1;
		}
		System.out.println(set.toArray()[0]);
	}
}
