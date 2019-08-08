package com.pioneercoders.arrays;
public class AverageOfArrayEx {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int element = array[i]; 
			sum = sum + element;
		}
		int average = (sum/(array.length));
		System.out.println(average);
	}
}