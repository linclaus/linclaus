package com.seu.huawei;

import java.util.Scanner;

public class IPµÿ÷∑≈–∂œ {
	public static int a,b,c,d,e,error,privat;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String str=sc.nextLine();
			Correct(str);
		}
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+error+" "+privat);
	}
	private static void Correct(String str){
		String[] strs=str.split("~");
		String[] ips=strs[0].split("\\.");
		String[] umask=strs[1].split("\\.");
		if(ips.length!=4||umask.length!=4){
			++error;
			return ;
		}
		for(int i=0;i<4;i++){
			if(ips[i]==" "||umask[i]==" "){
				++error;
				return;
			}
		}
		for(int i=0;i<4;i++){
			if(Integer.parseInt(ips[i])>255||Integer.parseInt(umask[i])>255){
				++error;
				return;
			}
		}
		String temp="";
		for(int i=0;i<4;i++){
			temp+=Integer.toBinaryString(Integer.parseInt(umask[i]));
		}
		int index=temp.indexOf("0");
		if(temp.substring(index+1).contains("1")){
			++error;
			return;
		}
		if(Integer.parseInt(ips[0])>=1&&Integer.parseInt(ips[0])<=126){
			++a;
		}
		if(Integer.parseInt(ips[0])>=128&&Integer.parseInt(ips[0])<=191){
			++b;
		}
		if(Integer.parseInt(ips[0])>=192&&Integer.parseInt(ips[0])<=223){
			++c;
		}
		if(Integer.parseInt(ips[0])>=224&&Integer.parseInt(ips[0])<=239){
			++d;
		}
		if(Integer.parseInt(ips[0])>=240&&Integer.parseInt(ips[0])<=255){
			++e;
		}
		if(Integer.parseInt(ips[0])==10){
			++privat;
		}
		if(Integer.parseInt(ips[0])==172){
			if(Integer.parseInt(ips[1])>=16&&Integer.parseInt(ips[1])<=31){
				++privat;
			}
		}
		if(Integer.parseInt(ips[0])==192){
			if(Integer.parseInt(ips[1])==168){
				++privat;
			}
		}
	}
}
