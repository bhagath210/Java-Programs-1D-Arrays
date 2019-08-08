package com.pioneercoders.arrays;

import java.util.Scanner;

public class PrintingMatrixFromUserEx {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner array = new Scanner(System.in);

		System.out.println("Enter No. of Rows:");
		int rows = array.nextInt();
		System.out.println("Enter No. of Columns:");
		int columns = array.nextInt();
		System.out.println("Enter Matrix Elements:");
		int matrix[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = array.nextInt();
			}
		}
		System.out.println("The Matrix is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}