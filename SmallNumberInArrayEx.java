package com.pioneercoders.arrays;

public class SmallNumberInArrayEx {
	public static void main(String args[]) {
		int array[] = { 6, 3, 2, 5 }; // assigning an array
		min(array);// passing array to method
	}

	static void min(int arr[]) {
		int min = arr[0]; // initializing minimum value with zero index element
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i]) // comparing minimum value with remaining elements in array
				min = arr[i]; 

		System.out.println(min); // printing output
	}
}