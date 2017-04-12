package com.seu.zuochengyun;

import java.util.Stack;

public class GetMinStack {
	public static void main(String[] args) {
		GetMinStack gms=new GetMinStack();
		gms.push(1);
		gms.push(2);
		gms.push(1);
		System.out.println(gms.getMin());
		gms.pop();
		System.out.println(gms.getMin());
	}
	private Stack<Integer> data;
	private Stack<Integer> min;

	public GetMinStack() {
		this.data = new Stack<Integer>();
		this.min = new Stack<Integer>();
	}

	public void push(Integer num) {
		if (this.min.isEmpty())
			min.push(num);
		else if (num <= min.peek()) {
			min.push(num);
		}
		data.push(num);
	}
	public int pop(){
		if(this.data.isEmpty())
			throw new RuntimeException("");
		int value=this.data.pop();
		if(value==this.min.peek())
			this.min.pop();
		return value;
	}
	public int getMin(){
		if(this.min.isEmpty())
			throw new RuntimeException();
		return this.min.peek();
	}
}
