package com.pioneercoders.arrays;

public class PrintingIdentityMatrixEx {
	public static void main(String args[]) {
		int m[][] = new int[4][4];
		matrix(m);
	}

	static void matrix(int m[][]) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && j == 0 || i == 1 && j == 1 || i == 2 && j == 2) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}