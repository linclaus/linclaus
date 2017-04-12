package com.seu.zuochengyun;

import java.io.PipedInputStream;

public class 管道通信Reader extends Thread {
	private PipedInputStream in = new PipedInputStream();

	public PipedInputStream getIn() {
		return in;
	}

	@Override
	public void run() {
		byte[] buf = new byte[1024];// 声明字节数组
		try {
			int len = in.read(buf);// 读取数据，并返回实际读到的字节数
			System.out
					.println("receive from sender:" + new String(buf, 0, len));
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
