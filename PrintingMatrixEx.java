package com.pioneercoders.arrays;

public class PrintingMatrixEx {
	public static void main(String args[]) {
		int a[][] = new int[5][5];
		printMatrix(a);
	}

	static void printMatrix(int a[][]) {
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				if (i == 0 && j == 0 || i == 2 && j == 2 || i ==1 && j == 1) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}