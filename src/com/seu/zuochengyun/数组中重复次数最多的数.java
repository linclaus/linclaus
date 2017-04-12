package com.seu.zuochengyun;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 数组中重复次数最多的数 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int[] array=new int[length];
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int maxValue=0;
		int maxKey = 0;
		for(int i=0;i<length;i++){
			if(map.containsKey(array[i])){
				map.put(array[i], map.get(array[i])+1);
			}else{
				map.put(array[i], 1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer,Integer> ent:entrySet){
			if(maxValue<ent.getValue()){
				maxValue=ent.getValue();
				maxKey=ent.getKey();
			}
		}
		System.out.print(maxKey);
	}
}
