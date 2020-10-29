package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(12, "samuel"));
		studentList.add(new Student(12, "sam"));
		studentList.add(new Student(14, "sunny"));
		studentList.add(new Student(29, "uday"));
		studentList.add(new Student(27, "uday"));
		studentList.forEach(System.out::println);
		studentList.toString();
//		Collections.sort(studentList, new SortByNameThenMarks());
		/*
		 * Collections.sort(studentList, new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) {
		 * if(o1.name.equals(o2.name)) { return o1.marks-o2.marks; }else { return
		 * o1.name.compareTo(o2.name); } } });
		 */
		
		/* Java8 Implementation */
//		Collections.sort(studentList, ( o1, o2) -> {
//				if(o1.name.equals(o2.name)) {
//					return o1.marks-o2.marks;
//				}else {
//					return o1.name.compareTo(o2.name);
//				}
//		});
		
//		Collections.sort(studentList,Comparator.comparing(Student::getName)); //1 line for comparing by Name. Simpler way
		Collections.sort(studentList,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed()); //1 line for comparing by Name. Simpler way
		System.out.println("----------------------------------");
		studentList.forEach(System.out::println);
	}

}

class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}else {
			return o1.name.compareTo(o2.name);
		}
	}
	
}
