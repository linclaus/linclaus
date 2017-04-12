package com.seu.acm;

public class Sort {
	public static void main(String[] args) {
		int[] a={1,5,6,7,9,2,4,8,10,13,14};
		sort(a,5);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+",");
		}
	}
	public static void sort(int[] a, int mid){
		int midd=mid;
		for(int i=0;i<midd;i++){
			int tmp;
			if(a[i]>a[mid]){
				tmp=a[mid];
				a[mid]=a[i];
				a[i]=tmp;
				mid=findRightPlaceForMid(a, mid);
			}
		}  
	}
	public static int findRightPlaceForMid(int[] a,int mid){
		int tmp;
		int i=mid;
		while(i<a.length&&a[i]>a[i+1]){
			tmp=a[i+1];
			a[i+1]=a[i];
			a[i]=tmp;
			i++;
		}
		
		return i;
	}
}
