package practice;

import java.util.Scanner;

public class Profanity {

	public static void main(String[] args) {
		String word;
		String dog = "dog";
		String cat = "cat";
		String llama = "llama";

		boolean counter= true;
		
		Scanner in = new Scanner(System.in);
		
		while(counter){

		System.out.println("please input a word");
		word = in.next();

		if (word.equalsIgnoreCase(cat) || word.equalsIgnoreCase(dog) || word.equalsIgnoreCase(llama)) {
			System.out.println("this is Profane");
		}
		}
	}

}
