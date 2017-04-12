package com.seu.acm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test14 {
	class C{
		public C(char c){
			this.c=c;
		}
		char c;
		ArrayList<Integer> index=new ArrayList<Integer>();
		public boolean equals(C obj) {
			return this.c==obj.c;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Map<Character, ArrayList<Integer>> map=new HashMap<Character, ArrayList<Integer>>();
		char[] cs=str.toCharArray();
		for(int i=0;i<cs.length;i++){
			if(!map.containsKey(cs[i])){
				map.put(cs[i], new ArrayList<Integer>());
			}
			map.get(cs[i]).add(i);
		}
		int min=0,max=0;
		char out=0;
		Set<Entry<Character, ArrayList<Integer>>> entrySet = map.entrySet();
		for(Entry<Character, ArrayList<Integer>> set:entrySet){
			ArrayList<Integer> list=set.getValue();
			if(list.get(0)<=min&&list.get(list.size()-1)>=max){
				min=list.get(0);
				max=list.get(list.size()-1);
				list.remove(0);
				list.remove(list.size()-1);
				out=set.getKey();
			}
			map.remove(set.getKey());
		}
		System.out.println(out+","+min+","+max);
	}
}
