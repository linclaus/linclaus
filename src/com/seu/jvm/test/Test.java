package com.seu.jvm;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Test {
	
	private static char ch;//类变量，不加static的为实例变量，通常成员变量
	private static int in;
	public static void main(String[] args) {
		BigInteger bt=new BigInteger("123456789123456789123456789");
		System.out.println(bt.remainder(new BigInteger("5")));
		BigDecimal bd=new BigDecimal("10.12345678901234567890");
		System.out.println(bd.negate());
		
		char[] cs={'a','b','e'};
		String strs=String.valueOf(cs);
		System.out.println(strs);
		
		List<?> list=null;
		List<Integer> ilist=new ArrayList<>();
		ilist.add(1);
		list=ilist;
//		list.add(1);//只能删除不能添加
		list.remove(0);
		System.out.println(ilist.toString());
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		HashSet<Integer> hs=new HashSet<>();
		hs.add(3);
		hs.add(17);
		lhs.add(3);
		lhs.add(17);
		System.out.println(Collections.frequency(hs, 0));
		System.out.println(lhs.toString());
		System.out.println(hs.toString());//linkedhashset维护了加入的顺序，而hashset是按计算hash值来存取的，对于的map也是一样的道理
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
		lhm.put("one", 1);
		lhm.put("two", 2);
		hm.put("one", 1);
		hm.put("two", 2);
		System.out.println(hm.toString());
		System.out.println(lhm.toString());
		
		System.out.println(ch+","+in);//成员变量有初始值，局部变量需要显示初始化
		char c=0;
		System.out.println(c+","+in);
		int[] b=new int[3];
		System.out.println(b[2]);
		String[] str=new String[3];
		System.out.println(str[2]);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			continue;// 会执行i++;
		}
	}
}
interface A{
	public void fun();
}
