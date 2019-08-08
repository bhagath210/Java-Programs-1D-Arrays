package com.pioneercoders.arrays;

public class SortingArrayInDescendingEx {
	public static void main(String args[]) {
		int array[] = { 3, 6, 9, 4, 7, 2, 5, 8, 1 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}