package com.seu.¶þ²æÊ÷;

import java.util.LinkedList;
import java.util.Queue;

public class ZigZag´òÓ¡¶þ²æÊ÷ {
	public static void main(String[] args) {
		String[] prelistwithnull = { "A", "B", "D", null, "G", null, null,
				null, "C", "E", null, null, "F", "H", null, null, null };
		BinaryTree<String> bt = new BinaryTree<String>(prelistwithnull);
		Queue<BinaryNode<String>> queue=new LinkedList<BinaryNode<String>>();
		queue.add(bt.root);
		BinaryNode<String> last=bt.root;
		BinaryNode<String> nlast=null;
		while(!queue.isEmpty()){
			BinaryNode<String> node = queue.poll();
			System.out.print(node.data+" ");
			if(node.left!=null){
				queue.add(node.left);
				nlast=node.left;
			}
			if(node.right!=null){
				queue.add(node.right);
				nlast=node.right;
			}
			if(last==node){
				System.out.println();
				last=nlast;
			}
		}
	}
}
