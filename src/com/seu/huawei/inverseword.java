package com.seu.huawei;

import java.util.Scanner;

public class inverseword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] strrevese=str.split(" ");
		for(int i=1;i<strrevese.length;i++){
			System.out.print(strrevese[strrevese.length-i]+" ");
		}
		System.out.println(strrevese[0]);
	}
}
