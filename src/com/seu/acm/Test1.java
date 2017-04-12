package com.seu.acm;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		Double d=new Double(Math.sqrt(num));
		System.out.println(d.longValue());

		long[] zhishu = getZhiShu();
		for (int i = 0; i < zhishu.length; i++) {
			System.out.print(zhishu[i] + " ");
		}
		System.out.println();
		System.out.println(max(zhishu,d)+"+");
		
		while(num==1){
			if(num%zhishu[max(zhishu,d)]==0);
		}
		
	}
	
	public static int max(long[] zhishu, Double max){
		if(max<4)
			return 2;
		int i=0;
		for(;i<zhishu.length;i++){
			if(zhishu[i]>max.longValue())
				break;
		}
		return i-1;
	}

	public static long[] getZhiShu() {
		// ��100���ڵ�����
		long[] zhishu = new long[25];
		int m = 0;
		for (int i = 2; i <= 100; i++) { // ����
			for (int k = 2; k <= i; k++) { // ����
				// �ų������� i=k ֮ǰ �ܱ�k����(����Ϊ0)����
				if (i % k == 0 && i != k) {
					break;
				}
				// ��������� i=k �� i%k=0����
				if (i % k == 0 && i == k) {
					zhishu[m++] = i;
				}
			}
		}
		return zhishu;
	}

}