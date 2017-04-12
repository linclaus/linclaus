package com.seu.acm;

public class BinaryTree {
	class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			this.data = data;
			left=null;
			right=null;
		}
	}
	
	private Node root;

	public BinaryTree() {
		root = null;
	}

	private void insert(int data){
		if(root==null){
			root=new Node(data);
		}else{
			Node temp=root;
			while(true){
				if(data<temp.data){
					if(temp.left==null){
						temp.left=new Node(data);
						break;
					}
					temp=temp.left;
					continue;
				}else{
					if(temp.right==null){
						temp.right=new Node(data);
						break;
					}
					temp=temp.right;
					continue;
				}
			}
		}
	}

	public void buildTree(int[] data){
		for(int i=0;i<data.length;i++){
			insert(data[i]);
		}
	}

	private void inOrder(Node temp){
		if(temp==null)
			return;
		inOrder(temp.left);
		System.out.print(temp.data+" ");
		inOrder(temp.right);
	}
	public void inOrder(){
		inOrder(this.root);
	}
	
	private void preOrder(Node temp){
		if(temp==null)
			return;
		System.out.print(temp.data+" ");
		preOrder(temp.left);
		preOrder(temp.right);
	}
	public void preOrder(){
		preOrder(this.root);
	}

	private void postOrder(Node temp){
		if(temp==null)
			return;
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.print(temp.data+" ");
	}
	public void postOrder(){
		postOrder(this.root);
	}
	
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		int[] data={2,8,7,4,9,3,1,6,7,5};
		bt.buildTree(data);
		bt.inOrder();
		System.out.println();
		bt.preOrder();
		System.out.println();
		bt.postOrder();
	}
}
