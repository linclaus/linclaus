package com.seu.acm;

public class MyThread {
	static private int a;
	static public int b;
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		Threadrunnable threadrunnable = new Threadrunnable();
		Thread thread = new Thread(threadrunnable);
		thread.start();
		threadTest.start();
	}
}

class ThreadTest extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread test");
	}
}
class Threadrunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("runnable test");
	}
	
}
