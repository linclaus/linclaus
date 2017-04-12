package com.seu.huawei;

import java.util.Scanner;

public class Site {
	public static void main1(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] A=str.split(";");
            int x=0,y=0;
            for(String string:A){
                if(string.charAt(0)=='D' && string.substring(1).matches("[0-9]+"))
                    x+=Integer.parseInt(string.substring(1));
                 
                if(string.charAt(0)=='W' && string.substring(1).matches("[0-9]+"))
                    y+=Integer.parseInt(string.substring(1));
                 
                if(string.charAt(0)=='S' && string.substring(1).matches("[0-9]+"))
                    y-=Integer.parseInt(string.substring(1));
                 
                if(string.charAt(0)=='A' && string.substring(1).matches("[0-9]+"))
                    x-=Integer.parseInt(string.substring(1));
               
            }
            System.out.println(x+","+y);
        }
         
        sc.close();
    }
	 public static void main2(String[] args) {  
	        Scanner sc = new Scanner(System.in);  
	        String str = sc.nextLine();  
	        String []sArr = str.split(";");  
	        int x=0;  
	        int y=0;  
	        for (int i = 0; i < sArr.length; i++) {  
	            if(sArr[i].matches("[AWSD][0-9]+")){  
	                char c = sArr[i].charAt(0);  
	                String val = sArr[i].substring(1, sArr[i].length());  
	                int value = Integer.parseInt(val);  
	                switch (c) {  
	                case 'A':  
	                    x-=value;  
	                    break;  
	                case 'W':  
	                    y+=value;  
	                    break;  
	                case 'S':  
	                    y-=value;  
	                    break;  
	                case 'D':  
	                    x+=value;  
	                    break;  
	  
	                default:  
	                    break;  
	                }  
	            }  
	        }  
	        System.out.println(x+","+y);  
	    }  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] strs = str.split(";");
			int x = 0;
			int y = 0;
			int det = 0;
			for (int i = 0; i < strs.length; i++) {
				if (strs[i].length() == 0 || strs[i].substring(1).length() > 2)
					continue;
				try {
					det = Integer.parseInt(strs[i].substring(1), 10);
					char c = strs[i].charAt(0);
					switch (c) {
					case 'A':
						x -= det;
						break;
					case 'D':
						x += det;
						break;
					case 'W':
						y += det;
						break;
					case 'S':
						y -= det;
						break;
					default:
						break;
					}
				} catch (NumberFormatException e1) {
					continue;
				}
			}
			System.out.println(x + "," + y);
		}
	}
}
