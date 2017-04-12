package com.seu.zuochengyun;

public class 多线程编程 {
	public static void main(String[] args) {
		MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		thread1.start();
		thread2.start();
		
		MyRunnableThread runthread1=new MyRunnableThread();
		MyRunnableThread runthread2=new MyRunnableThread();
		new Thread(runthread1).start();
		new Thread(runthread2).start();
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Mythread.run()");
	}
}

class otherClass{
	
}

class MyRunnableThread extends otherClass implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable.run()");
	}
	
}