package com.seu.acm;

public class Bucket {
	class Node {
		int key;
		Node next;
		public Node(){
			key=0;
			next=null;
		}
	}
	void inSort(int[] keys,int bucketsize){
		int size=keys.length;
		Node[] bucket_table=new Node[bucketsize];
		for(int i=0;i<bucketsize;i++){
			bucket_table[i]=new Node();
		}
		for(int i=0;i<size;i++){
			Node temp=new Node();
			temp.key=keys[i];
			temp.next=null;
			int index=keys[i]/bucketsize;
			Node p=bucket_table[index];
			if(bucket_table[index].key==0){
				bucket_table[index].next=temp;
				bucket_table[index].key++;
			}else{
				while(p.next!=null&&p.next.key<=keys[i]){
					p=p.next;
				}
				temp.next=p.next;
				p.next=temp;
				bucket_table[index].key++;
			}
		}
		for(int j=0;j<bucketsize;j++){
			for(Node p=bucket_table[j].next;p!=null;p=p.next){
				System.out.print(p.key+" ");
			}
		}
	}
	public static void main(String[] args) {
		int[] array={49,38,65,97,76,13,27,49};
		new Bucket().inSort(array, 10);
	}
}
