package com.seu.thread;

public class ���������� {//synchronized�Ƕ������������첽���ʷ�synchronized����,Ϊ�����������������ͨ�������������ø����ͬ��������ͬ�������м̳���

	public static void main(String[] args) {
		���������� thread=new ����������();
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
	���������� threadA;
	public LockA(���������� thread) {
		this.threadA=thread;
	}
	
	@Override
	public void run() {
		threadA.methodA();
		threadA.syn();
	}
}

class LockB extends Thread {
	���������� threadA;
	public LockB(���������� thread) {
		this.threadA=thread;
	}
	
	@Override
	public void run() {
		threadA.asyn();
		threadA.methodB();
	}
}
