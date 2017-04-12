package com.seu.thread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class 管道通信 {
	public static void main(String[] args) {
		try {
			WriteData write = new WriteData();
			ReadData read = new ReadData();
			PipedInputStream input = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream();
			out.connect(input);
			ThreadRead threadread=new ThreadRead(read, input);
			ThreadWrite threadwrite=new ThreadWrite(write, out);
			threadread.start();
			Thread.sleep(2000);
			threadwrite.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WriteData {
	public void writeMethod(PipedOutputStream out) {
		try {
			System.out.println("write: ");
			for (int i = 0; i < 300; i++) {
				String outData = "" + (i + 1);
				out.write(outData.getBytes());
				System.out.print(outData);
			}
			System.out.println();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ReadData {
	public void readMethod(PipedInputStream input) {
		try {
			System.out.println("read: ");
			byte[] byteArray = new byte[20];
			int readLength = input.read(byteArray);
			while (readLength != -1) {
				String newData = new String(byteArray, 0, readLength);
				System.out.print(newData);
				readLength = input.read(byteArray);
			}
			System.out.println();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ThreadWrite extends Thread {
	private WriteData write;
	private PipedOutputStream out;

	public ThreadWrite(WriteData write, PipedOutputStream out) {
		this.write = write;
		this.out = out;
	}

	@Override
	public void run() {
		write.writeMethod(out);
	}
}

class ThreadRead extends Thread {
	private ReadData read;
	private PipedInputStream input;

	public ThreadRead(ReadData read, PipedInputStream input) {
		this.read = read;
		this.input = input;
	}

	@Override
	public void run() {
		read.readMethod(input);
	}
}