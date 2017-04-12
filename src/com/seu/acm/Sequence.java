package com.seu.acm;

import java.util.Scanner;


public class Sequence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int p=sc.nextInt();
			if(n==1)
				System.out.println(1%p);
			if(n==2)
				System.out.println(Math.pow(a, b)%p);
			int ab=(int)Math.pow(a, b);
			String fn2="1";
			String fn1=ab+"";
			String answer;
			Sequence s=new Sequence();
			for(int j=3;j<=n;j++){
				answer=multiply(multiply(ab+"", multiply(fn1, multiply(fn1,fn1))), fn2);
//				answer=s.multiplay(s.multiplay(ab+"", s.multiplay(fn1, s.multiplay(fn1, fn1))), fn2);
				fn2=fn1;
				fn1=answer;
				System.out.println(answer);
			}
		}
	}
	
	public static String multiply(String a,String b){
		StringBuffer sba=new StringBuffer(a);
		StringBuffer sbb=new StringBuffer(b);
		sba.reverse();
		sbb.reverse();
		int[] answer=new int[sba.length()+sbb.length()];
		for(int i=0;i<sba.length();i++){
			for(int j=0;j<sbb.length();j++){
				answer[i+j]+=Integer.parseInt(sba.charAt(i)+"")*Integer.parseInt(sbb.charAt(j)+"");
			}
		}
		translate(answer);
		String ans="";
		for(int i=answer.length-1;i>=0;i--){
			ans+=answer[i];
		}
		if(ans.charAt(0)=='0')
			ans=ans.substring(1);
		return ans;
	}
	public static void translate(int[] answer){
		int c=0;
		for(int i=0;i<answer.length;i++){
			answer[i]+=c;
			c=answer[i]/10;
			answer[i]%=10;
		}
	}
	
	public String mul(String a, char b) {
		char[] ca = a.toCharArray();
		char[] cq = new char[ca.length + 1];
		for (int i = 0; i < cq.length; i++) {
			cq[i] = '0';
		}
		for (int i = ca.length; i > 0; i--) {
			int c = (ca[i - 1] - 48) * (b - 48);
			int t = (cq[i] - 48) + (c % 10);
			cq[i] = (char) (t % 10 + 48);
			cq[i - 1] = (char) (c / 10 + +t / 10 + 48);
		}
		return trim(new String(cq));
	}

	public String add(String a, String b) {
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		int ic = 0;
		int i = 0;
		char[] cq = new char[Math.max(ca.length, cb.length) + 1];
		for (int j = 0; j < cq.length; j++) {
			cq[j] = '0';
		}
		for (; i < Math.min(ca.length, cb.length); i++) {
			int c = (ca[ca.length - 1 - i] - 48) + (cb[cb.length - 1 - i] - 48)
					+ ic;
			cq[cq.length - 1 - i] = (char) (c % 10 + 48);
			ic = c / 10;
		}
		while (i < ca.length) {
			cq[cq.length - 1 - i] = (char) (((ic + ca[ca.length - 1 - i] - 48) % 10) + 48);
			ic = (ic + ca[ca.length - 1 - i] - 48) / 10;
			i++;
		}
		while (i < cb.length) {
			cq[cq.length - 1 - i] = (char) (ic + cb[cb.length - 1 - i]);
			ic = (ic + cb[cb.length - 1 - i] - 48) / 10;
			i++;
		}
		cq[cq.length - 1 - i] = (char) (ic + 48);
		return trim(new String(cq));
	}

	public String multiplay(String a, String b) {
		char[] cb = b.toCharArray();
		String sum = mul(a, cb[cb.length - 1]);
		for (int i = 1; i < cb.length; i++) {
			sum = add(sum, mul(multen(a, i), cb[cb.length - i - 1]));
		}
		return trim(sum);
	}

	public String multen(String a, int n) {
		String s = a;
		for (int i = 0; i < n; i++) {
			s = mul(mul(s, '5'), '2');
		}
		return trim(s);
	}
	public String trim(String a){
		char[] ca=a.toCharArray();
		for(int i=0;i<ca.length;i++){
			if(ca[i]!='0')
				return a.substring(i);
		}
		return a;
	}
}
