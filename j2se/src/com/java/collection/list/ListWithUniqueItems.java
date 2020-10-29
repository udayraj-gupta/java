package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class StudentList{
	int rollNo;
	String name;
}
//ArrayList Capacity is 1.5X time for memory allocation
public class ListWithUniqueItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList<String>();
		
		list1.add("Uday");
		list1.add("Uday");
		list1.add("Udayraj");
		list1.add(null);
		list1.add(22.2);
		list1.add(22.2);
		ArrayList list2 = new ArrayList();
		StudentList s = new StudentList();
		s.name="Uday";
		s.rollNo=10;
		list2.add(s);
		list2.add("Gupta");
		System.out.println("List1 : "+list1);
		System.out.println("List2 : "+list2);
		
		//Update
		list1.set(1, "Gupta");
		System.out.println("Updated List1 : "+list1);
		
		//remove
		list1.remove(2);
		System.out.println("Removed Element List1 : "+list1);
		
		//clear empty
//		list1.clear();
		
		//Check element in list
		System.out.println("Check element in List1 : "+list1.contains("Uday"));
		
		/* Remove Duplicates using LinkedHashSet to maintain ordering */
		Set set = new LinkedHashSet(list1);
		list1.clear();
		list1.addAll(set);
		list1.forEach((data)->System.out.println(data));
		
	}

}
