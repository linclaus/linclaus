package com.seu.java���ݽṹ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTest {
	public static void main(String[] args) {
		Integer[] array={1,3,5,2,5,6};
//		Arrays.fill(array,1,3,2);
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.binarySearch(array, 5));

		ArrayList<Integer> al=new ArrayList<>();//һά����
//		Collections.addAll(al, array);
		Collections.addAll(al, 1,3,5,2,5,6);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 5));
		
		HashSet<Integer> hs=new HashSet<Integer>();//ɢ�б�
		Collections.addAll(hs, 16,2,3,3,4);
		System.out.println(hs.toString());
		
		SortedSet<Integer> ts=new TreeSet<Integer>();//ƽ�������
		Collections.addAll(ts, 5,4,3,1,2);
		System.out.println(ts.toString());
		
		Queue<Integer> q=new LinkedList<Integer>();
		Stack<Integer> s=new Stack<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();//ѭ��˫����
		q.add(0);
		ll.add(0);
		q.poll();
		ll.poll();
		s.push(0);
		ll.push(0);
		s.pop();
		ll.pop();
		
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();//ɢ�б�
		hm.put(1, 1);
		hm.remove(1);
		
		SortedMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();//ƽ�������
		tm.put(1, 1);
		tm.remove(1);
	}
}
