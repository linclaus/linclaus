package com.seu.java数据结构;

import java.util.Scanner;
import java.util.Stack;

public class Expression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expstr = sc.nextLine();
		System.out.println(toPostfix(expstr));
		System.out.println(value(toPostfix(expstr)));
	}

	public static int value(String postfix) {
		Stack<Integer> stk = new Stack<Integer>();
		int i = 0, result = 0;
		while (i < postfix.length()) {
			char ch = postfix.charAt(i);
			if (ch <= '9' && ch >= '0') {
				result = 0;
				while (ch != ' ') {
					result = result * 10 + Integer.parseInt(ch + "");
					i++;
					ch = postfix.charAt(i);
				}
				i++;
				stk.push(result);
			} else {
				int y = stk.pop();
				int x = stk.pop();
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
				i++;
				stk.push(result);
			}
		}
		return stk.peek();
	}

	public static String toPostfix(String expstr) {
		Stack<String> stk = new Stack<String>();
		String postfix = "";
		for (int i = 0; i < expstr.length();) {
			char ch = expstr.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				while (!stk.isEmpty() && (!stk.peek().equals("(")))
					postfix += stk.pop();
				stk.push(ch + "");
				i++;
				break;
			case '/':
			case '*':
				while (!stk.isEmpty()
						&& (stk.peek().equals("*") || stk.peek().equals("/")))
					postfix += stk.pop();
				stk.push(ch + "");
				i++;
				break;
			case '(':
				stk.push(ch + "");
				i++;
				break;
			case ')':
				while (!stk.isEmpty() && !stk.peek().equals("("))
					postfix += stk.pop();
				stk.pop();
				i++;
				break;
			default:
				while (i < expstr.length() && ch >= '0' && ch <= '9') {
					postfix += ch;
					i++;
					if (i < expstr.length())
						ch = expstr.charAt(i);
				}
				postfix += " ";
				break;
			}
		}
		while (!stk.isEmpty())
			postfix += stk.pop();
		return postfix;
	}
}
