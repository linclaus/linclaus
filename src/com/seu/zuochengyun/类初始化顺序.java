package com.seu.zuochengyun;

public class ���ʼ��˳�� {
	public static void main(String[] args) {
		new TestSub();
	}
}
class Sample
{
      Sample(String s)
      {
            System.out.println(s);
      }
      Sample()
      {
            System.out.println("SampleĬ�Ϲ��캯��������");
      }
}

class Test1 {
    static{
          System.out.println("����static �� 1  ִ��");
          }
    static Sample staticSam1=new Sample("���� ��̬��ԱstaticSam1��ʼ��");
    Sample sam1=new Sample("���� sam1��Ա��ʼ��");
    static Sample staticSam2=new Sample("���� ��̬��ԱstaticSam2��ʼ��");
    static{
          System.out.println("���� static �� 2  ִ��");
          }
    Test1()
    {
          System.out.println("���� TestĬ�Ϲ��캯��������");
    }
    Sample sam2=new Sample("���� sam2��Ա��ʼ��");

}

class TestSub extends Test1
{
    static Sample staticSamSub=new Sample("���� ��̬��ԱstaticSamSub��ʼ��");
    TestSub()
    {
          System.out.println("���� TestSub Ĭ�Ϲ��캯��������");
    }
    Sample sam1=new Sample("���� sam1��Ա��ʼ��");
    static Sample staticSamSub1=new Sample("���� ��̬��ԱstaticSamSub1��ʼ��");
    
    static{System.out.println("���� static ��  ִ��");}
    Sample sam2=new Sample("���� sam2��Ա��ʼ��");
}