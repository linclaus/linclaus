package com.seu.acm;

public class Reverse {
	public static void main(String[] args) {
		String str="how are you";
		System.out.println(swapWords(str));
	}
	public static String swapWords(String s){
		char[] cArr=s.toCharArray();
		swap(cArr,0,s.length()-1);
		int begin=0;
		for(int i=1;i<cArr.length;i++){
			if(cArr[i]==' '){
				swap(cArr,begin,i-1);
				begin=i+1;
			}
		}
		swap(cArr,begin,cArr.length-1);
		
		return new String(cArr);
	}
	public static void swap(char[] cArr,int front,int end){
		char tmp;
		while(front<end){  
			tmp=cArr[end];
			cArr[end]=cArr[front];
			cArr[front]=tmp;
			front++;
			end--;
		}
	}
}
