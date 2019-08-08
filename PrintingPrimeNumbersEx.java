package com.pioneercoders.arrays;

public class PrintingPrimeNumbersEx {
	public static void main(String[] args) {
		primeNumbers(17);
	}

	static void primeNumbers(int x) {
		int a, flag =0;
		a = x/2;
		if(x==0 || x==1)
		{
			System.out.println(x+" "+"is not a prime number");
		}
		else {
			for(int i=2; i<a; i++) {
				if(x%i==0)
				{
					System.out.println(x+" "+"is not a prime number");
					flag = 1;
					break;
				}
				if(flag == 0 ){
					System.out.println(x+" "+"is a prime number");
				}
			}
		}
	}
}