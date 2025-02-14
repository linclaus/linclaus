package com.seu.java数据结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryLinkedTree {
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
		// BinaryTree<String> bt = new BinaryTree<String>(prelist, inlist,
		// true);
		// BinaryTree<String> bt = new BinaryTree<String>(postlist, inlist,
		// false);
		bt.preOrder();
		bt.inOrder();
		bt.postOrder();
		bt.levelOrder();
		bt.count();
		bt.height();
		bt.inOrderTraverse();
		bt.postOrderTraverse();
		bt.preOrderTraverse();
	}
}

class BinaryTree<T> implements BinaryTTree<T> {
	public BinaryNode<T> root;

	public BinaryTree() {
		this((BinaryNode<T>) null);
	}

	public BinaryTree(BinaryNode<T> root) {
		this.root = root;
	}

	public BinaryTree(T[] prelist) {
		this.root = create(prelist);
	}

	private int i = 0;

	private BinaryNode<T> create(T[] prelist) {
		BinaryNode<T> node = null;
		if (i < prelist.length) {
			T element = prelist[i];
			i++;
			if (element != null) {
				node = new BinaryNode<T>(element);
				node.left = create(prelist);
				node.right = create(prelist);
			}
		}
		return node;
	}

	public BinaryTree(T[] prelist, T[] inlist, boolean flag) {
		if (flag)
			this.root = createprein(prelist, inlist, 0, 0, prelist.length);
		else
			this.root = createposin(prelist, inlist, prelist.length - 1, 0,
					prelist.length);
	}

	private BinaryNode<T> createposin(T[] postlist, T[] inlist, int postend,
			int instart, int n) {
		if (n <= 0)
			return null;
		T element = postlist[postend];
		BinaryNode<T> node = new BinaryNode<T>(element);
		int i = 0;
		while (i < n && !element.equals(inlist[i + instart]))
			i++;
		node.left = createposin(postlist, inlist, postend - n + i, instart, i);
		node.right = createposin(postlist, inlist, postend - 1,
				instart + i + 1, n - i - 1);
		return node;
	}

	private BinaryNode<T> createprein(T[] prelist, T[] inlist, int prestart,
			int instart, int n) {
		if (n <= 0)
			return null;
		T element = prelist[prestart];
		int i = 0;
		while (i < n && !element.equals(inlist[i + instart]))
			i++;
		BinaryNode<T> node = new BinaryNode<T>(element);
		node.left = createprein(prelist, inlist, prestart + 1, instart, i);
		node.right = createprein(prelist, inlist, prestart + i + 1, instart + i
				+ 1, n - i - 1);
		return node;
	}

	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	@Override
	public int count() {
		int count = count(this.root);
		System.out.print("节点数有 ");
		System.out.println(count);
		return count;
	}

	private int count(BinaryNode<T> node) {
		if (node == null)
			return 0;
		return 1 + count(node.left) + count(node.right);
	}

	@Override
	public int height() {
		int height = height(this.root);
		System.out.print("高度为 ");
		System.out.println(height);
		return height;
	}

	private int height(BinaryNode<T> node) {
		if (node == null)
			return 0;
		int lh = height(node.left);
		int rh = height(node.right);

		return Math.max(lh, rh) + 1;
	}

	public void preOrderTraverse() {
		System.out.print("非递归先根遍历 ");
		Stack<BinaryNode<T>> stk = new Stack<BinaryNode<T>>();
		ArrayList<BinaryNode<T>> al = new ArrayList<BinaryNode<T>>();
		BinaryNode<T> node = this.root;
		while (node!=null) {
			if (!al.contains(node)) {
				System.out.print(node.data + " ");
				stk.push(node);
				al.add(node);
			}
			if (node.left != null && !al.contains(node.left)) {
				node = node.left;
				continue;
			}
			if (node.right != null && !al.contains(node.right)) {
				node = node.right;
				continue;
			}
			while (al.contains(node)) {
				if (!stk.isEmpty())
					node = stk.pop();
				else
					node=node.right;
			}
		}
		System.out.println();
	}

	@Override
	public void preOrder() {
		System.out.print("先根遍历 ");
		preOrder(this.root);
		System.out.println();
	}

	private void preOrder(BinaryNode<T> node) {
		if (node != null) {
			System.out.print(node.data + " ");
			if (node.left != null)
				preOrder(node.left);
			if (node.right != null)
				preOrder(node.right);
		}
	}

	public void inOrderTraverse() {
		System.out.print("非递归中序遍历 ");
		Stack<BinaryNode<T>> stk = new Stack<BinaryNode<T>>();
		BinaryNode<T> node = this.root;
		while (node != null || !stk.isEmpty()) {
			if (node != null) {
				stk.push(node);
				node = node.left;
			} else {
				node = stk.pop();
				System.out.print(node.data + " ");
				node = node.right;
			}
		}
		System.out.println();
	}

	@Override
	public void inOrder() {
		System.out.print("中根遍历 ");
		inOrder(this.root);
		System.out.println();
	}

	private void inOrder(BinaryNode<T> node) {
		if (node != null) {
			if (node.left != null)
				inOrder(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				inOrder(node.right);
		}
	}

	public void postOrderTraverse() {
		System.out.print("非递归后根遍历 ");
		Stack<BinaryNode<T>> stk = new Stack<BinaryNode<T>>();
		ArrayList<BinaryNode<T>> al = new ArrayList<BinaryNode<T>>();
		BinaryNode<T> node = this.root;
		while (node!=null) {
			if (!stk.contains(node))
				stk.push(node);
			if (node.left != null && !al.contains(node.left)) {
				node = node.left;
				continue;
			}
			if (node.right != null && !al.contains(node.right)) {
				node = node.right;
				continue;
			}
			System.out.print(node.data + " ");
			al.add(node);
			while (al.contains(node)) {
				if (!stk.isEmpty()) {
					node = stk.pop();
				}
				else
					node=node.right;
			}
		}
		System.out.println();
	}

	@Override
	public void postOrder() {
		System.out.print("后根遍历 ");
		postOrder(this.root);
		System.out.println();
	}

	private void postOrder(BinaryNode<T> node) {
		if (node != null) {
			if (node.left != null)
				postOrder(node.left);
			if (node.right != null)
				postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}

	@Override
	public void levelOrder() {
		System.out.print("深度遍历 ");
		Queue<BinaryNode<T>> q = new LinkedList<BinaryNode<T>>();
		q.add(this.root);
		while (!q.isEmpty()) {
			BinaryNode<T> temp = q.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		System.out.println();
	}

	@Override
	public BinaryNode<T> search(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryNode<T> getParent(BinaryNode<T> node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertRoot(T x) {
		// TODO Auto-generated method stub

	}

}

class BinaryNode<T> {
	public T data;
	public BinaryNode<T> left, right;

	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public BinaryNode(T data) {
		this(data, null, null);
	}

	public BinaryNode() {
		this(null, null, null);
	}

}

interface BinaryTTree<T> {
	boolean isEmpty();

	int count();

	int height();

	void preOrder();

	void inOrder();

	void postOrder();

	void levelOrder();

	BinaryNode<T> search(T key);

	BinaryNode<T> getParent(BinaryNode<T> node);

	void insertRoot(T x);
}
