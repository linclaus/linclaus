package com.seu.ÔÓÆßÔÓ°Ë;

import java.util.Arrays;
import java.util.Vector;

public class ×ÖµäÊ÷ {
	class TrieNode {
		Vector<String> bwords = new Vector<String>();
		TrieNode[] next = new TrieNode[26];

		TrieNode() {
			for (int i = 0; i < 26; i++) {
				next[i] = null;
			}
		}
	}

	void insertNode(TrieNode root, String wd) {
		if (root == null) {
			root = new TrieNode();
		}
		TrieNode temp = root;
		char[] charArray = wd.toCharArray();
		Arrays.sort(charArray);
		int i = 0;
		while (i < charArray.length) {
			if (temp.next[charArray[i] - 'a'] == null) {
				temp.next[charArray[i] - 'a'] = new TrieNode();
			}
			temp = temp.next[charArray[i] - 'a'];
			i++;
		}
		temp.bwords.add(wd);
	}

	boolean searchNode(TrieNode root, String wd) {
		if (root == null)
			return false;
		char[] charArray = wd.toCharArray();
		Arrays.sort(charArray);
		int i = 0;
		TrieNode temp = root;
		while (i < charArray.length) {
			if (temp.next[charArray[i] - 'a'] == null)
				return false;
			temp = temp.next[charArray[i] - 'a'];
			i++;
		}
		for (String str : temp.bwords) {
			System.out.println(str + " ");
		}
		return true;
	}

	public void findBrother() {
		TrieNode root = new TrieNode();
		insertNode(root, "hehao");
		insertNode(root, "ehhao");
		insertNode(root, "hao");
		insertNode(root, "aoheh");
		insertNode(root, "hhao");
		insertNode(root, "haoeh");
		insertNode(root, "haoeh");
		searchNode(root, "hehao");
	}

	public static void main(String[] args) {
		new ×ÖµäÊ÷().findBrother();
	}
}
