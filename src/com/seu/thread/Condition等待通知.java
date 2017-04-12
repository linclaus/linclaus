package com.seu.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionµÈ´ýÍ¨Öª {
	public static void main(String[] args) throws InterruptedException {
		MyService myservice = new MyService();
		ThreadCondition thread = new ThreadCondition(myservice);
		thread.start();
		Thread.sleep(3000);
		myservice.signal();
	}
}

class MyService {
	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();

	public void await() {
		try {
			lock.lock();
			System.out.println("await " + System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("await " + System.currentTimeMillis());
			lock.unlock();
		}
	}

	public void signal() {
		lock.lock();
		System.out.println("signal " + System.currentTimeMillis());
		condition.signal();
		lock.unlock();
	}
}

class ThreadCondition extends Thread {
	MyService myservice;

	public ThreadCondition(MyService myservice) {
		this.myservice = myservice;
	}

	@Override
	public void run() {
		myservice.await();
	}
}
