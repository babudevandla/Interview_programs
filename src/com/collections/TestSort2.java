package com.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.pojos.Student;

public class TestSort2 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Viru"));  
	      al.add(new Student("Saurav"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("Tahir"));  
	      
	      Collections.sort(al);
	      al.stream().forEach(System.out::println);
	      System.out.println("---------------");
	      
	      printList(al);
	      
	      System.out.println("****************");
	      
	      Collections.sort(al,Collections.reverseOrder());
	      printList(al);
	}

	private static void printList(ArrayList<Student> al) {
		for(Student s:al)
	    	  System.out.println(s.getName());
	}

}
