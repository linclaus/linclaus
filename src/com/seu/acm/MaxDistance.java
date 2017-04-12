package com.seu.acm;

public class MaxDistance {
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		int leftmax;
		int rightmax;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right=null;
		}
	}
	class BinaryTree{
		private int maxlen=0;
		private int max(int a,int b){
			return a>b?a:b;
		}
		public void FindMax(TreeNode temp){
			if(temp==null){
				return;
			}
			if(temp.left==null){
				temp.leftmax=0;
			}
			if(temp.right==null){
				temp.rightmax=0;
			}
			if(temp.left!=null){
				FindMax(temp.left);
			} 
			if(temp.right!=null){
				FindMax(temp.right);
			}
			if(temp.left!=null){
				temp.leftmax=max(temp.left.leftmax,temp.right.rightmax)+1;
			}
			if(temp.right!=null){
				temp.rightmax=max(temp.right.rightmax,temp.right.rightmax)+1;
			}
			if(temp.leftmax+temp.rightmax>maxlen){
				maxlen=temp.leftmax+temp.rightmax;
			}
		}
	}
}
