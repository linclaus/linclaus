package com.seu.huawei;

import java.util.Scanner;

public class HextoTen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			System.out.println(Integer.parseInt(str.substring(2), 16));
		}
	}
}
