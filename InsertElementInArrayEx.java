package com.pioneercoders.arrays;

public class InsertElementInArrayEx {
	public static void main(String args[]) {
		int array[] = { 10, 30, 40, 50, 60, 70, 80, 90 };
		int length = array.length;
		int newArray[] = new int[length];
		for (int i = 0; i < length; i++) {
			newArray[i] = array[i];
			newArray[1] = 20;
			//newArray[i]=array[i];
			
			System.out.println(newArray[i]);
		}
	}
}