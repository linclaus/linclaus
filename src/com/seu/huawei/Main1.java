package com.seu.huawei;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people=sc.nextInt();
		int remin=0;
		int count=0;
		int min=Integer.MAX_VALUE;
		if(people<=8){
			for(int i=0;i<people;i++){
				System.out.println(1);
			}
			return;
		}
		for(int i=(int) Math.ceil(people/8.0);i<=8;i++){
			int[] array=new int[i];
			remin=people%i;
//			if(remin==0){
//				for(int t=0;t<i;t++){
//					System.out.println(people/i);
//				}
//				break;
//			}
			for(int k=0;k<remin;k++){
				array[k]=1;
			}
			for(int m=0;m<i;m++){
				for(int n=m+1;n<i;n++){
					count+=(array[m]-array[n]);
				}
			}
			min=(min<=count?min:count);
		}
		count=0;
		for(int i=(int) Math.ceil(people/8.0);i<=8;i++){
			int[] array=new int[i];
			remin=people%i;
			if(remin==0){
				break;
			}
			for(int k=0;k<i;k++){
				if(k<remin){
					array[k]=(people/i)+1;
					continue;
				}
				array[k]=people/i;
			}
			for(int m=0;m<i;m++){
				for(int n=m+1;n<i;n++){
					count+=(array[m]-array[n]);
				}
			}
			if(min==count){
				for(int j=0;j<array.length;j++){
					System.out.println(array[j]);
				}
				return;
			}
		}
	}
	
}
