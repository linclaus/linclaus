package com.seu.‘”∆ﬂ‘”∞À;

import java.util.Stack;

public class ’ª ‰»Î ‰≥ˆ {
	public static void main(String[] args) {
		int[] push = { 1, 2, 3, 4 };
		int[] pop = { 3, 4, 2, 10 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0, j = 0; i < pop.length; i++) {
			if (!stack.isEmpty()) {
				if (stack.peek() != pop[i]) {
					while (push[j] != pop[i])
						stack.push(push[j++]);
					j++;
				}else{
					stack.pop();
				}
			}
		}
		if(stack.isEmpty())
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
