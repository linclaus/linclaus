package com.seu.acm;

public class Test8 {
	public int c[];
	public static void main(String[] args) {
		int[][] a={{1,2,3},{1,2,3,4,5},{1,2}};
		int num[]={1,2}; 
		String[] s=new String[2];
		s[0]="abc";
		System.out.println(s[0].hashCode());
		s[1]="cdefg";
		System.out.println(s[1].hashCode());
    
		char[][] ca=new char[s.length][];
		for(int i=0;i<ca.length;i++){
			ca[i]=s[i].toCharArray();
		}
		for(int i=0;i<ca.length;i++){
			for(int j=0;j<ca[i].length;j++){
				System.out.print(ca[i][j]);
			}
			System.out.println();
		}
		s[0].split("");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int b[];
	}
}
