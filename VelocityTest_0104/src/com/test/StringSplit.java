package com.test;

public class StringSplit {

	public static void main(String[] args) {
		String aa = "a|b|ccc|hfjhf";
		String[] ss = aa.split("\\|");
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		};
	}
}
