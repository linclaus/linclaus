package com.seu.算法;

import java.util.*;

public class 排列{  
 static int count = 0;
 static char[] buf = {'1', '2', '3', '4'};  
    static ArrayList<String> list = new ArrayList<String>();
    
    public static void main(String[] args) {  
        select(buf, list, 3);
        
        for(String str : list){
         char[] temp = str.toCharArray();
         //perm(temp,0,temp.length-1);
         System.out.println(str);
        }
        
        System.out.println("In total: "+ count); 
    }  
    
    public static void select(char[] source, ArrayList<String> arrayList, int num){
     int l = source.length;
     
     char[] temp = new char[num];
     
     System.arraycopy(source, 0, temp, 0, num);
     
     arrayList.add(new String(temp));
     
     for(int i=num; i<l; i++){
      for (int j=0; j<num; j++){
       char tempChar = temp[j];
       temp[j] = source[i];
        
       arrayList.add(new String(temp));
       
       temp[j] = tempChar;
      }
     }
    }
    public static void perm(char[] buf, int start, int end){  
        if(start==end){//当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可  
            for(int i=0;i<=end;i++){  
                System.out.print(buf[i]);         
            }  
            count ++;
            System.out.println();
        }  
        else{//多个字母全排列  
            for(int i=start;i<=end;i++){  
                char temp=buf[start];//交换数组第一个元素与后续的元素  
                buf[start]=buf[i];  
                buf[i]=temp;  
                  
                perm(buf,start+1,end);//后续元素递归全排列  
                  
                temp=buf[start];//将交换后的数组还原  
                buf[start]=buf[i];  
                buf[i]=temp;  
            }  
        }  
    }  
}
