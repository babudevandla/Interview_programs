package com.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.pojos.Student;

public class TestSort3 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();    
		al.add(new Student(101,"Vijay",23));    
		al.add(new Student(106,"Ajay",27));    
		al.add(new Student(105,"Jai",21));
		Collections.sort(al);
		printList(al);
	}

	private static void printList(ArrayList<Student> al) {
		for(Student s:al)
			System.out.println(s.getRollno()+"-"+s.getName()+"-"+s.getAge());
	}

}
