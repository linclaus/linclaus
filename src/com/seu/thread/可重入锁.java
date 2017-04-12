package com.seu.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class 可重入锁 {
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		可重入锁 lock = new 可重入锁();
		new Mythread(lock).start();
		new Mythread(lock).start();
		new Mythread(lock).start();
		new Mythread(lock).start();
	}

	public void testMethod() {
		lock.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " testMethod "
					+ i);
		}
		lock.unlock();
	}
}

class Mythread extends Thread {
	private 可重入锁 lock;

	public Mythread(可重入锁 lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.testMethod();
	}
}
