package com.seu.java数据结构;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinearList {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<Integer>();

		ArrayList<Integer> al = new ArrayList<Integer>();
		SeqList<Integer> sl = new SeqList<Integer>();
		for (int i = 0; i < 5; i++) {
			al.add(i);
			sl.append(i);
		}
		Object obj=new Object();
		System.out.println(al.toString());
		{
			int d = 2 - 1;
			while (al.size() != 1) {
				System.out.print(al.remove(d) + ",");
				d = (d + 1) % al.size();
			}
			System.out.println(al.get(0));
		}
		{
			int d = 2 - 1;
			while (sl.length() != 1) {
				System.out.print(sl.remove(d) + ",");
				d = (d + 1) % sl.length();
			}
			System.out.println(sl.get(0));
		}
	}
}

interface LList<T> {
	boolean isEmpty();

	int length();

	T get(int i);

	void set(int i, T x);

	void insert(int i, T x);

	void append(T x);

	T remove(int i);

	void removeAll();

	T search(T key);
}

class SeqList<T> implements LList<T> {
	private Object[] element;
	private int len;

	public SeqList(int size) {
		this.element = new Object[size];
		this.len = 0;
	}

	public SeqList() {
		this(64);
	}

	@Override
	public boolean isEmpty() {
		return this.len == 0;
	}

	@Override
	public int length() {
		return this.len;
	}

	@Override
	public T get(int i) {
		if (i >= 0 && i < this.len)
			return (T) this.element[i];
		return null;
	}

	@Override
	public void set(int i, T x) {
		if (x == null)
			return;
		if (i >= 0 && i < this.len)
			this.element[i] = x;
		else
			throw new IndexOutOfBoundsException(i + "");
	}

	@Override
	public void insert(int i, T x) {
		if (x == null)
			return;
		if (this.len == element.length) {
			Object[] temp = this.element;
			this.element = new Object[temp.length * 2];
			for (int j = 0; j < temp.length; j++)
				this.element[j] = temp[j];
		}
		if (i < 0)
			i = 0;
		if (i > this.len)
			i = this.len;
		for (int j = this.len - 1; j >= i; j--)
			this.element[j + 1] = this.element[j];
		this.element[i] = x;
		this.len++;
	}

	@Override
	public void append(T x) {
		insert(this.len, x);
	}

	@Override
	public T remove(int i) {
		if (this.len == 0 || i < 0 || i >= this.len)
			return null;
		T old = (T) this.element[i];
		for (int j = i; j < this.len - 1; j++)
			this.element[j] = this.element[j + 1];
		this.element[this.len - 1] = null;
		this.len--;
		return old;
	}

	@Override
	public void removeAll() {
		this.len = 0;
	}

	@Override
	public T search(T key) {
		// TODO Auto-generated method stub
		return null;
	}

}
