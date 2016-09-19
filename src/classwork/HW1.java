package classwork;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.print("enter three positive numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("number1 number2 number3 " + num1 + " " + num2 + " " + num3);
		}
		if (num1 < num2 && num2 > num3) {
			System.out.println("number1 number3 number2 " + num1 + " " + num3 + " " + num2);
		}
		if (num2 < num1 && num1 < num3) {
			System.out.println("number2 number1 number3 " + num2 + " " + num1 + " " + num3);
		}
		if (num2 < num1 && num3 < num1) {
			System.out.println(" number2 number3 number1 " + num2 + " " + num3 + " " + num1);
		}
		if (num3 < num1 && num2 < num1) {
			System.out.println(" number3 number2 number1 " +num3 + " " + num2 + " " + num1);
		}
		if (num3 < num1 && num2 > num1) {
			System.out.println(" number3 number1 number2 " + num3 + " " + num1 + " " + num2);
		}

	}

}
