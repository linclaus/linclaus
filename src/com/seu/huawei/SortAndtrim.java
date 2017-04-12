package com.seu.huawei;

import java.util.Scanner;

public class SortAndtrim {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] nums=new int[num];
		for(int i=0;i<num;i++){
			nums[i]=sc.nextInt();
		}
		int temp;
		int min;
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(nums[i]>nums[j]){
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}
		System.out.println(nums[0]);
		for(int i=0;i<num-1;i++){
			if(nums[i]!=nums[i+1]){
				System.out.println(nums[i+1]);
				continue;
			}	
		}
//		for(int i=1;i<num;i++){
//			for(int j=0;j<num-i;j++){
//				if(nums[j]>nums[j+1]){
//					temp=nums[j];
//					nums[j]=nums[j+1];
//					nums[j+1]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(nums));
	}
}
