package com.seu.zuochengyun;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class 锁机制的实现 implements Runnable {
	AtomicBoolean state = new AtomicBoolean(false);
	public void lock() {
		while (state.getAndSet(true)) {
		}
	}
	
	public void unlock() {
		state.set(false);
	}

	private AtomicBoolean lock = new AtomicBoolean(false);

	private int i = 0;

	public static void main(String[] args) {
		AtomicInteger ai=new AtomicInteger();
		锁机制的实现 test = new 锁机制的实现();
		new Thread(test).start();
	}

	@Override
	public void run() {
		try {
			while (lock.getAndSet(true))
				;
			System.out.println(i);
			Thread.sleep(1);
			i++;
			lock.set(false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
