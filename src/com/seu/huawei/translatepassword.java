package com.seu.huawei;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class translatepassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> hsmap=new HashMap<String, Integer>();
		hsmap.put("abc", 2);
		hsmap.put("def", 3);
		hsmap.put("ghi", 4);
		hsmap.put("jkl", 5);
		hsmap.put("mno", 6);
		hsmap.put("pqrs", 7);
		hsmap.put("tuv", 8);
		hsmap.put("wxyz", 9);
		while(sc.hasNextLine()){
			String str=sc.nextLine();
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				if(c>='a'&&c<='z'){
					Set<Entry<String, Integer>> entrySet = hsmap.entrySet();
					for(Entry<String, Integer> ent:entrySet){
						if(ent.getKey().contains(c+"")){
							System.out.print(ent.getValue());
							break;
						}
					}
				}else if(c>='A'&&c<='Z'){
					System.out.print(((char)('a'+(c-'A'+1)%26)));
				}else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
