package com.seu.huawei;

import java.util.*;
public class jimu{
	public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      while(sc.hasNext()){
        int num=sc.nextInt();
        int sum=0;
        int mul1=1;
        int mul2=1;
        if(num%2==1){
          for(int i=0;i<num/2;i++){
          	for(int j=1;j<=i;j++){
              mul1*=j;
              mul2*=(num-1-j);
            }
            sum+=(mul2/mul1);
          }
        }else{
        	for(int i=0;i<num/2;i++){
              	for(int j=1;j<=i;j++){
                  mul1*=j;
                  mul2*=(num-1-j);
                }
                sum+=(mul2/mul1);
              }
        }
        System.out.println(sum);
      }
    }
}
