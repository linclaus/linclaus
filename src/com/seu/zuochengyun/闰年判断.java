package com.seu.zuochengyun;

import java.util.Scanner;

public class »ÚƒÍ≈–∂œ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		System.out.println(time.substring(0, time.length()));
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int year = Integer.parseInt(time.substring(0, 4));
		int month = Integer.parseInt(time.substring(4, 6));
		int day = Integer.parseInt(time.substring(6, 8));
		int hour = Integer.parseInt(time.substring(8, 10));
		int minutes = Integer.parseInt(time.substring(10, 12));
		int second = Integer.parseInt(time.substring(12, 14));
		int c = 0;
		second++;
		if (second == 60) {
			second = 00;
			c = 1;
		}
		if (c == 1) {
			c = 0;
			minutes++;
			if (minutes == 60) {
				minutes = 00;
				c = 1;
			}
		}
		if (c == 1) {
			c = 0;
			hour++;
			if (hour == 24) {
				hour = 00;
				c = 1;
			}
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			months[1] = 29;
		if (c == 1) {
			c = 0;
			day++;
			if(day==months[month-1]+1){
				day=01;
				c=1;
			}
		}
		if(c==1){
			c=0;
			month++;
			if(month==13){
				month=01;
				c=1;
			}
		}
		if(c==1){
			c=0;
			year++;
		}
		String syear = year+"";
		String smonth = String.format("%02d",month);
		String sday = String.format("%02d",day);
		String shour = String.format("%02d",hour);
		String sminutes = String.format("%02d",minutes);
		String ssecond = String.format("%02d",second);
		System.out.println(syear+smonth+sday+shour+sminutes+ssecond);
	}
}
