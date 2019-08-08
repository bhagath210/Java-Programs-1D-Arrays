package com.pioneercoders.arrays;

public class PrintAlternateElementsInArrayEx {
	public static void main(String args[]) {
		alternateElementsOfArray();

	}

	static void alternateElementsOfArray() {
		@SuppressWarnings("unused")
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("The Alternate elements of array are:");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
}