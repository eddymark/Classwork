package classwork;

import java.util.Scanner;

public class Nonnegative {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int number = 0 ;
		
		for (int i = 0; i<3; i++){
		System.out.print("please enter a number: ");
		number = scanner.nextInt();
		
		}
		System.out.printf("pint out the number %s",number);
		

	}

}
