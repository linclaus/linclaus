package com.seu.Test;

public class ���ɱ����β����� {
	public static void main(String[] args) {//�Ͱ˴��������һ��������ֵ������Ҫַ����Ҫ������[0]��
		String testString="shican";
		sfunc(testString);
		System.out.println("ʵ�Σ�"+testString);
		
		Integer testInteger=1;
		ifunc(testInteger);
		System.out.println("ʵ�Σ�"+testInteger);
	}
	
	public static void sfunc(String testString){
		testString="xingcan";
		System.out.println("�βΣ�"+testString);
	}
	public static void ifunc(Integer testInteger){
		testInteger=2;
		System.out.println("�βΣ�"+testInteger);
	}
}
