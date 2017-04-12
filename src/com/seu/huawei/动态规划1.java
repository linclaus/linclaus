package com.seu.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//输入的第 1 行，为两个正整数，用一个空格隔开：N m
//（其中 N （ <32000 ）表示总钱数， m （ <60 ）为希望购买物品的个数。）
//从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3
//个非负整数 v p q（其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的
//重要度（ 1 ~ 5 ），q 表示该物品是主件还是附件。如果 q=0 ，表示该物品为主
//件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）
public class 动态规划1 {
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
