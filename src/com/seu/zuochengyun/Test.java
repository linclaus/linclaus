package com.seu.zuochengyun;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;

public class Test {
	public static void main(String[] args) {
		System.out.println( Integer.toBinaryString(8));
//		int i = 9;
//		System.out.println(1000000008L % 125000001);
//		for (int j = 1; j < i+1; j++)
//			System.out.println(((1000000007L * j) + 1) % (281250001+1));
//		BigInteger num = new BigInteger("-1111111111111111111");
//		System.out.println(num.add(new BigInteger(1 + "")));
		int num=10;
		num=~num;
		String binaryString = Integer.toBinaryString(num);
		System.out.println(binaryString);
		
		System.out.println(num);
		
		BitSet bs=new BitSet(1);
		bs.set(21, true);
		bs.set(4, true);
		System.out.println(Arrays.toString(bs.toLongArray()));
		byte[] byteArray = bs.toByteArray();
		for(int i=0;i<byteArray.length;i++){
			System.out.print(byteArray[i]+" ");
		}
		System.out.println(Arrays.toString(byteArray));
		System.out.println(bs);
	}
}
