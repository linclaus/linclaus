package com.seu.Test;

import java.util.HashSet;
import java.util.Scanner;

public class ÍøÒ×ÓÎÏ· {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			int[] array = new int[L];
			for (int j = 0; j < L; j++) {
				array[j] = sc.nextInt();
			}
			HashSet<Integer> hs = new HashSet<Integer>();
			int min=0;
			int max=0;
			for (int k = 0; k < N-1; k++) {
				min=N;
				int j = k;
				for (; j < L - N;) {
					hs.clear();
					for (int m = 0; m < N; m++) {
						hs.add(array[k + m]);
					}
					min=Math.min(min, hs.size());
					j += N;
				}
				hs.clear();
				if(j<L){
					for(int m=j;m<L;m++){
						if(!hs.contains(array[m])){
							hs.add(array[m]);
						}else{
							min=N-1;
							break;
						}
					}
				}
				max=Math.max(min, max);
			}
			if (max!=N) {
				System.out.println("B");
			} else {
				System.out.println("CAN'T DECIDE");
			}
		}
	}
}
//5
//5 5
//1 2 3 4 5
//4 6
//2 3 1 2 2 4
//4 6
//2 3 1 2 3 4
//2 4
//1 1 2 2
//2 5
//1 1 1 2 2