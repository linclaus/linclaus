package com.seu.zuochengyun;

import java.io.PipedOutputStream;

public class �ܵ�ͨ��Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOut() {
		return out;
	}

	@Override
	public void run() {
		String strInfo = "hello,receiver";
		try {
			out.write(strInfo.getBytes());// д������
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
