package com.seu.�����Ӱ�;

public class ����1�Ĵ��� {
	public static void main(String[] args) {
		int num=1000;
		int count=0;
		for(int i=0;i<num+1;i++){
			count+=get1Nums(i);
		}
		System.out.println(count);
	}

	private static int get1Nums(int num) {
		int res=0;
		while(num!=0){
			if(num%10==1)
				res++;
			num/=10;
		}
		return res;
	}
}
