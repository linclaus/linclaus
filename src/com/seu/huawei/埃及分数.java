package com.seu.huawei;

import java.util.Scanner;

public class °£¼°·ÖÊý {
	static String st=new String();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			st=new String();
			String str=sc.next();
			devide(str,2);
			System.out.println(st.substring(0,st.length()-1));
		}
	}
	public static void devide(String str,int num){
		String[] ss=str.split("/");
		int s=Integer.parseInt(ss[0]);
		int m=Integer.parseInt(ss[1]);
		if(s==0)
			return;
		int tmp=s*num;
		while(tmp<m){
			num++;
			tmp=s*num;
		}
		String strr="1"+"/"+num+"+";
		st=st+strr;
		s=tmp-m;
		m=num*m;
		String strnext=s+"/"+m;
		devide(strnext,num+1);
	}
}
