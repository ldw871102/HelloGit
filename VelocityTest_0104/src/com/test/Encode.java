package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Encode {

	public static void main(String[] args) {
		String hello = "471975029%40qq.com";
		String hh = "15107140001";
		String java="";
		String python="";
		try {
			java=URLDecoder.decode(hello, "utf-8");
			python=URLDecoder.decode(hh, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(java);
		System.out.println(python);
	}
}
