package com.seu.Test;

import java.util.Arrays;
import java.util.Scanner;

public class 电话分身 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++){
			str[i]=sc.nextLine();
		}
		for(String data:str){
			int[] map=new int[26];
			for(int i=0;i<data.length();i++){
				map[data.charAt(i)-'A']++;
			}
			String result="";
			for(int i=0;i<map['Z'-'A'];i++)
				result+='2';
			map['E'-'A']-=map['Z'-'A'];
			map['R'-'A']-=map['Z'-'A'];
			map['O'-'A']-=map['Z'-'A'];
			map['Z'-'A']=0;
			for(int i=0;i<map['W'-'A'];i++)
				result+='4';
			map['T'-'A']-=map['W'-'A'];
			map['O'-'A']-=map['W'-'A'];
			map['W'-'A']=0;
			for(int i=0;i<map['U'-'A'];i++)
				result+='6';
			map['F'-'A']-=map['U'-'A'];
			map['O'-'A']-=map['U'-'A'];
			map['R'-'A']-=map['U'-'A'];
			map['U'-'A']=0;
			for(int i=0;i<map['X'-'A'];i++)
				result+='8';
			map['S'-'A']-=map['X'-'A'];
			map['I'-'A']-=map['X'-'A'];
			map['X'-'A']=0;
			for(int i=0;i<map['G'-'A'];i++)
				result+='0';
			map['E'-'A']-=map['G'-'A'];
			map['I'-'A']-=map['G'-'A'];
			map['H'-'A']-=map['G'-'A'];
			map['T'-'A']-=map['G'-'A'];
			map['G'-'A']=0;
			for(int i=0;i<map['O'-'A'];i++)
				result+='3';
			map['N'-'A']-=map['O'-'A'];
			map['E'-'A']-=map['O'-'A'];
			map['O'-'A']=0;
			for(int i=0;i<map['T'-'A'];i++)
				result+='5';
			map['H'-'A']-=map['T'-'A'];
			map['R'-'A']-=map['T'-'A'];
			map['E'-'A']-=map['T'-'A'];
			map['E'-'A']-=map['T'-'A'];
			map['T'-'A']=0;
			for(int i=0;i<map['F'-'A'];i++)
				result+='7';
			map['I'-'A']-=map['F'-'A'];
			map['V'-'A']-=map['F'-'A'];
			map['E'-'A']-=map['F'-'A'];
			map['F'-'A']=0;
			for(int i=0;i<map['S'-'A'];i++)
				result+='9';
			map['E'-'A']-=map['S'-'A'];
			map['V'-'A']-=map['S'-'A'];
			map['E'-'A']-=map['S'-'A'];
			map['N'-'A']-=map['S'-'A'];
			map['S'-'A']=0;
			for(int i=0;i<map['I'-'A'];i++)
				result+='1';
			map['N'-'A']-=map['I'-'A'];
			map['N'-'A']-=map['I'-'A'];
			map['E'-'A']-=map['I'-'A'];
			map['I'-'A']=0;
			char[] cresult=result.toCharArray();
			Arrays.sort(cresult);
			System.out.println(new String(cresult));
		}
	}
}
