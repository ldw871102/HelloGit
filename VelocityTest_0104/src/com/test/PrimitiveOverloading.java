package com.test;


public class PrimitiveOverloading {

	static void prt(String s){
		System.out.println(s);
	}
	
	void f1(char x){
		prt("f1(char)");
	}
	
	void f1(byte x){
		prt("f1(byte)");
	}
	
	void f1(int x){
		prt("f1(int)");
	}
	
	void f1(long x){
		prt("f1(long)");
	}
	
	void f1(double x){
		prt("f1(double)");
	}
	
	void f1(short x){
		prt("f1(short)");
	}
	
	void f1(float x){
		prt("f1(float)");
	}
	
	void f2(double x){
		prt("f2(doble)");
	}
	
	void f3(int x){
		prt("f3(int)");
	}
	
	
	public static void main(String[] args) {
		PrimitiveOverloading p = new PrimitiveOverloading();
		p.f1(1);
		p.f1(1.0f);
		p.f2(2);
		p.f2(2.1);
		//p.f3(2.0);编译期错误
		p.f3((int)2.0);
		p.f3(2);
	}
}
