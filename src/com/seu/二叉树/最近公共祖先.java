package com.seu.二叉树;

public class 最近公共祖先 {
	public static void main(String[] args) {
		Node node1=new Node(null,null,4);
		Node node2=new Node(null,null,5);
		Node node3=new Node(node1,node2,2);
		Node node4=new Node(null,null,6);
		Node node5=new Node(null,null,7);
		Node node6=new Node(node4,node5,3);
		Node root=new Node(node3,node6,1);
		System.out.println(lowestAncestor(root, node3, new Node(null,null,9)).value);
	}
	public static Node lowestAncestor(Node head,Node o1,Node o2){
		if(head==null||head==o1||head==o2){
			return head;
		}
		Node left=lowestAncestor(head.left, o1, o2);
		Node right=lowestAncestor(head.right, o1, o2);
		if(left!=null&&right!=null)
			return head;
		return left!=null?left:right;
	}
}
class Node{
	Node left,right;
	int value;
	public Node(Node left,Node right,int value){
		this.left=left;
		this.right=right;
		this.value=value;
	}
}
