package classwork;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a one-line sentence as input and then
		 * displays the following response if the sentence ends with a question
		 * mark (?) and the input contains an even number of characthers the
		 * input contains an even number of characters, display the word Yes.
		 * 
		 * If the sentence ends with a question mark and the input contains an
		 * odd number of characters, display the word No. If the sentence ends
		 * with an exclamation diplay the word Wow.
		 * 
		 * In all other cases, display the words You always say followed by the
		 * input string enclosed in quotes. Your output should all be on one
		 * line. Be sure to note that in the last case, your output must include
		 * quotation marks around the echoed input string. In all other cases,
		 * there are no quotes in the output. Your program does not have to
		 * check the input to see that the user has entered a legitimate
		 * sentence.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		String line = " ";

		System.out.println("please write a one line sentence");
		line = sc.next();

		if (line.length() % 2 == 0 && line.contains("?")) {
			System.out.println("WOW");
		}
		if (line.length() % 2 != 0 && line.contains("!")) {
			System.out.println("NO");
		}else {
			System.out.printf("you always say \"%s\"",line);
		}
	}

}
