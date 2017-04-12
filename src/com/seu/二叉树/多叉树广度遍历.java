package com.seu.二叉树;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 多叉树广度遍历 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> nodes = new HashMap<String, String>();
		Queue<String> queue = new LinkedList<String>();
		String line = "";
		String father = sc.nextLine();
		int index = father.indexOf(" ");
		nodes.put(father.substring(0, index), father.substring(index));
		while (!(line = sc.nextLine()).equals("")) {
			index = line.indexOf(" ");
			nodes.put(line.substring(0, index), line.substring(index));
		}
		System.out.println(nodes);
		index = father.indexOf(" ");
		String[] split = father.split(" ");
		for (String s : split) {
			queue.add(s);
		}
		nodes.remove(split[0]);
		while (!queue.isEmpty()) {
			String poll = queue.poll();
			if (!poll.equals(""))
				System.out.print(poll + " ");
			if (nodes.containsKey(poll)) {
				String str = nodes.get(poll);
				String[] split2 = str.split(" ");
				for (String s : split2) {
					queue.add(s);
				}
			}
		}
	}
}
