package com.java.collection.list;

import java.util.List;
import java.util.Vector;

import com.java.collections.ds.Employee;


/*Everything is same except this vector is preffered in thread safe*/
/*Capacity is 2X times for memory allocation.*/
public class VectorListDemo {
	
	public static void main(String[] args) {
		Vector<Employee> employeeList = new Vector<>(); //Initial Capacity 10 & grow dynaimcally
		employeeList.add(new Employee("Uday","G",27));
		employeeList.add(new Employee("Ashu","Gupta",03));
		employeeList.add(new Employee("Akhilesh","Gupta",4));
		
		System.out.println(employeeList.get(1));
		System.out.println(employeeList.isEmpty());
		employeeList.set(0, new Employee("Udayraj", "Gupta", 27));
		// If added in begining index then worst case all element will be shifted within array
		//which will be resulted in linear times operations
		employeeList.add(0, new Employee("Udayraj", "Gupta", 03));
		
		employeeList.forEach((e)->System.out.println(e));
		/* No of elements it currently has. */
		
		System.out.println(employeeList.size());
		
		/*
		 * Vector capacity is the maximum number of elements it can hold without
		 * resizing the internal array. 2X times
		 */
		System.out.println("Vector Capacity : "+employeeList.capacity());
		
		/* ArrayList to Array */
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
		
		//If equals & hascode is not ovveriden then it will return false
		System.out.println(employeeList.contains(new Employee("Udayraj", "Gupta", 03)));
		System.out.println(employeeList.indexOf(new Employee("Udayraj", "Gupta", 03)));
		
		employeeList.remove(0);// After remove again elemnst will be shifted in array.
		
		employeeList.forEach((e)->System.out.println(e));
	}

}
