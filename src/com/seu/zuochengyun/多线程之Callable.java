package com.seu.zuochengyun;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class 多线程之Callable {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		TaskWithResult1 tsk=new TaskWithResult1(11);
		FutureTask<String> task=new FutureTask<String>(tsk);
		new Thread(task).start();
		System.out.println(task.get());
		
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>(); // Future
																				// 相当于是用来存放Executor执行的结果的一种容器
		for (int i = 0; i < 10; i++) {
			results.add(exec.submit(new TaskWithResult1(i)));
		}
		for (Future<String> fs : results) {
			if (fs.isDone()) {
				System.out.println(fs.get());
			} else {
				System.out.println("Future result is not yet complete");
			}
		}
		exec.shutdown();
	}
}
class TaskWithResult1 implements Callable<String> {
	private int id;

	public TaskWithResult1(int id) {
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		return "result of TaskWithResult " + id;
	}
}
