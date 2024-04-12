package com.pojos;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int compareTo(Student o) {
//		return name.compareTo(o.getName());
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(age==o.getAge())
			return 0;
		else if(age< o.getAge())
			return 1;
		else 
			return -1;
	}

}
