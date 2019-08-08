package com.pioneercoders.arrays;

public class PrintingArrayEvenNumbersEx {
	public static void main(String[] args) {
		evenNum(50);
	}

	static void evenNum(int x) {
		for (int j = 0; j <= x; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		return;
	}
}