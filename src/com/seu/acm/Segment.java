package com.seu.acm;

import java.util.Scanner;

public class Segment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int q=sc.nextInt();
			int p=sc.nextInt();
			int count=0;
			float[] k=new float[q-1];
			for(int m=1;m<q;m++){
				k[m-1]=(float) ((q-m)/(0.0+m));
			}
			for(int m=1;m<q;m++){
				for(int n=1;n<q-m;n++){
					if(new Segment().contain(k, (float)(n/(0.0+m))))
							count++;
				}
			}
			System.out.println(count%p);
		}
	}
	public  boolean contain(float[] k,float f){
		for(int i=0;i<k.length;i++){
			if(k[i]==f)
				return true;
		}
		return false;
	}
}
