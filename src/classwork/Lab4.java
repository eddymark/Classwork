package classwork;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String word= ""; 
		String done = "done";
		
		while(true){
			System.out.println("please enter a word ");
			word = keyboard.next();
			if (word.equals(done)){
				break;
			}
		}
		
		
			

	}

}
