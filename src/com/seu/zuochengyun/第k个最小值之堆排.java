package com.seu.zuochengyun;

import java.util.Arrays;
import java.util.Scanner;

public class 第k个最小值之堆排 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		heapSort(array,k);
		System.out.println(Arrays.toString(array));
		for(int i=k;i<length;i++){
			if(array[i]>=array[0]){
				array[0]=array[i];
				adjustHeap(array,0,k-1);
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public static void heapSort(int[] array,int k) {
		for(int i=k/2;i>=0;i--){
			adjustHeap(array,i,k-1);
		}
	}
	public static void adjustHeap(int[] array,int pos,int k){
		int temp;
		int itemp;
		for(temp=array[pos];2*pos+1<=k;pos=itemp){
			itemp=2*pos+1;
			if(array[itemp]>array[itemp+1]){
				itemp++;
			}
			if(temp>array[itemp]){
				array[pos]=array[itemp];
			}else
				break;
		}
		array[pos]=temp;
	}
}
