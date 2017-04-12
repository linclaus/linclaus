package com.seu.huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class notrepeatnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str=num+"";
		ArrayList<Character> al=new ArrayList<Character>();
		char[] cs=str.toCharArray();
		for(int i=cs.length-1;i>=0;i--){
			if(!al.contains(cs[i])){
				System.out.print(cs[i]);
				al.add(cs[i]);
			}
		}
	}
}
