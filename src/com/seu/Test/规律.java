package com.seu.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ¹æÂÉ {
	public static void getresult(String input) {
		char[] inputs = input.toCharArray();
		ArrayList<Character> result = new ArrayList<Character>();
		ArrayList<Integer> result1 = new ArrayList<Integer>();
		for (int i = 0; i < inputs.length; i++) {
			if (!result.contains(inputs[i])) {
				result.add(inputs[i]);
			}
		}
		for (int i = 0; i < result.size(); i++) {
			char tmp = result.get(i);
			int count = 0;
			for (int j = 0; j < inputs.length; j++) {
				if (tmp == inputs[j]) {
					count++;
				}
			}
			result1.add(count);
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.print("" + result1.get(i) + result.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			getresult(input);
		}
	}

}
