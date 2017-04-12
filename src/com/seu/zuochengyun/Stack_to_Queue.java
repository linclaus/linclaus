package com.seu.zuochengyun;

import java.util.Stack;

public class Stack_to_Queue<T> {
	public static void main(String[] args) {
		Stack_to_Queue<Integer> stq=new Stack_to_Queue<>();
		stq.add(1);
		stq.add(2);
		System.out.println(stq.poll());
		System.out.println(stq.poll());
		stq.add(3);
		System.out.println(stq.poll());
		stq.poll();
	}
	
	private Stack<T> stackpush;
	private Stack<T> stackpop;

	public Stack_to_Queue() {
		this.stackpush = new Stack<T>();
		this.stackpop = new Stack<T>();
	}

	public void add(T x) {
		this.stackpush.push(x);
	}

	public T poll() {
		if (this.stackpop.isEmpty()) {
			while (!this.stackpush.isEmpty()) {
				this.stackpop.push(this.stackpush.pop());
			}
		}
		if (this.stackpop.isEmpty())
			throw new RuntimeException("");
		return this.stackpop.pop();
	}

	public T peek() {
		if (this.stackpop.isEmpty()) {
			while (!this.stackpush.isEmpty()) {
				this.stackpop.push(this.stackpush.pop());
			}
		}
		if (this.stackpop.isEmpty())
			throw new RuntimeException("");
		return this.stackpop.peek();
	}
}
