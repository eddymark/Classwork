package classwork;

import java.util.*;
public class Project2 {

	public static void main(String[] args) {

		/*
		 * Develop an algorithm and write the program for a simple game of
		 * guessing at a secret five-digit code. When the user enters a guess at
		 * the code, the program returns two values: the number of digits in the
		 * guess that are in the correct position and the sum of those digits.
		 * 
		 * For example, if the secret code is 13720, and the user guesses 83521,
		 * the digits 3 and 2 are in the correct position. Thus, the program
		 * should respond with 2 and 5. Allow the user to guess only 10 times.
		 */
		Scanner s = new Scanner(System.in);
		
		String sCode="12345";
		String guesses="";
		int totalRight = 0;
		int sum = 0;
	
		
		for (int guess=0; guess<10;guess++){
			System.out.println("enter a five digit code: ");
			guesses=s.next();
			if (guesses.charAt(0)==sCode.charAt(0)){
				System.out.println("the first digit is right ");
				
			}
			if (guesses.charAt(1)==sCode.charAt(1)){
				System.out.println("the second digit is right ");
				System.out.println();
			}
		
			if (guesses.charAt(2)==sCode.charAt(2)){
				System.out.println("the third digit is right ");
			}
		
			if (guesses.charAt(3)==sCode.charAt(3)){
				System.out.println("the fourth digit is right ");
			}
			if (guesses.charAt(4)==sCode.charAt(4)){
				System.out.println("the fith digit is right ");
			}
			
			if (guesses.equals(sCode)){
				System.out.println("you got it ");
				break;
				
			}
		}
			
			
			

		
		
		
		}
	}

		
		
	


