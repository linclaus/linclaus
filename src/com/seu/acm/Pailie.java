package com.seu.acm;


public class Pailie {
	public static void main(String[] args) {
		int[] a={1,2,3};
		for(int i=0;i<a.length;i++){
			int a0=a[i];
			int[] b=remove(a,i);
			for(int j=0;j<b.length;j++){
				int a1=b[j];
				int[] c=remove(b,j);
				for(int k=0;k<c.length;k++){
					int a2=c[k];
					System.out.println(a0+""+a1+a2);
				}
			}
		}
	}
	public static int[] remove(int[] a,int k){
		int[] b=new int[a.length-1];
		int i=0;
		for(;i<k;i++){
			b[i]=a[i];
		}
		i++;
		for(;i<a.length;i++){
			b[i-1]=a[i];
		}
		return b;
	}
}
