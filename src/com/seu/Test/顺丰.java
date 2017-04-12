package com.seu.Test;

import java.util.Scanner;

public class Ë³·á {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.nextLine();
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++){
			String[] str1=new String[m];
			String[] str2=new String[n];
			for(int j=0;j<m;j++){
				str1[j]=sc.nextLine();
			}
			for(int j=0;j<n;j++){
				str2[j]=sc.nextLine();
			}
			System.out.println("Case #" + i+1 + ":");
			for(int j=0;j<n;j++){
				int cnt=0;
				for(int k=0;k<m;k++){
					if(str1[k].indexOf(str2[j])==0)
						cnt++;
				}
				System.out.println(cnt);
			}
		}
	}
}
