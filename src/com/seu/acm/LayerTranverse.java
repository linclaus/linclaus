package com.seu.acm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LayerTranverse {
	static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	static class Tree {
		public TreeNode root;

		public Tree() {
			this.root = null;
		}

		public void insert(int data) {
			if (root == null) {
				root = new TreeNode(data);
				return;
			}
			TreeNode temp = root;
			while (true) {
				if (temp.data > data) {
					if (temp.left == null) {
						temp.left = new TreeNode(data);
						break;
					}
					temp = temp.left;
				} else {
					if (temp.right == null) {
						temp.right = new TreeNode(data);
						break;
					}
					temp = temp.right;
				}
			}
		}
  
		public void layerTranverse() {
			if (root == null) {
				return;
			}
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(this.root);
			while (!queue.isEmpty()) {
				TreeNode node = queue.poll();
				System.out.print(node.data + " ");
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 2, 8, 7, 4, 9, 3, 1, 6, 7, 5 };
		Tree tree=new Tree();
		for (int i = 0; i < data.length; i++) {
			tree.insert(data[i]);
		}
		tree.layerTranverse();
	}
}
