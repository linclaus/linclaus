package com.seu.thread;
//线程安全包含原子性和同步性,synchronized对私有内存和共有内存做了同步
public class Volatile关键字 {//volatile能保证数据的可见性，但不支持原子性，强制从公共内存中读取变量
	public static void main(String[] args) {
		PrintString printstring=new PrintString();
		new Thread(printstring).start();
		System.out.println("end it");
		printstring.setContinuePrint(false);
	}

}

class PrintString implements Runnable {
	private boolean isContinuePrint = true;

	public boolean isContinuePrint() {
		return this.isContinuePrint();
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	public void printStringMethod() {
		try {
			while (isContinuePrint == true) {
				System.out.println("printStringMethod");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

		}
	}

	@Override
	public void run() {
		printStringMethod();
	}

}
