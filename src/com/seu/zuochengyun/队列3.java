package com.seu.zuochengyun;

import java.util.Arrays;
import java.util.Scanner;

public class ╤сап3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] arr = new int[n];
		int  count = 1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		int flag = 0;
		while(count <= n) {			
			for(int i=0; i<arr.length; i++) {				
				if(arr[i] == 0) {
					flag++;
					if(flag%2 == 0) {
						arr[i] = count;
						count++;
					}
				}								
			}
		}
		System.out.println(Arrays.toString(arr));	
	}
}
