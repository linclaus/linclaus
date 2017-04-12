package com.seu.算法;
import java.util.Scanner;
public class 最大字数组 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();int[] array=new int[length];
		for(int i=0;i<length;i++){
			array[i]=sc.nextInt();
		}
		int sum=0;
		int min=0;
		int max=array[0];
		for(int i=0;i<length;i++){
			sum+=array[i];
			min=Math.min(min, sum);
			max=Math.max(sum-min, max);
		}
		System.out.println(max);
	}
}
