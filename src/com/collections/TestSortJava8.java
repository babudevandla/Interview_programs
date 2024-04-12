package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.pojos.Student1;

public class TestSortJava8 {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));
		printList(al);
		System.out.println("---------- Agebased Sorting ------------");
		Comparator<Student1> ageComparator = Comparator.comparing(Student1::getAge);
		Collections.sort(al, ageComparator);
		printList(al);
		
		System.out.println("---------- Namebased Sorting ------------");
		Comparator<Student1> nameComparator=Comparator.comparing(Student1::getName);
		Collections.sort(al,nameComparator);
		printList(al);
		
	}

	private static void printList(ArrayList<Student1> al) {
		for (Student1 s : al)
			System.out.println(s.getRollno() + "-" + s.getName() + "-" + s.getAge());
	}
}
