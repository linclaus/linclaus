package com.seu.zuochengyun;
import java.util.Arrays;
import java.util.Scanner;

public class 第k个最小值之快排 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.println(quickSort(0,length-1,k-1,array));
		System.out.println(Arrays.toString(array));
	}

	public static int quickSort(int begin, int end, int k, int[] array) {
		if(begin>end)
			return Integer.MAX_VALUE;
		int temp=array[begin];
		int i=begin;
		int j=end;
		while(i<=j){
			while(temp<array[j])
				j--;
			if(i<j){
				array[i]=array[j];
			}
			i++;
			while(temp>array[i])
				i++;
			if(i<j){
				array[j]=array[i];
			}
			j--;
		}
		array[i-1]=temp;
		if(i-1==k)
			return temp;
		if(i-1<k){
			return quickSort(i,end,k,array);
		}else{
			return quickSort(begin,i-2,k,array);
		}
	}
}
