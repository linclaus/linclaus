package com.seu.java数据结构;

import java.util.Stack;

public class Exp_bracket {
	public static String isValid(String expstr) {
		Stack<String> stk=new Stack<String>();
		for(int i=0;i<expstr.length();i++){
			char ch=expstr.charAt(i);
			switch (ch) {
			case '(':
				stk.push("(");
				break;
			case ')':
				if(stk.isEmpty()||!stk.pop().equals("("))
					return "期望(";
				break;
			}
		}
		return stk.isEmpty()?"":"期望)";
	}
	public static void main(String[] args) {
		String expstr="((1+2)*(3+4))";
		System.out.println(expstr+" "+isValid(expstr));
	}
}
