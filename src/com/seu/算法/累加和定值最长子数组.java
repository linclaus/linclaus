package com.seu.算法;

import java.util.HashMap;

public class 累加和定值最长子数组 {
	public static void main(String[] args) {
		int[] array = { 3,-2,-4,0,6 };
		int k = -2;
		int len = 1;
		int left = 0;
		int right = 0;
		int sum = array[0];
		
		sum=0;
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		hm.put(0, -1);
		len=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
			if(hm.containsKey(sum-k)){
				len=Math.max(len, i-hm.get(sum-k));
			}
			if(!hm.containsKey(sum))
				hm.put(sum, i);
		}
		System.out.println(len);
		
//		while (right < array.length) {//全为正数的情况
//			if (sum < k) {
//				right++;
//				if (right == array.length)
//					break;
//				sum += array[right];
//			} else if (sum == k) {
//				len = Math.max(right - left + 1, len);
//				sum -= array[left];
//				left++;
//			} else {
//				left++;
//				sum -= array[left];
//			}
//		}
//		System.out.println(len);
		
//		int[] sums=new int[array.length];
//		sums[0]=array[0];
//		for(int i=1;i<array.length;i++){
//			sums[i]=sums[i-1]+array[i];
//		}
//		int maxlen=0;
//		for(int i=0;i<sums.length;i++){
//			for(int j=i;j<sums.length;j++){
//				if(sums[j]-sums[i]<=k){
//					maxlen=Math.max(maxlen,j-i);
//				}
//				if(sums[j]<=k)
//					maxlen=Math.max(maxlen,j+1);
//			}
//		}
//		System.out.println(maxlen);
		
		
	}
}
