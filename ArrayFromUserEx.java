package com.pioneercoders.arrays;

import java.util.Scanner;

public class ArrayFromUserEx {
	public static void main(String args[]) {
		int array[] = new int[5];
		@SuppressWarnings("resource")
		Scanner elements = new Scanner(System.in); // creating object

		System.out.println("Enter array size:"); // asking the user to enter size of array
		int size = elements.nextInt(); // assigning the input to size variable

		System.out.println("Enter array Elements:"); // asking the user to enter elements of array
		for (int i = 0; i < size; i++) {
			array[i] = elements.nextInt(); // assigning each element to array
			System.out.print(array[i]); // printing the elements
		}
	}
}