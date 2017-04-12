package com.seu.thread;

public class 线程池实例  implements Runnable{
	public static void main(String[] args) {
		DefaultThreadPool<Runnable> threadPool = new DefaultThreadPool<>();
		threadPool.shutdown();
		threadPool.excute(new 线程池实例());
		System.out.println(threadPool.getJobSize());
		threadPool.excute(new 线程池实例());
		threadPool.excute(new 线程池实例());
		System.out.println(threadPool.getJobSize());
		threadPool.excute(new 线程池实例());
		threadPool.excute(new 线程池实例());
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
