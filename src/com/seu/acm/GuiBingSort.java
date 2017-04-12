package com.seu.acm;

import java.util.Arrays;

public class GuiBingSort {
	public static void main(String[] args) {
		int[] a={1,2,5,6,4,3,7,8,9,0};
		MergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static void MergeSort(int[] a, int p, int r) {
		int q = (p + r) / 2;
		if (p < r) {
			MergeSort(a, p, q);
			MergeSort(a, q + 1, r);
			Merge(a, p, q, r);
		}
	}

	public static void Merge(int[] a, int p, int q, int r) {
		int[] left = new int[q - p + 1];
		int[] right = new int[r - q];
		int i,j,k;
		for (i = 0; i < left.length; i++) {
			left[i] = a[p + i];
		}
		for (i = 0; i < right.length; i++) {
			right[i] = a[q + 1 + i];
		}
		for (k = p,i = 0, j = 0 ; i < left.length
				&& j < right.length; k++) {
			if (left[i] < right[j])
				a[k] = left[i++];
			else
				a[k] = right[j++];
		}
		if(i<left.length){
			for(j=i;j<left.length; j++,k++){
				a[k]=left[j];
			}
		}
		if(j<right.length){
			for(i=j;i<right.length; i++,k++){
				a[k]=right[i];
			}
		}
	}
}
