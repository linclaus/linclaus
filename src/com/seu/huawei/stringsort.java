package com.seu.huawei;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stringsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.nextLine();
			String[] strs=new String[26];
			for(int i=0;i<26;i++){
				strs[i]="";
			}
			Queue<Integer> queue=new LinkedList<Integer>();
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				int index=0;
				if(c>='a'&&c<='z'){
					index=c-'a';
					strs[index]=strs[index]+str.charAt(i);
				}else if(c>='A'&&c<='Z'){
					index=c-'A';
					strs[index]=strs[index]+str.charAt(i);
				}else{
					queue.add(i);
				}
			}
			int count=0;
			String result="";
			for(int i=0;i<26;i++){
				for(int j=0;j<strs[i].length();j++){
					if(!queue.isEmpty()){
						int index=queue.peek();
						if(count!=index){
							result=result+strs[i].charAt(j);
							count++;
						}else{
							result=result+str.charAt(queue.poll());
							j--;
							count++;
						}
					}else{
						result=result+strs[i].charAt(j);
					}
				}
			}
			while(!queue.isEmpty()){
				result=result+str.charAt(queue.poll());
			}
			System.out.println(result);
		}
	}
}
