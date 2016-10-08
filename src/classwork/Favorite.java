package classwork;

import java.util.Scanner;

public class Favorite {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		String favColor = "";
		String favFood = "";
		String favAnimal = "";
		String fName = "";

		System.out.print("Hello please enter your Favorite color:");
		favColor = scanner.nextLine();

		System.out.print("Hello please enter your Favorite food:");
		favFood = scanner.nextLine();

		System.out.print("Hello please enter your Favorite animal:");
		favAnimal = scanner.nextLine();

		System.out.print("Hello please enter the first name of a close releative or friend :");
		fName = scanner.nextLine();

		System.out.printf("I had a dream that %s ate a %s and said it tasted like %s", fName, favColor, favAnimal,
				favFood);
		
		  scanner.close();
	}
	  

}
