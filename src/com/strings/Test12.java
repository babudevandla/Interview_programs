package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test12 {

	private String val;
	public Test12(String val) {
		this.val=val;
	}
	public static void main(String[] args) {
		Map<String ,Integer> map1=new HashMap<>();
		String str1=new String("Java OOPs!");
		String str2=new String("Java OOPs");
		map1.put(str1, new Integer(10));
		map1.put(str2, new Integer(20));
		
		Map<Test12 ,Integer> map2=new HashMap<Test12 ,Integer>();
		Test12 str3=new Test12(str1);
		Test12 str4=new Test12(str2);
		map2.put(str3, new Integer(10));
		map2.put(str4, new Integer(20));
		System.out.println(map1.get(str1));
		System.out.println(map2.get(str3));
   }
}
