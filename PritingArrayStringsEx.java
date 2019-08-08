package com.pioneercoders.arrays;

public class PritingArrayStringsEx {
public static void main(String[] args) {
	names(); // call for the names Method
}
	static void names() {
		String[] names = {"NTR","ANR", "Super Star"};
		for(int i=0; i<names.length; i++) {
			String hero = names[i];
			System.out.println(hero); // without returning printing the result
		}
	}
}