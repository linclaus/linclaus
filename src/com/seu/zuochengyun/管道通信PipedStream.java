package com.seu.zuochengyun;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class 管道通信PipedStream {
	public static void main(String[] args) throws IOException {
		管道通信Sender send = new 管道通信Sender();
		管道通信Reader read = new 管道通信Reader();
		PipedOutputStream out = send.getOut();
		PipedInputStream in = read.getIn();
		out.connect(in);// 或者也可以用in.connect(out);
		send.start();
		read.start();
	}
}
