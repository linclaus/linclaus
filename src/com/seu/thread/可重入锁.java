package com.seu.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class �������� {
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		�������� lock = new ��������();
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
	private �������� lock;

	public Mythread(�������� lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.testMethod();
	}
}
