package com.wdxy.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class DateAdd {
    public static void main(String[] args) {
		
	    Calendar calendar =	Calendar.getInstance();
	    calendar = addDay(calendar, -19);
		Date date = calendar.getTime();
		System.out.println(date);
		
		Date date2 = addDay(calendar,-1).getTime();
		System.out.println(date2);
	
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String s = df.format(date2);
		System.out.println(s);
    }
    
    public static Calendar addDay(Calendar calendar,int num){
    	calendar.add(Calendar.DAY_OF_MONTH, num);
    	return calendar;
    }
}
