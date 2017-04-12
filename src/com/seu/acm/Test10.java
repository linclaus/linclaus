package com.seu.acm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Test10 {

	public static boolean contains(int[] arrays,int i,int temp){
		for(;i<arrays.length;i++){
			if(arrays[i]==temp)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 0;
		int sub;
		Vector<Vector<Integer>> vectors=new Vector<Vector<Integer>>();
		Vector<Integer> answer = null;
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < num; i++) {
			set.add(sc.nextInt());
		}
		num=set.size();
		int[] arrays=new int[num];
		int l=0;
		for(Integer se:set){
			arrays[l++]=se;
		}
		Arrays.sort(arrays);
		for(int i=0;i<num-1;i++){
			int sum=arrays[i];
			for(int j=i+1;j<num;j++){
				sub=arrays[j]-arrays[i];
				int n=1;
				int k=j;
				Vector<Integer> vector=new Vector<Integer>();
				vector.add(arrays[i]);
				while(k<num){
					if(contains(arrays, k, sum+sub)){
						vector.add(arrays[k]);
						n++;
						sum+=sub;
						if(max<n){
							max=n;
							vectors.add(vector);
						}
					}
					k++;
				}
			}
		}
		System.out.println(max);
		System.out.println(vectors.get(vectors.size()-1));
	}
}
