package com.seu.acm;

import java.util.Scanner;
import java.util.Vector;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right=null;
	}
}
class Tree{
	TreeNode root;
	public Tree(){
		this.root=null;
	}
	public void insert(int data){
		if(this.root==null){
			this.root=new TreeNode(data);
			return;
		}
		TreeNode temp=root;
		while(true){
			if(temp.data>data){
				if(temp.left==null){
					temp.left=new TreeNode(data);
					break;
				}
				temp=temp.left;
				continue;
			}else{
				if(temp.right==null){
					temp.right=new TreeNode(data);
					break;
				}
				temp=temp.right;
				continue;
			}
		}
	}
}

public class TreeFindPath {
	public void FindPath(Tree tree,int expectsum){
		if(tree.root==null)
			return;
		Vector<Integer> path=new Vector<Integer>();
		int currentsum=0;
		FindPath(tree.root,expectsum,path,currentsum);
	}
	private void FindPath(TreeNode temp, int expectsum, Vector<Integer> path,
			int currentsum) {
		currentsum+=temp.data;
		path.add(temp.data);
		if(currentsum==expectsum&&temp.left==null&&temp.right==null){
			System.out.println("a path is found");
			for(Integer in:path){
				System.out.print(in+" ");
			}
			System.out.println();
		}
		if(temp.left!=null){
			FindPath(temp.left, expectsum, path, currentsum);
		}
		if(temp.right!=null){
			FindPath(temp.right, expectsum, path, currentsum);
		}
		path.remove(path.size()-1);
	}
	public static void main(String[] args){
  		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int expectsum=sc.nextInt();
		Tree tree=new Tree();
		for(int i=0;i<num;i++){
			tree.insert(sc.nextInt());
		}
		TreeFindPath tf=new TreeFindPath();
		tf.FindPath(tree, expectsum);
	}
}
