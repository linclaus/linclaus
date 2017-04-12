package com.seu.huawei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class shujufenlei {
	static class Data implements Comparable<Data>{
		String value;
		TreeMap<Integer, String> hashMap;

		public Data(String value) {
			this.value = value;
			hashMap = new TreeMap<Integer, String>();
		}


		public void insert(int index, String str) {
			hashMap.put(index, str);
		}
		

		public boolean equals(Data obj) {
			// TODO Auto-generated method stub
			return this.value.equals(obj.value);
		}

		@Override
		public int compareTo(Data o) {
			return Integer.parseInt(this.value)-Integer.parseInt(o.value);
		}
		@Override
		public String toString() {
			String str=this.value+" "+this.hashMap.size();
			Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
			for(Entry<Integer,String> ent:entrySet){
				str=str+" "+ent.getKey()+" "+ent.getValue();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num1 = sc.nextInt();
			String[] array1 = new String[num1];
			for (int i = 0; i < num1; i++) {
				array1[i] = sc.next();
			}
			int num2 = sc.nextInt();
			TreeSet<Data> treeSet=new TreeSet<Data>();
			for (int i = 0; i < num2; i++) {
				treeSet.add(new Data(sc.next()));
			}
			Iterator<Data> iterator = treeSet.iterator();
			String str="";
			int num=0;
			while(iterator.hasNext()){
				Data next=iterator.next();
				for(int i=0;i<num1;i++){
					if(array1[i].contains(next.value)){
						next.insert(i, array1[i]);
					}
				}
				if(next.hashMap.size()!=0){
					num+=(next.hashMap.size()+1);
					str=str+next.toString()+" ";
				}
			}
			System.out.print(num*2+" ");
			System.out.print(str.trim());
			System.out.println();
		}
	}
}
