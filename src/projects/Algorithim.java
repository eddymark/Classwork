package projects;

import java.util.Scanner;

public class Algorithim {

	public static void main(String[] args) {
		String sCode = "90865";// secret code
		int totalGuesses = 1;// initilization
		Scanner keyboard = new Scanner(System.in);// scanner
		System.out.println("Enter your 5 digit guess");// enters the secret
														// number to a guess
		String guess = keyboard.next();
		while (totalGuesses < 10) {
			int numberCorrect = 0;
			int sum = 0;
			for (int i = 0; i < sCode.length(); i++) {
				if (sCode.charAt(i) == guess.charAt(i)) {
					numberCorrect++;
					sum += Integer.parseInt(sCode.charAt(i) + "");// used parse
																	// int to
																	// change
																	// the
																	// charat
																	// that
																	// numer to
																	// an
																	// integer
																	// and add
																	// them all
																	// together
				}
			}
			System.out.println(numberCorrect + " and " + sum);
			if (guess.equals(sCode)) {
				System.out.println("You got the answer right!");
				break;
			} else {
				System.out.println("Enter your 5 digit guess");
				guess = keyboard.next();
				totalGuesses++;
			}
		}

	}

}
