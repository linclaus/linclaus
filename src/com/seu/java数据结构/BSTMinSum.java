package com.seu.java数据结构;

import java.util.ArrayList;

public class BSTMinSum {
	static int min=Integer.MAX_VALUE;
	static int sum=0;
	public static void main(String[] args) {
		TNode root=new TNode(7);
		root.left=new TNode(3);
		root.right=new TNode(10);
		root.left.left=new TNode(1);
		root.left.left.left=new TNode(0);
		root.left.right=new TNode(5);
		root.left.right.left=new TNode(4);
		root.left.right.right=new TNode(6);
		root.right.left=new TNode(8);
		root.right.right=new TNode(12);
//		System.out.println(qianxu(root));
		System.out.println(qianxu1(root));
	}
	public static int qianxu1(TNode node){
		if(node==null)
			return 0;
		
		int[] minum = new int[1];
		minum[0]=Integer.MAX_VALUE;
		ArrayList<TNode> tmp=new ArrayList<TNode>();
		
		preorder(node, 0, minum, tmp);
		return minum[0];		
	}
	static void preorder(TNode t, int sum, int[] minum, ArrayList<TNode> tmp){
		if(t.left == null && t.right == null)
		{
			if(sum < minum[0])
				minum[0] = sum;
			return;
		}

		sum += t.value;
		tmp.add(t);
		if(t.left != null)
			preorder(t.left, sum, minum, tmp);
		if(t.right != null)
			preorder(t.right, sum, minum, tmp);
		tmp.remove(tmp.size()-1);
	}
	public static int qianxu(TNode node){
		if(node==null)
			return 0;
		sum=sum+node.value;
		if(node.left==null&&node.right==null){
			System.out.print(node.value+":"+sum+" ");
			min=min>sum?sum:min;
			sum=sum-node.value;
			return 0;
		}
		qianxu(node.left);
		qianxu(node.right);
		sum=sum-node.value;
		return min;
	}
}
class TNode{
	public int value;
	public TNode left;
	public TNode right;
	public TNode(int value){
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
