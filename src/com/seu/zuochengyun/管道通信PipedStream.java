package com.seu.zuochengyun;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class �ܵ�ͨ��PipedStream {
	public static void main(String[] args) throws IOException {
		�ܵ�ͨ��Sender send = new �ܵ�ͨ��Sender();
		�ܵ�ͨ��Reader read = new �ܵ�ͨ��Reader();
		PipedOutputStream out = send.getOut();
		PipedInputStream in = read.getIn();
		out.connect(in);// ����Ҳ������in.connect(out);
		send.start();
		read.start();
	}
}
