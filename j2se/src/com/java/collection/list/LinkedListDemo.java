package com.java.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

import com.java.collections.ds.Employee;

public class LinkedListDemo {
	public static void main(String[] args) {
		Employee uday = new Employee("Uday", "Gupta", 27);
		Employee ashu = new Employee("ashu", "Gupta", 03);
		Employee akhilesh = new Employee("akhilesh", "Gupta", 04);
		Employee vivo = new Employee("vivo", "Gupta", 11);
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(uday);
		list.add(ashu);
		list.add(akhilesh);
		
		Iterator itr=list.iterator();
		System.out.print("HEAD ->");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		
		list.addFirst(vivo);
		
		itr=list.iterator();
		System.out.print("HEAD ->");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		
		list.removeFirst();
		
		itr=list.iterator();
		System.out.print("HEAD ->");
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("<=>");
		}
		System.out.println("null");
	}
}
