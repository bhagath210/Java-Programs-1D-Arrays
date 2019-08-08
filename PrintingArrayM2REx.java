package com.pioneercoders.arrays;

public class PrintingArrayM2REx {
	public static void main(String[] args) {
		String names[] = { "Rohit", "Dhawan", "Rahul", "Virat", "Dhoni", "Pandya", "Bhuvi", "Bumrah","Jadeja"};
		for (int i = (names.length)/2; i < (names.length); i++) { //printing Array from Middle of array to rightwards
			System.out.println(names[i]);
		}
	}
}