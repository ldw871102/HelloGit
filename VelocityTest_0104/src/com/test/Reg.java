package com.test;

public class Reg {

	public static void main(String[] args) {
		String reg = "  尊敬的用户，您好，你的订单号为$orderid$的商品$title$，支付金额为$price$，销单码为$smscode$(多件商品以*0；分隔，销单码为6位)，请安全使用，切勿泄漏【金浦网】";
		String hello = reg.replaceAll("\\$smscode\\$", "java");
		hello = hello.replaceAll("\\$orderid\\$", "111");
		hello = hello.replaceAll("\\$title\\$", "中文");
		hello = hello.replaceAll("\\$price\\$", "中文");
		System.out.println(hello);
	}
}
