package com.seu.huawei;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
	static HashSet<String> hashset=new HashSet<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int m,n;
		for(int i=0;i<num;i++){
			m=sc.nextInt();
			n=sc.nextInt();
			int array[]=new int[n];
			forfunction(array,m,n,n-1);
			System.out.println(hashset.size());
			hashset.removeAll(hashset);
		}
	}
	public static void forfunction(int[] array,int m,int n,int k){
		if(k==0){
			for(int i=0;i<=m;i++){
				array[k]=i;
				int sum=0;
				int[] arr=array.clone();
				for(int j=0;j<n;j++){
					sum+=arr[j];
				}
				if(sum==m){
					Arrays.sort(arr);
					hashset.add(Arrays.toString(arr));
					return;
				}
			}
		}else{
			for(int i=0;i<=m;i++){
				array[k]=i;
				forfunction(array, m-i, n-1, k-1);
			}
		}
	}
}
