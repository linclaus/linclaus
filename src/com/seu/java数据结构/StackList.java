package com.seu.java数据结构;

import java.util.Stack;

public class StackList {
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(1);
		stk.push(2);
		System.out.println(stk.pop()+" "+stk.pop());
		SeqStack<Integer> sst=new SeqStack<>();
		sst.push(1);
		sst.push(2);
		System.out.println(sst.pop()+" "+sst.pop());
	}
}

interface SStack<T> {
	boolean isEmpth();

	void push(T x);

	T pop();

	T get();
}

class SeqStack<T> implements SStack<T> {
	private Object element[];
	private int top;

	public SeqStack(int size) {
		this.element = new Object[Math.abs(size)];
		this.top = -1;
	}

	public SeqStack() {
		this(64);
	}

	@Override
	public boolean isEmpth() {
		return this.top == -1;
	}

	@Override
	public void push(T x) {
		if(x==null)
			return;
		if(this.top==element.length-1){
			Object[] temp=this.element;
			this.element=new Object[temp.length*2];
			for(int i=0;i<temp.length;i++){
				this.element[i]=temp;
			}
		}
		this.top++;
		this.element[this.top]=x;
	}

	@Override
	public T pop() {
		return (this.top==-1?null:(T) this.element[this.top--]);
	}

	@Override
	public T get() {
		return (this.top==-1?null:(T) this.element[this.top]);
	}

}