package com.seu.thread;

public class 等待通知机制 {//wait,notify方法必须在同步代码中调用，前提是获得当前对象锁，wait是立即释放锁，notify等当前线程执行完之后释放锁
	public static void main(String[] args) {
		Object lock = new Object();
		new Thread1(lock).start();
		new Thread1(lock).start();
		new Thread2(lock).start();
		new Thread2(lock).start();
	}
}

class Thread1 extends Thread {
	private Object lock;

	public Thread1(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			try {
				System.out.println("wait begin "+Thread.currentThread().getName());
				lock.wait();
				System.out.println("wait end "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	private Object lock;

	public Thread2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("notify begin "+Thread.currentThread().getName());
			lock.notify();
			System.out.println("notify end "+Thread.currentThread().getName());
		}
	}
}
