package com.seu.java数据结构;


public class BinarySortTree<T extends Comparable<T>> {
	public static void main(String[] args) {
		Integer[] values={5,3,7,9,2};
		BinarySortTree<Integer> bst=new BinarySortTree<>(values);
		bst.inOrder();
	}

	public BinaryNode<T> root;

	public BinarySortTree() {
		this.root = null;
	}

	public BinarySortTree(T[] values) {
		this();
		for (int i = 0; i < values.length; i++) {
			insert(values[i]);
		}
	}
	public void inOrder(){
		inOrder(root);
	}
	public void inOrder(BinaryNode<T> node){
		if(node.left!=null)
			inOrder(node.left);
		System.out.print(node.data+" ");
		if(node.right!=null)
			inOrder(node.right);
	}

	public void insert(T x) {
		if (x == null)
			return;
		if (this.root == null)
			this.root = new BinaryNode<T>(x);
		else {
			BinaryNode<T> node = this.root;
			while (true) {
				if (x.compareTo(node.data) < 0) {
					if (node.left == null) {
						node.left = new BinaryNode<>(x);
						return;
					}
					node = node.left;
				} else if (x.compareTo(node.data) > 0) {
					if (node.right == null) {
						node.right = new BinaryNode<>(x);
						return;
					}
					node = node.right;
				} else
					return;
			}
		}
	}
}
