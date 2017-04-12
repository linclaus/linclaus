package com.seu.zuochengyun;

public class Á´±í·´×ª {
	public static void main(String[] args) {
		NodeList head=new NodeList(10);
		head.next=new NodeList(5);
		head.next.next=new NodeList(15);
		head.next.next.next=new NodeList(1);
		
		NodeList temphead=null;
		NodeList next=null;
		while(head!=null){
			next=head.next;
			head.next=temphead;
			temphead=head;
			head=next;
		}
		NodeList temp=temphead;
		while(temp!=null){
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
}
class NodeList{
	NodeList next;
	int value;
	public NodeList(int value){
		this.value=value;
	}
}