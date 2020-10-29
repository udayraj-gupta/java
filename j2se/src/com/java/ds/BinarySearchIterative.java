package com.java.ds;

public class BinarySearchIterative {

	public static void main(String[] args) {
		int[] array = { -22, -15, 1, 5, 12, 34, 55 };
		System.out.println(iterativeBinarySearch(array, 12));
		/*
		 * for(int i =0; i<10;) { System.out.println(""+i); }
		 */
	}
	

	public static int iterativeBinarySearch(int[] input, int key) {

		int start = 0;
		int end = input.length;
		while (start < end) {
			int midPoint = (start + end) / 2;
			if (key == input[midPoint]) {
				return midPoint;
			} else if (key > input[midPoint]) {
				start = midPoint + 1;
			} else {
				end = midPoint;
			}
		}

		return -1;
	}

}
