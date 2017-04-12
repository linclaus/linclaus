package com.seu.acm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {//2�� 5Сʱ   ��һ�����Сʱ��0 ���ʱ��1 �ڶ������Сʱ��3 ���ʱ��5  ��ʱ���Ƿ��꣬�����꣬ÿ��Ӧ�ж೤ʱ��
	public static boolean fun(List<Integer> lmin, List<Integer> lmax, int sumtime) {
		int mintime = 0;
		int maxtime = 0;
		for (int j = 0; j < lmin.size(); j++) {
			mintime += lmin.get(j);
			maxtime += lmax.get(j);
		}
		if (mintime <= sumtime && sumtime <= maxtime)
			return true;
		else return false;
	}
	public static int[] fun1(int[] a){
		int l=a.length-1;
		int[] b=new int[l];
		for(int i=0;i<l;i++){
			b[i]=a[i+1];
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days, sumtime;
		while (sc.hasNextLine()) {
			days = sc.nextInt();
			sumtime = sc.nextInt();
			int[] imintime = new int[days];
			int[] imaxtime = new int[days];
			for (int i = 0; i < days; i++) {
				imintime[i] = sc.nextInt();
				imaxtime[i] = sc.nextInt();
			}
			
			int mintime = 0;
			int maxtime = 0;
			for (int j = 0; j < days; j++) {
				mintime += imintime[j];
				maxtime += imaxtime[j];
			}
			if (mintime <= sumtime && sumtime <= maxtime) {
				System.out.println("YES");
				int n=0;
				int[] result=new int[days];
				List<Integer> lmin=new ArrayList<Integer>();
				List<Integer> lmax=new ArrayList<Integer>();
				for(int i=0;i<days;i++){
					lmin.add(imintime[i]);
					lmax.add(imaxtime[i]);
				}
				while(n<days){
					result[n]=imaxtime[n];
					sumtime=sumtime-result[n];
					lmin.remove(0);
					lmax.remove(0);
					while((!fun(lmin,lmax,sumtime))&&result[n]>=imintime[n]){
						result[n]--;
						sumtime++;
					}
					n++;
				}
				for(int i=0;i<days;i++)
					System.out.print(result[i]+" ");
			} else {
				System.out.println("NO");
			}
		}
	}
}
