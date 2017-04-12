package com.seu.¾ØÕó;

import java.util.Arrays;

public class ¾ØÕó×ªÖÃ {
	public static void main(String[] args) {
		int[][] aa={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		for(int i=0;i<aa.length;i++){
			System.out.println(Arrays.toString(aa[i]));
		}
		int[][] bb=new ¾ØÕó×ªÖÃ().transposition(aa);
		for(int i=0;i<bb.length;i++){
			System.out.println(Arrays.toString(bb[i]));
		}
	}

	public int[][] transposition(int[][] a) {
		int b[][] = new int[a[0].length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
	}
}
