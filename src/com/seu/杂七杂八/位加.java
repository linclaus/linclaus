package com.seu.‘”∆ﬂ‘”∞À;

public class Œªº” {
	public static void main(String[] args) {
		int a=10,b=-5;
		System.out.println(add(a,b));
		System.out.println(minus(a,b));
		System.out.println(multi(a,b));
		System.out.println(bitcount(5));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(b&(~b+1));
	}
	public static int add(int a,int b){
		int sum=a;
		while(b!=0){
			sum=a^b;
			b=(a&b)<<1;
			a=sum;
		}
		return sum;
	}
	public static int minus(int a,int b){
		b=add(~b,1);
		return add(a,b);
	}
	public static int multi(int a,int b){
		int res=0;
		while(b!=0){
			if((b&1)!=0){
				res=add(res,a);
			}
			a=a<<1;
			b=b>>>1;
		}
		return res;
	}
	public static int bitcount(int a){
		int cnt=0;
		while(a!=0){
			a=a&(a-1);
			cnt++;
		}
		return cnt;
	}
	
}
