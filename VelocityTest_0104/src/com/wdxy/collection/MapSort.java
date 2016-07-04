package com.wdxy.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;



public class MapSort {

	public static void main(String[] args) {
		Map<String,String> maps = new HashMap<String,String>();
		maps.put("a", "java");
		maps.put("c", "python");
		maps.put("ab", "test");
		maps.put("b", "livescript");
		System.out.println(maps);
		
		Set<String> sets = maps.keySet();
		System.out.println(sets);
		String[] keys = new String[sets.size()];
		keys =  sets.toArray(new String[0]);  //sets.toArray() 和 sets.toArray(<T> a)方法
		Arrays.sort(keys);
		for(String temp:keys){
			System.out.println(temp);
		}
		
	}
	
	
}
