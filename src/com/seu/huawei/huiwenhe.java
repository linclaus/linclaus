package com.seu.huawei;

import java.util.Scanner;

public class huiwenhe {
	public static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			count=0;
			int num=sc.nextInt();
			int[] array=new int[num];
			for(int i=0;i<num;i++){
				array[i]=sc.nextInt();
			}
			function(array,0,num-1);
			System.out.println(count);
		}
	}
	public static void function(int[] array,int i,int j){
		if(i>=j){
			return;
		}
		if(array[i]==array[j]){
			function(array,i+1,j-1);
		}else if(array[i]<array[j]){
			count++;
			array[i+1]+=array[i];
			function(array,i+1,j);
		}else{
			count++;
			array[j-1]+=array[j];
			function(array,i,j-1);
		}
	}
}
