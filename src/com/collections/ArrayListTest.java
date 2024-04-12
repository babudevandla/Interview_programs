package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        
        System.out.println("------ Using Iterator ------");
        
        Iterator  it =list.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("------Using foreach  ------");
        
        for(String s:list) {
        	System.out.println(s);
        }
        
        System.out.println(" ---------- Using ListIterator -------");
        
        ListIterator<String> list1=list.listIterator(list.size());
        while(list1.hasPrevious())  {  
            String str=list1.previous();  
            System.out.println(str);  
        }  
        
        System.out.println(" ---------- Using For loop -------");
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        
        System.out.println(" ---------- Using ForEach() java8 -------");
        list.stream().forEach(System.out::println);
        
	}

}
