package com.seu.二叉树;

public class 二叉树是否为包含关系 {
	public static void main(String[] args) {
		String[] prelistwithnull = { "A", "B", "D", null, "G", null, null,
				null, "C", "E", null, null, "F", "H", null, null, null };
		BinaryTree<String> bt = new BinaryTree<String>(prelistwithnull);
		BinaryTree<String> bt1 = new BinaryTree<String>(prelistwithnull);
		System.out.println(contains(bt.root,bt1.root.left));
	}

	public static boolean contains(BinaryNode<String> t1, BinaryNode<String> t2) {
		return check(t1, t2) || contains(t1.left, t2) || contains(t1.right, t2);
	}

	private static boolean check(BinaryNode<String> t1, BinaryNode<String> t2) {
		if (t2 == null) {
			return true;
		}
		if (t1 == null || t1.data != t2.data) {
			return false;
		}
		return check(t1.left, t2.left) && check(t1.right, t2.right);

	}
}
