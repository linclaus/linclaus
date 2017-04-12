package com.seu.acm;

import java.util.*;  
public class Mod {  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner sc=new Scanner(System.in);  
        try{  
            String s1=sc.next();  
            String s2=sc.next();  
            int n1=s1.length();  
            int n2=s2.length();  
            int[] int1=new int[n1];  
            for(int i=n1-1,k=0;i>=0&&k<n1;i--,k++){  
                int1[i]=Integer.parseInt(s1.substring(k,k+1));  
            }  
            int[] int2=new int[n2];  
            for(int i=n2-1,k=0;i>=0&&k<n2;i--,k++){  
                int2[i]=Integer.parseInt(s2.substring(k,k+1));  
            }  
            int[] int3=new int[n1];  
            if(!isdelable(int1, int2)){  
                System.out.print(s1);  
            }else{  
                int3=delete(int1, int2);  
                while(isdelable(int3, int2)){  
                    //delete(s3,s2);  
                    int3=delete(int3, int2);  
                }  
                if(int3.length==0){  
                    System.out.println(0);  
                }else{  
                    for(int i=int3.length-1;i>=0;i--){  
                        System.out.print(int3[i]);  
                    }  
                }  
            }  
            sc.close();  
        }catch(Exception ex){  
            //System.out.println("null");  
            ex.printStackTrace();  
        }  
    }  
      
    //delete函数用来实现两个仅包含数字的字符串相减  
    static int[] delete(int[] int1,int[] int2){  
        int n1=int1.length;  
        int n2=int2.length;  
        int[] int3=new int[n1];  
        for(int i=0;i<n2;i++){  
            int3[i]=int2[i];  
        }  
        for(int i=0;i<n1;i++){  
            if(int1[i]>=int3[i]){  
                int1[i]=int1[i]-int3[i];  
            }else{  
                int1[i]=int1[i]+10-int3[i];  
                int1[i+1]--;  
            }  
        }  
        int k=0;  
        for(int i=n1-1;i>=0;i--){  
            if(int1[i]==0){  
                k++;  
            }else  
                break;  
        }  
        int[] int4=new int[n1-k];  
        for(int i=n1-k-1;i>=0;i--){  
            int4[i]=int1[i];  
        }  
        return int4;  
    }  
    //isdelable用来判断是否仍然可以继续执行减法  
    static boolean isdelable(int[] int1,int[] int2){  
        boolean b=false;  
        int n1=int1.length;  
        int n2=int2.length;  
        if(n1<n2){  
            b=false;  
        }else if(n1==n2){  
            int i=n1-1;  
            while(i>0&&int1[i]==int2[i]){  
                i--;  
            }  
            if(int1[i]<int2[i]){  
                b=false;  
            }else{  
                b=true;  
            }  
        }else{  
            b=true;  
        }     
        return b;  
    }  
}  
