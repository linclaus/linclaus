package com.seu.�㷨;

public class ���η�֮����� {// �е��ƹ�ʽ,�����Ⲣ���໥�����������ظ��������⣬Ϊ�����ظ�������ö�̬�滮����������ñ���¼��
	public static void main(String[] args) {
		int m=26;
		int n=13;
		System.out.println(combine(m,n));
	}

	private static int combine(int m, int n) {
		if(m==0||n==0||m==n)
			return 1;
		return combine(m-1,n-1)+combine(m-1,n);
	}
}
