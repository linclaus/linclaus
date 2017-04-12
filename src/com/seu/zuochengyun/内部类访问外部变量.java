package com.seu.zuochengyun;

public class 内部类访问外部变量 {
	int test;
	final int test2=0;
	int test1=new Test().t;
	class Test{
		int t=内部类访问外部变量.this.test;
	}
	static int test3;
	private void function() {
		test3=0;
	}
	public static void testName(final int[] test) {
		int i=0;
		class Test {
//			int t=内部类访问外部变量.this.test;
			int t=内部类访问外部变量.this.test2;
			public void test() {
				int[] test1 = test;
				test1[0]=1;
				System.out.println(test[0]);
			}
		}
		new Test().test();
	}
	public static void main(String[] args) {
		int[] test={2};
		System.out.println(test[0]);
		testName(test);
	}
}
