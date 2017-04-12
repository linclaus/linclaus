package com.seu.java数据结构;

public class BackTrack {
	public static void main(String[] args) {
		Queen q = new Queen(5);
		q.backtrack("");
	}
}

class Queen {
	private int count;

	public Queen(int count) {
		this.count = count;
	}

	public void backtrack(String str) {
		if (str.length() == count && !place(str)) {
			System.out.println(str);
			return;
		}
		if (!place(str)) {
			for (int i = 0; i < count; i++) {
				String temp = str + i;
				backtrack(temp);
			}
		}
	}

	public boolean place(String str) {
		char[] cs = str.toCharArray();
		int len = str.length() - 1;
		for (int i = 0; i < len; i++) {
			if (Math.abs(cs[len] - cs[i]) == Math.abs(len - i)
					|| cs[len] == cs[i])
				return true;
		}
		return false;
	}
}
