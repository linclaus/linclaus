package com.seu.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//����ĵ� 1 �У�Ϊ��������������һ���ո������N m
//������ N �� <32000 ����ʾ��Ǯ���� m �� <60 ��Ϊϣ��������Ʒ�ĸ�������
//�ӵ� 2 �е��� m+1 �У��� j �и����˱��Ϊ j-1 ����Ʒ�Ļ������ݣ�ÿ���� 3
//���Ǹ����� v p q������ v ��ʾ����Ʒ�ļ۸� v<10000 ���� p ��ʾ����Ʒ��
//��Ҫ�ȣ� 1 ~ 5 ����q ��ʾ����Ʒ���������Ǹ�������� q=0 ����ʾ����ƷΪ��
//������� q>0 ����ʾ����ƷΪ������ q �����������ı�ţ�
public class ��̬�滮1 {
	static class PackageItem implements Comparable<PackageItem> {
		int weight;
		int value;
		int dependence;

		public PackageItem(int weight, int value, int dependence) {
			this.value = value;
			this.weight = weight;
			this.dependence = dependence;
		}

		@Override
		protected PackageItem clone() throws CloneNotSupportedException {
			PackageItem clone = new PackageItem(this.weight,
					this.value, this.dependence);
			return clone;
		}

		@Override
		public int compareTo(PackageItem cmp) {
			return this.weight - cmp.weight;
		}
	}

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		 int moneysum=sc.nextInt();
		 int numsum=sc.nextInt();
		 int[][] goods=new int[numsum][3];
		 for(int i=0;i<numsum;i++){
		 goods[i][0]=sc.nextInt();
		 goods[i][1]=sc.nextInt();
		 goods[i][2]=sc.nextInt();
		 }
		ArrayList<PackageItem> bagitem = new ArrayList<PackageItem>();
		for (int i = 0; i < numsum; i++) {
			if(goods[i][2]==0){
				goods[i][1]=goods[i][1]*goods[i][0];
				bagitem.add(new PackageItem(goods[i][0], goods[i][1],goods[i][2]));
			}else{
				int k=goods[i][2];
				goods[i][1]=goods[i][1]*goods[i][0]+goods[k][1]*goods[k][0];
			}
		}
		Collections.sort(bagitem);
		System.out.println(get01PackageAnswer(bagitem, moneysum));
	}

	static int get01PackageAnswer(ArrayList<PackageItem> bagitem, int bagsize) {
		if (bagitem.size() == 1 || bagsize <= bagitem.get(0).weight) {
			if (bagsize >= bagitem.get(0).weight)
				return bagitem.get(0).value;
			else
				return 0;
		}
		@SuppressWarnings("unchecked")
		ArrayList<PackageItem> nextbagitem = (ArrayList<PackageItem>) bagitem
				.clone();
		int value = nextbagitem.get(0).value;
		int weight = nextbagitem.get(0).weight;
		nextbagitem.remove(0);
		int max = Math.max(get01PackageAnswer(nextbagitem, bagsize), value
				+ get01PackageAnswer(nextbagitem, bagsize - weight));
		return max;
	}
}
