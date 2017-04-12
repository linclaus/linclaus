package com.seu.zuochengyun;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 多线程编程之executor {
	public static void main(String[] args) {
		ExecutorService executorservice=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			executorservice.execute(new TestRunnable());
			System.out.println("************* a" + i + " *************");
			
		}
		executorservice.shutdown();
	}
}
class TestRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is being called");
	}
}
