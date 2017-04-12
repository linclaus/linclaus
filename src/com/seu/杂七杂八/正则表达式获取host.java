package com.seu.杂七杂八;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则表达式获取host {
	public static void main(String[] args) {
		String URL="http://www.jb51.net/article/47101.htm";
		System.out.println(getHost(URL));
	}

	public static String getHost(String url) {
		if (url == null || url.trim().equals("")) {
			return "";
		}
		String host = "";
		Pattern p = Pattern.compile("(?<=//|)((\\w)+\\.)+\\w+");
		Matcher matcher = p.matcher(url);
		if (matcher.find()) {
			host = matcher.group();
		}
		return host;
	}
}
