package com.pioneercoders.arrays;

public class PrintingArrayM2LEx {
	public static void main(String[] args) {
		String names[] = { "Rohit", "Dhawan", "Rahul", "Virat", "Dhoni", "Pandya", "Bhuvi", "Bumrah", "Jadeja" };
		for (int i = (names.length) / 2; i >= 0; i--) { // printing Array from Middle of array to leftwards
			System.out.println(names[i]);
		}
	}
}