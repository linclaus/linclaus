package com.seu.thread;

public class µ¥ÀýÄ£Ê½ {
	public static void main(String[] args) {
		new ThreadSingleton1().start();
		new ThreadSingleton1().start();
		new ThreadSingleton1().start();
		new ThreadSingleton2().start();
		new ThreadSingleton2().start();
		new ThreadSingleton2().start();
	}
}

class ThreadSingleton1 extends Thread {
	@Override
	public void run() {
		System.out.println(Singleton1.getInstance().hashCode());
	}
}

class ThreadSingleton2 extends Thread {
	@Override
	public void run() {
		System.out.println(Singleton2.getInstance().hashCode());
	}
}

class Singleton1 {
	private static Singleton1 singleton = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return singleton;
	}
}

class Singleton2 {
	private static Singleton2 singleton;

	private Singleton2() {
	}

	public synchronized static Singleton2 getInstance() {
		if (singleton == null) {
			singleton = new Singleton2();
		}
		return singleton;
	}
}
