package com.seu.huawei;
import java.math.BigInteger;
import java.util.Scanner;
 //模拟题跳过了
public class IP分类{
    public static int a=0,b=0,c=0,d=0,e=0,error=0,pri=0;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            String s = scan.next();
            getCorrectIpNum(s);
        }
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+error+" "+pri);
    }
    private static void getCorrectIpNum(String s) {
        String[] str = s.split("~");
        String ip = str[0];
        String mac = str[1];
        String[] str1 = ip.split("\\.");
        String[] str2 = mac.split("\\.");
        if(str1.length!=4 || str2.length!=4)
        {
            error++;
            return;
        }
        for(int i=0; i<4; i++){
            if(str1[i]==" "|| str2[i]==" "){
                error++;
                return ;
            }
        }
        for(int i=0; i<4;i++){
            if(Integer.parseInt(str1[i])>255 || Integer.parseInt(str2[i])>255){
                error++;
                return;
            }
        }
        String temp = "";
        for(int i=0; i < str2.length; i++ ){
            BigInteger bi = new BigInteger(str2[i]);
            temp += bi.toString(2);
               
        }
        int index = temp.indexOf("0");
        temp = temp.substring(index+1);
        if(temp.contains("1")){
            error++;
            return;
        }
        if(Integer.parseInt(str1[0])>=1 && Integer.parseInt(str1[0])<=126){
            a++;
        }
           
        if(Integer.parseInt(str1[0])>=128 && Integer.parseInt(str1[0])<=191){
            b++;
        }
        if(Integer.parseInt(str1[0])>=192 && Integer.parseInt(str1[0])<=223){
            c++;
        }
       
        if(Integer.parseInt(str1[0])>=224 && Integer.parseInt(str1[0])<=239){
            d++;
        }
        if(Integer.parseInt(str1[0])>=240 && Integer.parseInt(str1[0])<=255){
            e++;
        }
           
        if(Integer.parseInt(str1[0])==10){
            pri++;
        }
        if(Integer.parseInt(str1[0])==172){
            if(Integer.parseInt(str1[1])>=16 && Integer.parseInt(str1[1])<=31){
                pri++;
            } 
        }
        if(Integer.parseInt(str1[0])==192){
            if(Integer.parseInt(str1[1])==168){
                pri++;
            }
        }
    }
}
