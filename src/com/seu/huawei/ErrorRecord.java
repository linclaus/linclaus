package com.seu.huawei;

import java.util.*;

public class ErrorRecord {
	public static String getFileName(String path) {
		String[] p = path.split("\\\\");
		String file = p[p.length - 1];
		if (file.length() > 16) {
			return file.substring(file.length() - 16, file.length());
		} else {
			return file;
		}
	}

	public static void main(String[] args) {
		List<ErrRecord> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String input = "", path = "";
		int line = 0;
		while (in.hasNext()) {
			input = in.nextLine();
			path = input.substring(0, input.lastIndexOf(' '));
			String file = getFileName(path);
			line = Integer
					.parseInt(input.substring(input.lastIndexOf(' ') + 1));
			ErrRecord err = new ErrRecord(file, line);
			int location = list.indexOf(err);
			if (location == -1) {
				list.add(err);
			} else {
				list.get(location).count++;
			}
		}
		if (list.size() < 8)
			for (int i = 0; i < list.size(); ++i) {
				ErrRecord item = list.get(i);
				System.out.println(item.file + " " + item.lineNo + " "
						+ item.count);
			}
		else {
			for (int i = list.size() - 8; i < list.size(); ++i) {
				ErrRecord item = list.get(i);
				System.out.println(item.file + " " + item.lineNo + " "
						+ item.count);
			}
		}
	}

}

class ErrRecord {
	public String file;
	public Integer lineNo;
	public int count;

	public ErrRecord(String file, Integer lineNo) {
		this.file = file;
		this.lineNo = lineNo;
		count = 1;
	}

	@Override
	public boolean equals(Object otherObject) {
		// 自反性
		if (this == otherObject)
			return true;
		// 另一个对象不能为空
		if (otherObject == null)
			return false;
		// 如果两个对象的class不匹配，那么这两个对象不可能相等
		if (getClass() != otherObject.getClass())
			return false;
		ErrRecord other = (ErrRecord) otherObject;
		return file.equals(other.file) && lineNo.equals(other.lineNo);

	}

}