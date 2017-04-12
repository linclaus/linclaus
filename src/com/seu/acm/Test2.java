package com.seu.acm;

import java.util.Date;

public class Test2 implements Cloneable{
	private Date birth=new Date();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Test2 o=(Test2)super.clone();
		o.birth=(Date)this.birth.clone();
		return super.clone();
	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		System.out.println(func(2015));
	}
	public static int func(int x){
		int count=0;
		while(x!=0){
			count++;
			x=x&(x-1);
		}
		return count;
	}
	
}
