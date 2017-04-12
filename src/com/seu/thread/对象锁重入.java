package com.seu.thread;

public class 对象锁重入 {//synchronized是对象锁，可以异步访问非synchronized方法,为可重入锁，子类可以通过可重入锁调用父类的同步方法，同步不具有继承性

	public static void main(String[] args) {
		对象锁重入 thread=new 对象锁重入();
		new LockA(thread).start();
		new LockB(thread).start();
	}
	
	public void syn(){
		synchronized(this){
			System.out.println("SYN:"+ Thread.currentThread().getName());
		}
	}

	public void asyn(){
		synchronized(new String()){
			System.out.println("ASYN:"+ Thread.currentThread().getName());
		}
	}

	synchronized public void methodA() {
		System.out.println("A:" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			System.out.println("end A");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public void methodB() {
		System.out.println("B:" + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
			System.out.println("end B");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class LockA extends Thread {
	对象锁重入 threadA;
	public LockA(对象锁重入 thread) {
		this.threadA=thread;
	}
	
	@Override
	public void run() {
		threadA.methodA();
		threadA.syn();
	}
}

class LockB extends Thread {
	对象锁重入 threadA;
	public LockB(对象锁重入 thread) {
		this.threadA=thread;
	}
	
	@Override
	public void run() {
		threadA.asyn();
		threadA.methodB();
	}
}
