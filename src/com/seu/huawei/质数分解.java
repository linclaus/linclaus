package com.seu.huawei;

import java.util.Scanner;

public class �����ֽ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l=sc.nextLong();
		long num=2;
		while(true){
			if(l==1)
				break;
			if(l%num==0){
				l=l/num;
				System.out.print(num+" ");
			}else{
				num++;
			}
		}
	}
}
