package com.seu.zuochengyun;

import java.net.Socket;
import java.io.*;

public class TcpClient {
	public static void main(String[] args) throws Exception {
		// 1.建立tcp客户端socket，要确定要连接的服务器ip，port
		Socket s = new Socket("192.168.1.101", 9009);
		// 获取键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 2.通过建立的socket，获取输出流对象
		// 数据输出给服务器端
		OutputStream out = s.getOutputStream();
		BufferedWriter bwout = new BufferedWriter(new OutputStreamWriter(out));
		// 获取服务器端返回的数据
		// 读取服务器端发过来的信息InputStreamReader()
		BufferedReader brin = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.equals("over"))
				break;
			bwout.write(line);
			bwout.newLine();
			bwout.flush();
			String str = brin.readLine();
			System.out.println("server:" + str);
		}
		br.close();
		s.close();
	}
}
