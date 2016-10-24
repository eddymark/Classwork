package com.Eddy;

public class LearnJavaStrings {

	public static void main(String[] args) {

		// Strings
		String fooString = "this is my string";
		// \n is an escape characther
		String barString = "printing on a new line\nnew line ";
		// this is to add a tabchracter
		String bazString = "do you want to add a tab\tWOW thats a lot of space";

		System.out.println(fooString);
		System.out.println(barString);
		System.out.println(bazString);

		// String concatanation

		String plusConcatanation = "strings can " + "be concatanated " + "using the + operator";
		System.out.println(plusConcatanation);

		// #2 - with StringBuilder
		// This way doesn't create any intermediate strings. It just stores the
		// string pieces, and ties them together
		// when toString() is called.
		// Hint: This class is not thread safe. A thread-safe alternative (with
		// some impact on performance) is StringBuffer.
		
		StringBuilder words = new StringBuilder( );
		words.append("you");
		words.append("can use ");
		words.append("this class to also concatanate strings");
		System.out.println(words.toString());//now the String is built
		
		

	}

}
