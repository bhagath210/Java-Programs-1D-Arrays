package com.pioneercoders.arrays;

public class CopyingEx {
	public static void main(String args[]) {
		int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int l = array.length;
		int newArray[] = new int[l];
		for (int i = 0; i < l; i++) {
			newArray[i] = array[i];
			System.out.print(newArray[i]+",");
		}
	}
}