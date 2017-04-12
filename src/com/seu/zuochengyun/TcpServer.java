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
		// 1.建立服务器socket
		ServerSocket ss = new ServerSocket(9009);
		// 2.调用accept()
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress()
				+ "...connection");
		// 读取客户的信息的输入流
		InputStream in = s.getInputStream();
		BufferedReader brin = new BufferedReader(new InputStreamReader(in));
		// 向客户端发送信息输出流，服务端向客户端返回信息OutputStreamWriter()
		BufferedWriter brout = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		while ((line = brin.readLine()) != null) {
			System.out.println("client:" + line);
			brout.write(line.toUpperCase());// 服务器端收到信息后，将信息转为大写返回给客户端toUpperCase()
			brout.newLine();
			brout.flush();
		}
		s.close();
		ss.close();
	}
}