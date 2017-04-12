package com.seu.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
			Set<String> set = new HashSet<String>();
			int[] iarray = new int[n];
			String[] sarray = new String[m];
			for (int i = 0; i < n; i++) {
				iarray[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				sarray[i] = sc.next();
				set.add(sarray[i]);
				if (hashmap.containsKey(sarray[i])) {
					hashmap.put(sarray[i], hashmap.get(sarray[i]) + 1);
				} else {
					hashmap.put(sarray[i], 1);
				}
			}
			Arrays.sort(iarray);
			Set<Entry<String, Integer>> entrySet = hashmap.entrySet();
			int[] arr = new int[hashmap.size()];
			int index = 0;
			for (Entry<String, Integer> ent : entrySet) {
				arr[index++] = ent.getValue();
			}
			Arrays.sort(arr);
			int maxsum = 0;
			int minsum = 0;
			for (int i = 0; i < arr.length; i++) {
				minsum += (arr[i] * iarray[i]);
				maxsum += (arr[i] * iarray[n - 1 - i]);
			}
			System.out.println(minsum + " " + maxsum);
		}
	}
}
