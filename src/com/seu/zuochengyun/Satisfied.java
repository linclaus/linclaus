package com.seu.zuochengyun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Satisfied {
	public static class PackageItem implements Comparable<PackageItem>{
		String name;
		int weight;
		int value;

		public PackageItem(String name, int weight, int value) {
			this.name = name;
			this.value = value;
			this.weight = weight;
		}

		@Override
		protected PackageItem clone() throws CloneNotSupportedException {
			PackageItem clone = new PackageItem(this.name, this.weight,
					this.value);
			return clone;
		}

		@Override
		public int compareTo(PackageItem cmp) {
			return this.weight-cmp.weight;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] mm=new int[n];
		int[] nn=new int[n];
		for(int i=0;i<n;i++){
			mm[i]=sc.nextInt();
			nn[i]=sc.nextInt();
		}
		String[] nameArry=new String[n];
		ArrayList<PackageItem> bagitem = new ArrayList<PackageItem>();
		for (int i = 0; i < nameArry.length; i++) {
			bagitem.add(new PackageItem(nameArry[i], mm[i], nn[i]));
		}
		Collections.sort(bagitem);
		System.out.println(get01PackageAnswer(bagitem, m));
	}
	public static int get01PackageAnswer(ArrayList<PackageItem> bagitem,
			int bagsize) {
		if (bagitem.size() == 1 || bagsize < bagitem.get(0).weight) {
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
