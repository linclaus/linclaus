package com.seu.java数据结构;

import java.util.LinkedList;

public class HashSetList<T> {
	public static void main(String[] args) {
		HashSetList<Integer> hs=new HashSetList<>(10);
		for(int i=0;i<20;i++){
			hs.insert(i);
		}
		System.out.println(hs.toString());
	}
	private LinkedList<T>[] table;

	public HashSetList(int size) {
		this.table = new LinkedList[Math.abs(size)];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<T>();
		}
	}

	public HashSetList() {
		this(97);
	}

	private int hash(T x) {
		int key = Math.abs(x.hashCode());
		return key % table.length;
	}

	public void insert(T x) {
		table[hash(x)].add(0, x);
	}

	public void remove(T x) {
		table[hash(x)].remove(x);
	}

	public T search(T x) {
		int index = table[hash(x)].indexOf(x);
		if (index == -1)
			return null;
		return table[index].get(index);
	}

	public boolean contain(T key) {
		return table[hash(key)].indexOf(key) != -1;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < table.length; i++) {
			if (!table[i].isEmpty())
				str += table[i].toString() + "\n";
		}
		return str;
	}
}
