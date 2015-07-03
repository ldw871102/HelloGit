package com.test;

public class InitialTest {
	public static void main(String[] args) {
		Hello hello=new InitialTest().new Hello();
		System.out.println(hello.i);
		System.out.println(hello.c);
	}
	
	class Hello{
		//成员变量可以不赋值，自动初始化,非主类型为null
		int i;
		Cat c;
		public int cc(){
			int j=0;
			return j;
		}
	}
	
	class Cat{
		int i;
	}
}
