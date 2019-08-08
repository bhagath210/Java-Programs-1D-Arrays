package com.pioneercoders.arrays;

public class PrintingArrayLTREx {
	public static void main(String[] args) {
		leftToRight();
	}

	static void leftToRight() {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < numbers.length; i++) { // Printing Array from left to right
			System.out.println(numbers[i]);
		}
	}
}