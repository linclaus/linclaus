package com.seu.huawei;

import java.util.ArrayList;
import java.util.Collections;

public class ¶¯Ì¬¹æ»® {
	public static class PackageItem implements Comparable<PackageItem> {
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
			return this.weight - cmp.weight;
		}
	}

	public static void main(String[] args) {
		String[] nameArry = { "a", "a", "a" };
		// int[] weight={800,400,300,400,500};
		// int[] value={1600,2000,1500,1200,1000};
		int[] weight = { 3, 6, 7 };
		int[] value = { 5, 11, 12 };
		// int[] weight = { 2, 5, 6, 2, 4 };
		// int[] value = { 6, 4, 5, 3, 6 };
		ArrayList<PackageItem> bagitem = new ArrayList<PackageItem>();
		for (int i = 0; i < nameArry.length; i++) {
			bagitem.add(new PackageItem(nameArry[i], weight[i], value[i]));
		}
		Collections.sort(bagitem);
		System.out.println(get01PackageAnswer(bagitem, 10));
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
