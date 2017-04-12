package com.seu.thread;

public class �ȴ�֪ͨ���� {//wait,notify����������ͬ�������е��ã�ǰ���ǻ�õ�ǰ��������wait�������ͷ�����notify�ȵ�ǰ�߳�ִ����֮���ͷ���
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
