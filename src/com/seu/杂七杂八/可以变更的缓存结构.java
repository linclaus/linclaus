package com.seu.杂七杂八;

import java.util.HashMap;

public class 可以变更的缓存结构 {
	public static void main(String[] args) {
		MyCache<Integer, Integer> cache = new MyCache<>(5);
		cache.set(2, 2);
		cache.set(1, 1);
		cache.set(3, 3);
		cache.set(4, 4);
		cache.set(5, 5);
		cache.set(6, 6);
		cache.get(1);
		cache.set(2, 2);
		System.out.println(cache.get(1));
	}
}

class MyCache<K, V> {
	private HashMap<K, Node<V>> keyNodeMap;
	private HashMap<Node<V>, K> nodeKeyMap;
	private NodeDoubleLinkedList<V> nodeList;
	private int capacity;

	public MyCache(int capacity) {
		if (capacity < 1)
			throw new RuntimeException("should be more than 0");
		this.keyNodeMap = new HashMap<K, Node<V>>();
		this.nodeKeyMap = new HashMap<Node<V>, K>();
		this.nodeList = new NodeDoubleLinkedList<V>();
		this.capacity = capacity;
	}

	public V get(K key) {
		if (this.keyNodeMap.containsKey(key)) {
			Node<V> res = this.keyNodeMap.get(key);
			this.nodeList.moveNodeToTail(res);
			return res.value;
		}
		return null;
	}

	public void set(K key, V value) {
		if (this.keyNodeMap.containsKey(key)) {
			Node<V> node = this.keyNodeMap.get(key);
			node.value = value;
			this.nodeList.moveNodeToTail(node);
		} else {
			Node<V> newNode = new Node<V>(value);
			this.keyNodeMap.put(key, newNode);
			this.nodeKeyMap.put(newNode, key);
			this.nodeList.add(newNode);
			if (this.keyNodeMap.size() == this.capacity + 1)
				this.removeMostUnusedCache();
		}
	}

	private void removeMostUnusedCache() {
		Node<V> removeNode = this.nodeList.removeHead();
		K removeKey = this.nodeKeyMap.get(removeNode);
		this.nodeKeyMap.remove(removeNode);
		this.keyNodeMap.remove(removeKey);
	}
}

class Node<V> {
	public V value;
	public Node<V> last;
	public Node<V> next;

	public Node(V value) {
		this.value = value;
	}
}

class NodeDoubleLinkedList<V> {
	private Node<V> head;
	private Node<V> tail;

	public NodeDoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(Node<V> newNode) {
		if (newNode == null)
			return;
		if (head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			newNode.last = this.tail;
			this.tail = newNode;
		}
	}

	public void moveNodeToTail(Node<V> node) {
		if (this.tail == node) {
			return;
		}
		if (this.head == node) {
			this.head = node.next;
			this.head.last = null;
		} else {
			node.last.next = node.next;
			node.next.last = node.last;
		}
		node.last = this.tail;
		this.tail.next = node;
		node.next = null;
		this.tail = node;
	}

	public Node<V> removeHead() {
		if (this.head == null) {
			return null;
		}
		Node<V> res = this.head;
		if (this.head == this.tail) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = res.next;
			res.next = null;
			this.head.last = null;
		}
		return res;
	}
}
