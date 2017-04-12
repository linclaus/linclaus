package com.seu.acm;

public class TreeTest {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public Node root;

	public TreeTest() {
		root = null;
	}

	public void insert(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			Node temp = root;
			while (true) {
				if (temp.data > data) {
					if (temp.left == null) {
						temp.left = new Node(data);
						return;
					}
					temp = temp.left;
				} else {
					if (temp.right == null) {
						temp.right = new Node(data);
						return;
					}
					temp = temp.right;
				}
			}
		}
	}

	public void buildTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			insert(data[i]);
		}
	}

	public int preOrder(Node temp, int[] sum,StringBuffer path) {
		if (temp == null) {
			return 0;
		}
		sum[0] += temp.data;
//  	path.append(temp.data);//3
		if(temp.left==null&&temp.right==null){
			if(sum[0]==24){
				System.out.println("YES");
				System.out.println(path);
			}
		}//进去的时候加上，走的时候减去。进先序，走后续。左到右的过程中中序替换。
//		int p=preOrder(temp.left, sum);//1
//		sum[0]=-preOrder(temp.left, sum,path)+sum[0];//2
		path.append("左");//4
		preOrder(temp.left, sum,path);
//		path.deleteCharAt(path.length()-1);//4
//		p=preOrder(temp.right, sum);1
//		sum[0]=-preOrder(temp.right, sum,path)+sum[0];//2
		path.setCharAt(path.length()-1, '右');//5
//		path.append("右");//4
		preOrder(temp.right, sum,path);
		sum[0]-=temp.data;
		path.deleteCharAt(path.length()-1);
		return temp.data;
	}

	public void preOrder(int[] sum,StringBuffer path) {
		preOrder(root, sum,path);
	}

	public static void main(String[] args) {
		TreeTest tt = new TreeTest();
		int[] data = {2, 8, 7, 4, 9, 3, 1, 6, 7, 5 };
		tt.buildTree(data);
		int[] sum = { 0 };
		StringBuffer path=new StringBuffer();
		tt.preOrder(sum,path);
	}
}
