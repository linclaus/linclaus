package com.seu.thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ¶ÁÐ´Ëø {
	public static void main(String[] args) {
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		Service service = new Service(lock);
		new Thread(service).start();
		new Thread(service).start();

	}
}

class Service implements Runnable {
	private ReentrantReadWriteLock lock;

	public Service(ReentrantReadWriteLock lock) {
		this.lock = lock;
	}

	public void read() {
		try {
			lock.readLock();
			System.out.println("read lock " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}

	@Override
	public void run() {
		this.read();
	}
}