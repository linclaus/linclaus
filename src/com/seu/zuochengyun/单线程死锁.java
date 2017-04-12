package com.seu.zuochengyun;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class µ¥Ïß³ÌËÀËø {
	private static Lock lock=new ReentrantLock();
	public static void main(String[] args) {
		func();
	}
	public static void func(){
		lock.lock();
		System.out.println("hello");
		func();
		lock.unlock();
	}
}
