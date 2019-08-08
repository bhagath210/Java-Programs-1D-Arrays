package com.pioneercoders.arrays;

public class CopyArrayElementsEx {
	public static void main(String args[]) {
		int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // assigning array
		int l = array.length; // assigning length of array to int variable "l"
		System.out.println("Length of array is:" + l); // printing arraylength
		int arrayNew[] = new int[l]; // creating new array
		for (int i = 0; i < l; i++) { //  for loop for iteration
			arrayNew[i] = array[i]; // copying the array elements one by one to new array
			System.out.print(arrayNew[i]+","); // printing the new array
		}
	}
}