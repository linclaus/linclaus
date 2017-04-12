package com.seu.thread;
//�̰߳�ȫ����ԭ���Ժ�ͬ����,synchronized��˽���ڴ�͹����ڴ�����ͬ��
public class Volatile�ؼ��� {//volatile�ܱ�֤���ݵĿɼ��ԣ�����֧��ԭ���ԣ�ǿ�ƴӹ����ڴ��ж�ȡ����
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
