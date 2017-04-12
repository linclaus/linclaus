package com.seu.算法;

import java.util.Arrays;

public class 分治法之归并排序 {
	public static void main(String[] args) {
		int[] array = { 6, 4, 8, 5, 9, 1, 3 };
		mergeSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	public static void mergeSort(int[] array,int start,int end){
		if(start<end){
			int mid=(start+end)/2;
			mergeSort(array,start,mid);
			mergeSort(array,mid+1,end);
			merge(array,start,mid,end);
		}
	}
	public static void merge(int[] array,int start,int mid,int end){
		int n1=mid-start+1;
		int n2=end-mid;
		int[] arrL=new int[n1];
		int[] arrR=new int[n2];
		for(int i=0;i<n1;i++){
			arrL[i]=array[start+i];
		}
		for(int i=0;i<n2;i++){
			arrR[i]=array[mid+1+i];
		}
		int i=0,j=0,k=0;
		while(i<n1&&j<n2){
			if(arrL[i]<arrR[j]){
				array[start+k++]=arrL[i++];
			}else{
				array[start+k++]=arrR[j++];
			}
		}
		while(i<n1){
			array[start+k++]=arrL[i++];
		}
		while(j<n2){
			array[start+k++]=arrR[j++];
		}
	}
}
