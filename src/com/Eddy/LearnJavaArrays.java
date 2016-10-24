package com.Eddy;

public class LearnJavaArrays {

	public static void main(String[] args) {

		// Arrays
		// The array size must be decided upon instantiation
		// The following formats work for declaring an array
		// <datatype>[] <var name> = new <datatype>[<array size>];
		// <datatype> <var name>[] = new <datatype>[<array size>];
		int [] intArray = new int [10];
		String[] stringArray = new String[1];
		boolean boolArray[] = new boolean[100];

		// Another way to declare & initialize an array
		int[] y = { 9000, 1000, 1337 };
		String names[] = { "Bob", "John", "Fred", "Juan Pedro" };
		boolean bools[] = { true, false, false };
		
		System.out.println("print the items at index 0 "+bools[0]);
		
		

	}

}
