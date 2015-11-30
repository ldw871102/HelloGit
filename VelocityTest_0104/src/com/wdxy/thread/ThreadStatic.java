package com.wdxy.thread;



public class ThreadStatic {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		t3.run();
		t2.run();
		t1.run();
	}
}

class MyThread extends Thread{
	private String name;
	private static int count = 5;
	
	
	public MyThread(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		while(count>0){
			count--;
			System.out.println(name+"的剩余票数为: "+count);
		}
	}
}
