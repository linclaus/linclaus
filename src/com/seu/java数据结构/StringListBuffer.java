package com.seu.java数据结构;

import java.io.Serializable;

public class StringListBuffer {
	public static void main(String[] args) {
		MyStringBuffer ms=new MyStringBuffer("abcdef");
		ms.setCharAt(3, 'x');
		System.out.println(ms);
		StringBuffer sb=new StringBuffer("abcdef");
		sb.setCharAt(3, 'x');
		System.out.println(sb);
		
	}
}

final class MyStringBuffer implements Serializable {
	private char[] value;
	private int len;

	public MyStringBuffer(int size) {
		this.value = new char[size < 16 ? 16 : size];
		this.len = 0;
	}

	public MyStringBuffer() {
		this(16);
	}

	public MyStringBuffer(String str) {
		this(str.length() + 16);
		for(int i=0;i<str.length();i++){
			this.value[i]=str.charAt(i);
		}
		this.len=str.length();
	}
	public int length(){
		return this.len;
	}
	public synchronized char charAt(int i){
		if(i<0||i>=this.len)
			throw new StringIndexOutOfBoundsException(i);
		return this.value[i];
	}
	public void setCharAt(int i,char ch){
		if(i<0||i>=this.len)
			throw new StringIndexOutOfBoundsException(i);
		this.value[i]=ch;
	}
	public String toString(){
		return new String(this.value,0,this.len);
	}
	
}
