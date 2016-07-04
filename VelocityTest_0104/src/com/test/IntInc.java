package com.test;

import java.awt.print.Printable;

public class IntInc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=0;i<10;++i){
//same: for (int i=0;i<10;i++){  
			System.out.println(i);
			//System.out.println(i);
		}
		System.out.println("------------------------------");
		int j=1;
		System.out.println(j++);
		System.out.println(++j);
		System.out.print(j);
		//++ is a same effect j=j+1.but the result is not same
	}

}
