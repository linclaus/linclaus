package com.seu.zuochengyun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		// 1.����������socket
		ServerSocket ss = new ServerSocket(9009);
		// 2.����accept()
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()
				+ "...connection");
		// ��ȡ�ͻ�����Ϣ��������
		InputStream in = s.getInputStream();
		BufferedReader brin = new BufferedReader(new InputStreamReader(in));
		// ��ͻ��˷�����Ϣ��������������ͻ��˷�����ϢOutputStreamWriter()
		BufferedWriter brout = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		while ((line = brin.readLine()) != null) {
			System.out.println("client:" + line);
			brout.write(line.toUpperCase());// ���������յ���Ϣ�󣬽���ϢתΪ��д���ظ��ͻ���toUpperCase()
			brout.newLine();
			brout.flush();
		}
		s.close();
		ss.close();
	}
}