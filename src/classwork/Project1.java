package classwork;

public class Project1 {

	public static void main(String[] args) {
		// Write a program that creates an array and prints out the first 10
		// prime numbers using a do-while loop:

		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29

		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		int i = 0;

		do {
			System.out.println("index: "+i+"value: "+prime[i]);
			

		} while (i++ < prime.length -1);
			
		

	}

}
