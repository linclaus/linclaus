package com.seu.thread;

public class ���� {
	synchronized public static void printA() {
		try {
			System.out.println("A: " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("A: " + Thread.currentThread().getName()
					+ " end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		try {
			System.out.println("B: " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("B: " + Thread.currentThread().getName()
					+ " end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void synclass() {
		synchronized (����.class) {
			System.out.println("SYNCLASS:" + Thread.currentThread().getName());
		}
	}

	public void synobject() {
		synchronized (this) {
			try {
				System.out.println("SYNOBJECT:"
						+ Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("SYNOBJECT:"
						+ Thread.currentThread().getName() + " end");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ThreadA().start();
		new ThreadB().start();
	}
}

class ThreadA extends Thread {
	@Override
	public void run() {
		new ����().synobject();
		����.printA();
	}
}

class ThreadB extends Thread {
	@Override
	public void run() {

		new ����().synclass();
		����.printB();
	}
}
