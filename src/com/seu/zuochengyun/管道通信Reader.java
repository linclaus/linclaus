package com.seu.zuochengyun;

import java.io.PipedInputStream;

public class �ܵ�ͨ��Reader extends Thread {
	private PipedInputStream in = new PipedInputStream();

	public PipedInputStream getIn() {
		return in;
	}

	@Override
	public void run() {
		byte[] buf = new byte[1024];// �����ֽ�����
		try {
			int len = in.read(buf);// ��ȡ���ݣ�������ʵ�ʶ������ֽ���
			System.out
					.println("receive from sender:" + new String(buf, 0, len));
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
