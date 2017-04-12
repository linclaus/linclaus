package com.seu.java数据结构;

import java.io.Serializable;

public class StringList {
	public static void main(String[] args) {
		MyString ms=new MyString(new String("abcdefg"));
		ms.substring(1, 2);
		String str="abcdefg";
		str=str.substring(0, 2)+"xyz"+str.substring(2);
		str=str.substring(0, 2)+str.substring(5);
		System.out.println(str);
		
	}
}

final class MyString implements Comparable<MyString>, Serializable {
	private final char[] value;

	public MyString() {
		this.value = new char[0];
	}

	public MyString(String original) {
		this.value = original.toCharArray();
	}

	public MyString(char[] value, int begin, int count) {
		this.value = new char[count];
		for (int i = begin; i < begin + count; i++) {
			this.value[i] = value[i];
		}
	}

	public MyString(char[] value) {
		this(value, 0, value.length);
	}

	public MyString(MyString str) {
		this(str.value);
	}

	public int length() {
		return this.value.length;
	}

	public String toString() {
		return new String(this.value);
	}

	public MyString substring(int begin, int end) {
		if (begin < 0)
			begin = 0;
		if (end > this.value.length)
			end = this.value.length;
		if (begin > end)
			throw new StringIndexOutOfBoundsException(end - begin);
		if (begin == 0 && end == this.value.length)
			return this;
		char[] buffer = new char[end - begin];
		for (int i = 0; i < buffer.length; i++)
			buffer[i] = this.value[i + begin];
		return new MyString(buffer);
	}
	public synchronized char charAt(int i){
		if(i<0||i>=this.length())
			throw new StringIndexOutOfBoundsException(i);
		return this.value[i];
	}
	public int indexOf(MyString pattern,int begin){
		if(pattern!=null&&pattern.length()>0&&this.length()>=pattern.length()){
			int i=begin,j=0;
			while(i<this.length()){
				if(this.charAt(i)==pattern.charAt(j)){
					i++;
					j++;
				}else{
					i=i-j+1;
					j=0;
				}
				if(j==pattern.length())
					return i-j;
			}
		}
		return -1;
	}
	public MyString replaceFirst(MyString pattern,MyString replacement){
		int i=this.indexOf(pattern, 0);
		if(i==-1)
			return this;
		return new MyString(this.substring(0, i).toString()+replacement+this.substring(i,this.value.length));
	}

	@Override
	public int compareTo(MyString arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
