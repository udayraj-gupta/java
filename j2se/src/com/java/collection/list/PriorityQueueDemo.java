package com.java.collection.list;

import java.util.PriorityQueue;

/*Elements stores in its own order but when removing the element it's removed as per natural order (sorted order)
 * This is built on Heap (Binary tree) Data Structure. 
*/
public class PriorityQueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(100);
		pq.add(12);
		pq.add(1);
		pq.add(45);
		
			
		//We have added the Element in decrement order but priority Queue will sort & store the data.
		System.out.println(pq);
		
		//Fetch the first element
		System.out.println(pq.peek()); //Only retrieve head from queue
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		pq.add(27);
		pq.remove(27);
		pq.poll(); //Retrieve & delete the Head element from queue
		
	}

}
