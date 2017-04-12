package com.seu.huawei;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int[] nums = new int[num];
		for (int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();
			sum+=nums[i];
		}
		int avg=sum/num;
		int count=0;
		for(int i=0;i<num-1;i++){
			while(nums[i]!=avg){
				if(nums[i]<avg){
					for(int j=i+1;j<num;j++){
						while(nums[j]!=0){
							if(nums[i]==avg)
								break;
							nums[j]--;
							nums[i]++;
							count+=(j-i);
						}
						if(nums[i]==avg)
							break;
					}
				}else{
					nums[i+1]+=(nums[i]-avg);
					count+=(nums[i]-avg);
					nums[i]=avg;
				}
			}
		}
		System.out.println(count);
	}
}
