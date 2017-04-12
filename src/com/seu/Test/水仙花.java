package com.seu.Test;

import java.util.Scanner;

public class Ë®ÏÉ»¨{
	public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int m=sc.nextInt();
          int n=sc.nextInt();
          String result="";
          for(int i=m;i<=n;i++){
                if(isShuiXianHua(i)){
                      result+=(i+" ");
                }          
          }
          if(result.length()==0)
                System.out.print("no");
          else
                System.out.print(result.substring(0,result.length()-1));
    }
    public static boolean isShuiXianHua(int num){
          if(Math.pow(num/100,3)+Math.pow(num%100/10,3)+Math.pow(num%100%10,3)==num)
                return true;
          return false;
    }
}