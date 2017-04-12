package com.seu.算法;

public class 动态规划之组合数 {
	public static void main(String[] args) {
		int m = 11;
		int n = 3;
		System.out.println(combine(m, n));
	}

	private static int combine(int m, int n) {
		if (n == 0 || m == 0)
			return 1;
		int mat[][]=new int[m][];
		for(int i=0;i<m;i++){
			mat[i]=new int[i+2];
			mat[i][0]=1;
			mat[i][i+1]=1;
			for(int j=1;j<=i;j++){
				mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
			}
		}
		return mat[m-1][n];
	}
}
