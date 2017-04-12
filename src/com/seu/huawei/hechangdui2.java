package com.seu.huawei;
import java.util.Scanner;
public class hechangdui2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int[] height = new int[num];
			for (int i = 0; i < num; i++) {
				height[i] = sc.nextInt();
			}
			int[] reverseheight=new int[num];
			for(int i=0;i<num;i++){
				reverseheight[i]=height[num-1-i];
			}
			int[] array1=function(height);
			int[] reversearray=function(reverseheight);
			int[] array2=new int[num];
			for(int i=0;i<num;i++){
				array2[i]=reversearray[num-1-i];
			}
			int max = 0;
			int index=0;
			for(int i=0;i<num;i++){
				if(max<array1[i]+array2[i]){
					max=array1[i]+array2[i];
					index=i;
				}
			}
			System.out.println(num-max+1);
			System.out.println("index: "+index);
			findup(height,array2,index);
			finddown(height,array1,index);
		}
	}
	public static void finddown(int[] height,int[] array,int index){
		int count=0;
		for(int i=index;i<array.length;){
			System.out.print(i+":"+height[i]+" ");
			count++;
			int temp=array[i]-1;
			int j=i+1;
			for(;j<array.length;j++){
				if(array[j]==temp&&height[i]>height[j]){
					break;
				}
			}
			i=j;
		}
		System.out.println();
		System.out.println("num: "+count);
	}
	
	public static void findup(int[] height,int[] array,int index){
		int count=0;
		for(int i=index;i>=0;){
			System.out.print(i+":"+height[i]+" ");
			count++;
			int temp=array[i]-1;
			int j=i-1;
			for(;j>=0;j--){
				if(array[j]==temp&&height[i]>height[j]){
					break;
				}
			}
			i=j;
		}
		System.out.println();
		System.out.println("num: "+count);
	}

	public static int[] function(int[] height) {
		int num = height.length;
		int[] array = new int[num];
		array[num - 1] = 1;
		for (int i = num - 2; i >= 0; i--) {
			int j = i + 1;
			int tmp = 0;
			for (; j < num; j++) {
				if (height[i] > height[j]) {
					tmp = (tmp > array[j] ? tmp : array[j]);
					continue;
				}
			}
			array[i] = tmp + 1;
		}
		return array;
	}
}
