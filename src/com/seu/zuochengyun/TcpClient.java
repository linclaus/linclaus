package com.seu.zuochengyun;

import java.net.Socket;
import java.io.*;

public class TcpClient {
	public static void main(String[] args) throws Exception {
		// 1.����tcp�ͻ���socket��Ҫȷ��Ҫ���ӵķ�����ip��port
		Socket s = new Socket("192.168.1.101", 9009);
		// ��ȡ����¼��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 2.ͨ��������socket����ȡ���������
		// �����������������
		OutputStream out = s.getOutputStream();
		BufferedWriter bwout = new BufferedWriter(new OutputStreamWriter(out));
		// ��ȡ�������˷��ص�����
		// ��ȡ�������˷���������ϢInputStreamReader()
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
