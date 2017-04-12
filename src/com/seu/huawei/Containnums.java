package com.seu.huawei;

import java.util.HashSet;
import java.util.Scanner;

public class Containnums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashSet<Character> hset=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			hset.add(str.charAt(i));
		}
		System.out.println(hset.size());
	}
}
