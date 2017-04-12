package com.seu.二叉树;

public class 二叉树的最大距离 {
	public static void main(String[] args) {
		BinaryNode<Character> root = new BinaryNode<Character>('a');
		root.left = new BinaryNode<Character>('b');
		root.right = new BinaryNode<Character>('c');
		String[] prelist = { "A", "B", "D", "G", "C", "E", "F", "H" };
		String[] inlist = { "D", "G", "B", "A", "E", "C", "H", "F" };
		String[] postlist = { "G", "D", "B", "E", "H", "F", "C", "A" };
		String[] prelistwithnull = { "A", "B", "D", null, "G", null, null,
				null, "C", "E", null, null, "F", "H", null, null, null };
		BinaryTree<String> bt = new BinaryTree<String>(prelistwithnull);
		System.out.println(postOrder(bt.root, new int[1]));
	}

	public static int postOrder(BinaryNode<String> node, int[] len) {
		if (node == null) {
			len[0] = 0;
			return 0;
		}
		int lmax = postOrder(node.left, len);
		int llen = len[0];
		int rmax = postOrder(node.right, len);
		int rlen = len[0];
		len[0] = Math.max(llen, rlen) + 1;
		return Math.max(Math.max(lmax, rmax), llen + rlen + 1);
	}
}
