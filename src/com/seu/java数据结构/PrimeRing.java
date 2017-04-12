package com.seu.java数据结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrimeRing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Queue<Integer> q=new LinkedList<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		for(int i=2;i<=num;i++){
			q.add(i);
		}
		while(!q.isEmpty()){
			int temp=q.poll();
			if(isPrime(al.get(al.size()-1)+temp))
				al.add(temp);
			else
				q.add(temp);
		}
		System.out.println(al.toString());
	}

	public static boolean isPrime(int num){
		if(num==2)
			return true;
		if(num%2==0)
			return false;
		int j=(int) Math.sqrt(num);
		if(j%2==0)
			j--;
		while(j>2&&num%j!=0)
			j-=2;
		return j<2;
	}
}
