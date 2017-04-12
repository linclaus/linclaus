package com.seu.zuochengyun;

import java.io.PipedOutputStream;

public class 管道通信Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOut() {
		return out;
	}

	@Override
	public void run() {
		String strInfo = "hello,receiver";
		try {
			out.write(strInfo.getBytes());// 写入数据
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
