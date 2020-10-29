package com.java.collection.list;

//public class Student implements Comparable<Student> {
public class Student {
	
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks=marks;
		this.name=name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override //Only check positive & negative number & 0
//	public int compareTo(Student student) {
////		if(this.marks>student.marks) return 1;
////		else if(this.marks<student.marks) return -1;
////		return this.name.compareTo(student.name);
//		return this.marks-student.marks;	//Simple one of code for above implementation
//	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	
}
