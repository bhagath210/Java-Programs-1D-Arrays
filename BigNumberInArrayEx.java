package com.pioneercoders.arrays;

public class BigNumberInArrayEx {
	public static void main(String args[]) {
		int array[] = { 4, 6, 8, 2, 9, 1, 7, 3, 5 };
		max(array);
	}

	static void max(int array[]) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		System.out.println(max);
	}
}