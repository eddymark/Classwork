package Exceptions;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = 1;

		do {
			try {
				System.out.println("enter the first num");
				int n1 = in.nextInt();

				System.out.println("enter the second num");
				int n2 = in.nextInt();

				int div = n1 / n2;
				System.out.println(div);
				// break;
				x = 2;
				// this is how i can end the condition

			} catch (Exception a) {
				System.out.println("Hey you cannot divide by zero");
			}

			
		} while (x == 1);

		
	}
		
}
