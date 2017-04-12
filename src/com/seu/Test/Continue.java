package com.seu.Test;

import java.util.Arrays;

public class Continue {
	public static void main(String[] args) {
		int i=0;
		for(;i<10;i++){
			if(i==3)
				continue;
			System.out.print(i);
			if(i==5)
				break;
		}
		System.out.println(i);
		String str="hello";
		func(str);
		System.out.println(str);
		char c='Äú';
		System.out.println(Arrays.toString((c+"c").getBytes()));
		System.out.println(new String("\u4e00")+new String("\u9fa5"));
	}
	public static void func(String str){
		str+=" world";
		System.out.println(str);
	}
}
