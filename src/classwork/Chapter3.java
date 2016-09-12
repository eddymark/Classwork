package classwork;

import java.util.Scanner;


public class Chapter3 {
	static final int ONE = 1;// these are constants that i can not change 
	static final int TWO = 2;
	static final int THREE = 3;
	
	 static int number = 0; //makes a constant that you can change 
	static Scanner scanner = new Scanner(System.in); // needs to be a constant number such as static 

	public static void main(String[] args) {
		
		System.out.print("type a numer from 1-3: ");
		number=scanner.nextInt();
		
		switch (number) {

		case ONE:
			System.out.println("ONE");
			break;
		case TWO:
			System.out.println("two");
			break;
		case THREE:
			System.out.println("THREE");
			break;
			default:
				System.out.println("there is no such Number");
		}

	}

}
