package com.seu.�㷨;

import java.util.*;

public class ����{  
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
        if(start==end){//��ֻҪ���������һ����ĸ����ȫ����ʱ��ֻҪ�Ͱ��������������  
            for(int i=0;i<=end;i++){  
                System.out.print(buf[i]);         
            }  
            count ++;
            System.out.println();
        }  
        else{//�����ĸȫ����  
            for(int i=start;i<=end;i++){  
                char temp=buf[start];//���������һ��Ԫ���������Ԫ��  
                buf[start]=buf[i];  
                buf[i]=temp;  
                  
                perm(buf,start+1,end);//����Ԫ�صݹ�ȫ����  
                  
                temp=buf[start];//������������黹ԭ  
                buf[start]=buf[i];  
                buf[i]=temp;  
            }  
        }  
    }  
}
