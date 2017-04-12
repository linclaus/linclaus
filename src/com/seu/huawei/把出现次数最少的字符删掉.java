package com.seu.huawei;
import java.util.*;
import java.util.Map.Entry;
public class 把出现次数最少的字符删掉{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++){
                if(hashmap.containsKey(str.charAt(i))){
                    hashmap.put(str.charAt(i), hashmap.get(str.charAt(i))+1);
                }else
                	hashmap.put(str.charAt(i), 1);
            }
            System.out.println(hashmap.toString());
            Set<Entry<Character, Integer>> entrySet = hashmap.entrySet();
            int min=Integer.MAX_VALUE;
            Set<Character> set=new HashSet<Character>();
            for(Entry<Character, Integer> ent:entrySet){
            	if(min>ent.getValue()){
            		set.clear();
            		set.add(ent.getKey());
            		min=ent.getValue();
            	}else if(min==ent.getValue()){
            		set.add(ent.getKey());
            	}
            }
            System.out.println(set.toString());
            char[] cs=str.toCharArray();
            for(int i=0;i<str.length();i++){
            	if(!set.contains(cs[i])){
            		System.out.print(cs[i]);
            	}
            }
            System.out.println();
        }
    }
}