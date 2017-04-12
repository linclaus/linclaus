package com.seu.Test;

import java.util.Scanner;

public class ±¦Ê¯ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int max=0;
		for (int i = 0; i < str.length(); i++) {
			String p = "ABCDE";
			int j = i;
			int cnt=0;
			do {
				if(p.contains(str.charAt(j)+"")){
					p=p.replace(str.charAt(j)+"", "");
					if(p.length()==0){
						break;
					}
				}
				j=(j+1)%str.length();
				cnt++;
				if(max>str.length()-cnt)
					continue;
			} while (p.length() == 0 || j != i);
//			System.out.print(i+","+j+" ");
//			max=Math.max(str.length()-Math.abs(i-j), max);
			if(i<j){
				max=Math.max(str.length()-(j-i)-1,max);
			}else
				max=Math.max(i-j-1,max);
		}
		System.out.println(max);
	}
}
