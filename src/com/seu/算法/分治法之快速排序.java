package com.seu.�㷨;

import java.util.Arrays;

public class ���η�֮�������� {//�ֲ�����Ժϲ�
	public static void main(String[] args) {
		int[] array={6,4,8,5,9,1,3};
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	private static int findMid(int[] array,int start,int end){
		int i=start,j=end;
		int pio=array[i];
		while(i<j){
			while(i<j&&array[j]>pio)j--;
			if(i<j)
				array[i++]=array[j];
			while(i<j&&array[i]<pio)i++;
			if(i<j)
				array[j--]=array[i];
		}
		array[i]=pio;
		return i;
	}

	private static void quickSort(int[] array, int start, int end) {
		if(start>end){
			return;
		}
		int mid=findMid(array,start,end);
		quickSort(array, start, mid-1);
		quickSort(array, mid+1, end);
	}
}
