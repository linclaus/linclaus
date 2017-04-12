package com.seu.acm;

import org.junit.Test;

public class Main {
	public static void main(String[] args) {
		String a = "100999910";
		String b = "100211113";
		Main m = new Main();
		System.out.println(m.mul(a, '9'));
		System.out.println(m.add(a, b));
		System.out.println(m.multiplay(a, b));
		System.out.println((long) 999910 * 211113);
	}

	@Test
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