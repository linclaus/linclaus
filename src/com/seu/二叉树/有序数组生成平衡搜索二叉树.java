package com.seu.二叉树;



public class 有序数组生成平衡搜索二叉树 {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7};
		BinaryNode<String> root=generateTree(array,0,array.length-1);
		BinaryTree<String> bt=new BinaryTree<String>(root);
		bt.inOrder();
		bt.levelOrder();
		bt.height();
	}
	public static BinaryNode<String> generateTree(int[] array,int start,int end){
		if(start>end)
			return null;
		int mid=(start+end)/2;
		BinaryNode<String> node=new BinaryNode<String>(array[mid]+"");
		node.left=generateTree(array, start, mid-1);
		node.right=generateTree(array, mid+1, end);
		return node;
	}
}
