package com.seu.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class doorofjueyu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			ArrayList<Juanzhou> juanzhou = new ArrayList<Juanzhou>();
			for (int i = 0; i < num; i++) {
				String key = sc.next();
				int value = sc.nextInt();
				juanzhou.add(new Juanzhou(key, value));
			}
			Collections.sort(juanzhou);
//			System.out.println(juanzhou.toString());
			String str = "";
			int k = juanzhou.get(0).getNum();
			for (int i = 0; i < k; i++) {
				for(int j=0;j<juanzhou.size();j++){
					if(juanzhou.get(j).getNum()==0){
						break;
					}
					str+=(juanzhou.get(j).getName()+" ");
					juanzhou.get(j).num--;
				}
			}
			System.out.println(str);
		}
	}

	static class Juanzhou implements Comparable<Juanzhou> {
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		String name;
		int num;

		public Juanzhou(String name, int num) {
			this.name = name;
			this.num = num;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name + ":" + this.num;
		}

		@Override
		public int compareTo(Juanzhou o) {
			return o.num - this.num;
		}
	}
}
