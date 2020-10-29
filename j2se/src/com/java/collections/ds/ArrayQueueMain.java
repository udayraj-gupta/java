package com.java.collections.ds;

public class ArrayQueueMain {

	public static void main(String[] args) {


		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayCircularQueue queue = new ArrayCircularQueue(5);
        queue.add(janeJones);
        queue.add(johnDoe);
        System.out.println("Remove");
        queue.remove();
        queue.add(marySmith); //No Need to resize the array if manipulating only with 2 elements
        System.out.println("Remove");
        queue.remove();
        queue.add(mikeWilson);
        System.out.println("Remove");
        queue.remove();
        queue.add(billEnd);
        System.out.println("Remove");
        queue.remove();
        queue.printQueue();
        queue.add(janeJones);
        System.out.println("------------------");
        queue.printQueue();

        //System.out.println(queue.peek());

	}

}
