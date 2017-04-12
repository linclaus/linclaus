package com.seu.thread;

import java.util.Scanner;

public class ѭ����ӡabc implements Runnable {

	private String name;
	private Object prev;
	private Object self;
	private int count;

	private ѭ����ӡabc(String name, Object prev, Object self,int count) {
		this.name = name;
		this.prev = prev;
		this.self = self;
		this.count=count;
	}

	@Override
	public void run() {
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name);
					count--;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					self.notify();
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String cmd=sc.nextLine();
		if(!cmd.contains(" ")){
			System.out.println("error");
			return;
		}
		String[] cmds=cmd.split(" ");
		if(cmds.length!=2||Integer.parseInt(cmds[0])<=0){
			System.out.println("error");
			return;
		}
		int count=Integer.parseInt(cmds[0]);
		String str=cmds[1];
		Character[] obj=new Character[str.length()];
		for(int i=0;i<str.length();i++){
			obj[i]=str.charAt(i);
		}
		ѭ����ӡabc[] thread=new ѭ����ӡabc[str.length()];
		for(int i=0;i<str.length();i++){
			if(i==0){
				thread[i]=new ѭ����ӡabc(obj[i]+"",obj[str.length()-1],obj[i],count);
				continue;
			}
			thread[i]=new ѭ����ӡabc(obj[i]+"",obj[i-1],obj[i],count);
		}
		for(int i=0;i<str.length();i++){
			new Thread(thread[i]).start();
			Thread.sleep(1);
		}
		
//		Object a = new Object();
//		Object b = new Object();
//		Object c = new Object();
//		ѭ����ӡabc pa = new ѭ����ӡabc("A", c, a,2);
//		ѭ����ӡabc pb = new ѭ����ӡabc("C", a, b,2);
//		ѭ����ӡabc pc = new ѭ����ӡabc("B", b, c,2);
//
//		new Thread(pa).start();
//		new Thread(pb).start();
//		new Thread(pc).start();
	}
}