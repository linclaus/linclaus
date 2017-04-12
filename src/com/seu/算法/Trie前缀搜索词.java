package com.seu.�㷨;

import java.util.HashMap;
import java.util.Map.Entry;

public class Trieǰ׺������ {
	class TrieNode {
		Character letter;
		boolean flag = false;
		HashMap<Character, TrieNode> nextletter = new HashMap<Character, TrieNode>();
	}

	TrieNode insertNode(TrieNode root, String wd) {
		char[] chars = wd.toCharArray();
		TrieNode temp = root;
		for (int i = 0; i < chars.length; i++) {
			if (!temp.nextletter.containsKey(chars[i])) {
				TrieNode node = new TrieNode();
				node.letter = chars[i];
				temp.nextletter.put(chars[i], node);
			}
			temp = temp.nextletter.get(chars[i]);
		}
		temp.flag = true;
		return root;
	}

	void searchNode(TrieNode root, String wd) {
		char[] chars = wd.toCharArray();
		TrieNode temp = root;
		for (int i = 0; i < chars.length; i++) {
			if (!temp.nextletter.containsKey(chars[i]))
				return;
			temp = temp.nextletter.get(chars[i]);
		}
		print(temp,wd);
	}
	void print(TrieNode node,String wd){
		if(node.flag)
			System.out.println(wd);
		if(node.nextletter.isEmpty())
			return;
		for(Entry<Character, TrieNode> ent:node.nextletter.entrySet()){
			print(ent.getValue(),wd+ent.getKey());
		}
	}

	void func() {
		TrieNode root = new TrieNode();
		root = insertNode(root, "�й���");
		root = insertNode(root, "�л����񹲺͹�");
		root = insertNode(root, "�л����񹲺͹�");
		root = insertNode(root, "�й�������");
		root = insertNode(root, "�Ұ��й�");
		root = insertNode(root, "�Ұ��Ҽ�");
		searchNode(root, "��");
		searchNode(root, "");
	}

	public static void main(String[] args) {
		new Trieǰ׺������().func();
	}
}
