package com.seu.huawei;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class mapreduce {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
		int[] key=new int[num];
		int[] value=new int[num];
		for(int i=0;i<num;i++){
			key[i]=sc.nextInt();
			value[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++){
			if(map.containsKey(key[i])){
				map.put(key[i], map.get(key[i])+value[i]);
			}else{
				map.put(key[i], value[i]);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer, Integer> ent:entrySet){
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}
}
