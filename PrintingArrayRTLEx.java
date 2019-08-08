package com.pioneercoders.arrays;

public class PrintingArrayRTLEx {
	public static void main(String[] args) {
		rightToLeft();
	}

	static void rightToLeft() {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		for (int i = numbers.length-1; i >=0; i--) { // Printing Array from right to left
			System.out.println(numbers[i]);
		}
	}
}