package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class StringDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "%E5%AF%B9%E8%B4%A6%E8%A1%A8";
		s = URLDecoder.decode(s,"utf-8");
		System.out.println(s);
	}
}
