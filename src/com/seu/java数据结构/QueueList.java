package com.seu.java数据结构;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.poll()+","+q.poll()+","+q.poll());
//		System.out.println(q.pop()+","+q.pop()+","+q.pop());
		SeqQueue<Integer> sq=new SeqQueue();
		sq.enqueue(1);
		sq.enqueue(2);
		sq.enqueue(3);
		System.out.println(sq.dequeue()+","+sq.dequeue()+","+sq.dequeue());
	}
}

interface QQueue<T> {
	boolean isEmpty();

	void enqueue(T x);

	T dequeue();
}

class SeqQueue<T> implements QQueue<T> {
	private Object element[];
	private int front, rear;

	public SeqQueue(int length) {
		if (length < 64)
			length = 64;
		this.element = new Object[Math.abs(length)];
		this.front = this.rear = 0;
	}

	public SeqQueue() {
		this(64);
	}

	@Override
	public boolean isEmpty() {
		return this.front == this.rear;
	}

	@Override
	public void enqueue(T x) {
		if (x == null)
			return;
		if (this.front == (this.rear + 1) % this.element.length) {
			Object[] temp = this.element;
			this.element = new Object[temp.length * 2];
			int i = this.front, j = 0;
			while (i != this.rear) {
				this.element[j] = temp[i];
				j++;
				i = (i + 1) % temp.length;
			}
			this.front = 0;
			this.rear = j;
		}
		this.element[this.rear] = x;
		this.rear = (this.rear + 1) % this.element.length;
	}

	@Override
	public T dequeue() {
		if (isEmpty())
			return null;
		T temp = (T) this.element[this.front];
		this.front = (this.front + 1) % this.element.length;
		return temp;
	}

}