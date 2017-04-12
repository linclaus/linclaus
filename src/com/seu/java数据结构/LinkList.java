package com.seu.java数据结构;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3 };
		Integer[] b=Arrays.copyOf(a, a.length);
		b[0]=3;
		Integer[] c=a.clone();
		c[0]=3;
		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(a));
		Collections.reverse(ll);
		System.out.println(Arrays.toString(ll.toArray()));
		System.out.println(ll.toString());
		System.out.println(Arrays.toString(a));
		SingLinkedList<Integer> sl = new SingLinkedList<Integer>(a);
		int len = sl.length();
		for (int i = 0; i < len; i++) {
			System.out.print(sl.get(i)+" ");
		}
		sl.reverse();
		for (int i = 0; i < len; i++) {
			System.out.print(sl.get(i)+" ");
		}
	}
}

class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Node() {
		this(null, null);
	}
}

class SingLinkedList<T> implements LList<T> {
	protected Node<T> head;

	public SingLinkedList() {
		this.head = new Node<T>();
	}

	public SingLinkedList(T[] element) {
		this();
		Node<T> rear = this.head;
		for (int i = 0; i < element.length; i++) {
			rear.next = new Node<T>(element[i], null);
			rear = rear.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public int length() {
		int i = 0;
		Node<T> p = this.head.next;
		while (p != null) {
			i++;
			p = p.next;
		}
		return i;
	}

	@Override
	public T get(int i) {
		if (i >= 0) {
			Node<T> p = this.head.next;
			for (int j = 0; p != null && j < i; j++)
				p = p.next;
			if (p != null)
				return p.data;
		}
		return null;
	}

	@Override
	public void set(int i, T x) {
		if (x == null)
			return;
		if (i >= 0) {
			Node<T> p = this.head.next;
			for (int j = 0; p != null && j < i; j++) {
				p = p.next;
			}
			if (p != null) {
				p.data = x;
			} else
				throw new IndexOutOfBoundsException(i + "");
		}
	}

	@Override
	public void insert(int i, T x) {
		if (x == null)
			return;
		Node<T> p = this.head;
		for (int j = 0; p.next != null && j < i; j++)
			p = p.next;
		p.next = new Node<T>(x, p.next);
	}

	@Override
	public void append(T x) {
		insert(Integer.MAX_VALUE, x);
	}

	@Override
	public T remove(int i) {
		if (i >= 0) {
			Node<T> p = this.head;
			for (int j = 0; p.next != null && j < i; j++)
				p = p.next;
			if (p.next != null) {
				T old = p.next.data;
				p.next = p.next.next;
				return old;
			}
		}
		return null;
	}

	@Override
	public void removeAll() {
		this.head.next = null;
	}

	@Override
	public T search(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void reverse() {
		Node<T> p = this.head.next, succ = null, front = null;
		while (p != null) {
			succ = p.next;
			p.next = front;
			front = p;
			p = succ;
		}
		this.head.next = front;
	}
}
