package com.seu.java数据结构;

import java.util.Scanner;
import java.util.Stack;

public class ComputeExpress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String express = sc.nextLine();
		Stack<String> stks = new Stack<String>();
		Stack<Integer> stki = new Stack<Integer>();
		for (int i = 0; i < express.length(); i++) {
			char ch = express.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				while (!stks.isEmpty() && !stks.peek().equals("("))
					calculate(stki, stks.pop().charAt(0));
				stks.push(ch + "");
				break;
			case '*':
			case '/':
				while (!stks.isEmpty()
						&& (stks.peek().equals("/") || stks.peek().equals("*")))
					calculate(stki, stks.pop().charAt(0));
				stks.push(ch + "");
				break;
			case '(':
				stks.push(ch + "");
				break;
			case ')':
				while (!stks.isEmpty() && !stks.peek().equals("("))
					calculate(stki, stks.pop().charAt(0));
				stks.pop();
				break;
			default:
				String num = new String();
				while (i < express.length() && ch <= '9' && ch >= '0') {
					num += ch;
					i++;
					if (i < express.length())
						ch = express.charAt(i);
				}
				stki.push(Integer.parseInt(num));
				i--;
				break;
			}
		}
		while (!stks.isEmpty())
			calculate(stki, stks.pop().charAt(0));
		System.out.println(stki);
	}

	public static void calculate(Stack<Integer> stki, char ch) {
		int result = 0;
		int y = stki.pop();
		int x = stki.pop();
		switch (ch) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		}
		stki.push(result);
	}
}
