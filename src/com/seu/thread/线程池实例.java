package com.seu.thread;

public class �̳߳�ʵ��  implements Runnable{
	public static void main(String[] args) {
		DefaultThreadPool<Runnable> threadPool = new DefaultThreadPool<>();
		threadPool.shutdown();
		threadPool.excute(new �̳߳�ʵ��());
		System.out.println(threadPool.getJobSize());
		threadPool.excute(new �̳߳�ʵ��());
		threadPool.excute(new �̳߳�ʵ��());
		System.out.println(threadPool.getJobSize());
		threadPool.excute(new �̳߳�ʵ��());
		threadPool.excute(new �̳߳�ʵ��());
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
