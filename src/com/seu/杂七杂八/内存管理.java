package com.seu.‘”∆ﬂ‘”∞À;

import java.util.ArrayList;
import java.util.Scanner;

public class ƒ⁄¥Êπ‹¿Ì {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int size = sc.nextInt();
		int handler = 1;
		sc.nextLine();
		ArrayList<Integer> memory = new ArrayList<Integer>();
		for (int i = 0; i < cnt; i++) {
			String cmd = sc.nextLine();
			if (cmd.contains("new")) {
				int newsize = Integer.parseInt(cmd.split(" ")[1]);
				boolean isAllocated = false;
				for (int j = 0; j < memory.size(); j++) {
					int freesize = 0;
					int index = j;
					if (memory.get(j) == 0) {
						while (j < memory.size() && memory.get(j) == 0) {
							freesize++;
							j++;
						}
					}
					if (freesize >= newsize) {
						for (int k = index; k < index + newsize; k++) {
							memory.set(k, handler);
						}
						isAllocated = true;
						System.out.println("new handler " + handler);
						handler++;
						break;
					}
				}
				if (!isAllocated) {
					if (size - memory.size() >= newsize) {
						int index = memory.size();
						for (int j = index; j < index + newsize; j++) {
							memory.add(j, handler);
						}
						System.out.println("new handler " + handler);
						handler++;
					} else {
						System.out.println("new failure");
					}
				}
			}
			if (cmd.contains("del")) {
				int hand = Integer.parseInt(cmd.split(" ")[1]);
				boolean handflag = false;
				for (int j = 0; j < memory.size(); j++) {
					if (memory.get(j).equals(new Integer(hand))) {
						memory.set(j, 0);
						handflag = true;
					}
				}
				System.out.println(memory);
				if (!handflag)
					System.out.println("del failure");
			}
			if (cmd.contains("def")) {
				while(memory.remove(new Integer(0)));
			}
		}
	}
}
