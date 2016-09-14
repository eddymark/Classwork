package classwork;

import java.util.Scanner;

public class Lab3Switch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int age = 0;
		String favColor = "";

		System.out.print("Enter your age:");
		age = scan.nextInt();

		System.out.print("please enter your favorite color:");
		favColor = scan.next();

		int key = age < 30 ? 0 : 1; // checks if less than30 or greater than

		switch (key) {
		case 0: // less than 30
			System.out.println("your favorite car is ford");
			switch (favColor.toLowerCase()) {
			case "red":
				System.out.println("your favorite car is a toyota");
				break;
			case "blue":
				System.out.println("your favoorite car is a Honda");
				break;

			}
			break;
		case 1 : //greater than 30 
			System.out.println("your favorite car ia a dodge");
			switch (favColor.toLowerCase()){
			case "red":
				System.out.println("your favorite car is a Subaru");
			}

		}

	}

}
