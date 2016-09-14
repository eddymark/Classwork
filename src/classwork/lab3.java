package classwork;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int age = 0;
		String color = "";
		String red = "red";
		String blue = "blue";

		System.out.print("what is your age: ");
		age = keyboard.nextInt();

		System.out.print("what is your favorite color:");
		color = keyboard.next();

		if (age < 30 && color.equals(red)) {
			System.out.println("your favorite car is a toyota");

		}
		if (age < 30 && color.equals(blue)) {
			System.out.println("your favorite car is a honda ");

		}
		if (age < 30) {
			System.out.println("your favorite car is a ford");

		}
		if (age > 30 && color.equals(red)) {
			System.out.println("ypur favoirte car is a Subaru");
		}
		if (age > 30) {
				System.out.println("your favorite car is a dodge");
		}
	}
}
