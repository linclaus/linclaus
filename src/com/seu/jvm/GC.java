package com.seu.jvm;

public class GC {
	public void localvarGc1() {
		byte[] a = new byte[1 * 1024 * 1024];
		System.gc();
	}

	public void localvarGc2() {
		byte[] a = new byte[1 * 1024 * 1024];
		a = null;
		System.gc();
	}

	public void localvarGc3() {
		{
			byte[] a = new byte[1 * 1024 * 1024];
		}
		System.gc();//槽位还在
	}
	public void localvarGc4() {
		{
			byte[] a = new byte[1 * 1024 * 1024];
		}
		int c=10;//局部变量的槽位复用
		System.gc();
	}
	public void localvarGc5(){
		localvarGc1();
		System.gc();
	}
	public static void main(String[] args) {
		GC ins=new GC();
		ins.localvarGc1();
		System.out.println();
		ins.localvarGc2();
		System.out.println();
		ins.localvarGc3();
		System.out.println();
		ins.localvarGc4();
		System.out.println();
		ins.localvarGc5();
	}
}
