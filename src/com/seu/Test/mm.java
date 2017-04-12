package com.seu.Test;
import java.util.Scanner;
public class mm{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String line1=sc.nextLine();
    int num=Integer.parseInt(line1);
    String line2=sc.nextLine();
    String[] nums=line2.split(",");
    String line3=sc.nextLine();
    int mov=Integer.parseInt(line3);
    int[] array=new int[nums.length];
    for(int i=0;i<nums.length;i++){
      array[i]=Integer.parseInt(nums[i]);
    }
    int temp1=array[0];
    int temp2;
    int index=mov;
    mov=mov%array.length;
    for(int cnt=0;cnt<array.length;cnt++){
      temp2=array[index];
      array[index]=temp1;
      temp1=temp2;
      index=(index+mov)%array.length;
    }
    for(int i=0;i<array.length-1;i++){
      System.out.print(array[i]+",");
    }
     System.out.print(array[array.length-1]);
  }
}