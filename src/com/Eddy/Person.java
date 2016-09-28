package com.Eddy;

public class Person {

	// data

	private String mName;
	private int mAge;

	// constructor
	public Person() {
		System.out.println("New Person ");

	}

	public Person(String name, int age) {
		System.out.println("new person with name");
		mName = name;
		mAge = age;

	}

	// method

	public void mynameIS() {
		System.out.println("My name is " + mName + mAge);
	}
}
