package com.seu.二叉树;

import java.util.ArrayList;

public class 二叉查找树最短路径和 {
	public static void main(String[] args) {
		TNode node1 = new TNode(0, null, null);
		TNode node2 = new TNode(1, node1, null);
		TNode node3 = new TNode(3, node2, null);
		TNode node4 = new TNode(8, null, null);
		TNode node5 = new TNode(12, null, null);
		TNode node6 = new TNode(10, node4, node5);
		TNode root = new TNode(7, node3, node6);
		new 二叉查找树最短路径和();
		System.out.println(二叉查找树最短路径和.minTreePath(root));

	}

	public static int minTreePath(TNode t) {
		if (t == null)
			return 0;

		int[] minum = new int[1];
		minum[0] = Integer.MAX_VALUE;
		ArrayList<TNode> tmp = new ArrayList<TNode>();

		preorder(t, 0, minum, tmp);
		return minum[0];
	}

	static void preorder(TNode t, int sum, int[] minum, ArrayList<TNode> tmp) {
		sum += t.value;
		if (t.left == null && t.right == null) {
			if (sum < minum[0])
				minum[0] = sum;
			return;
		}

		tmp.add(t);
		if (t.left != null)
			preorder(t.left, sum, minum, tmp);
		if (t.right != null)
			preorder(t.right, sum, minum, tmp);
		tmp.remove(tmp.size() - 1);
	}
}

class TNode {
	public int value;
	public TNode left;
	public TNode right;

	public TNode(int value, TNode left, TNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
