package com.seu.算法;

public class 分治法之组合数 {// 有递推公式,子问题并不相互独立，存在重复计算问题，为避免重复计算可用动态规划解决，即采用备用录。
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
