package com.pioneercoders.arrays;

public class PrintingOddIndexInArrayEx {
	public static void main(String[] args) {
		String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday" };
		// index of array 0 1 2 3 4 5 6
		for (int i = 0; i < days.length; i++) {
			if (!(i % 2 == 0)) { //condition for checking the index whether it is odd or not
				System.out.println(days[i]);
			}
		}
	}
}