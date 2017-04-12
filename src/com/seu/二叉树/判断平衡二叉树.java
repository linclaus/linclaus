package com.seu.¶þ²æÊ÷;


public class ÅÐ¶ÏÆ½ºâ¶þ²æÊ÷ {
	public static void main(String[] args) {
		boolean[] res = new boolean[1];
		res[0] = true;
		String[] prelistwithnull = { "A", "B", "D", null, null, "G", null,
				null, "C", "E", null, null, "F", null, null, "H" };
		BinaryTree<String> bt = new BinaryTree<String>(prelistwithnull);
		System.out.println(getHeight(bt.root, 1, res) + " " + res[0]);
	}

	public static int getHeight(BinaryNode<String> node, int level,
			boolean[] res) {
		if (node == null) {
			return level;
		}
		int lheight = getHeight(node.left, level + 1, res);
		if (!res[0])
			return level;
		int rheight = getHeight(node.right, level + 1, res);
		if (!res[0])
			return level;
		if (Math.abs(lheight - rheight) > 1)
			res[0] = false;
		return Math.max(lheight, rheight);
	}
}
