package practice;

import java.util.Scanner;

public class FlowOfControl {

	public static void testScoreCase() {
		int score;
		Scanner input = new Scanner(System.in);
		System.out.println("what did you recive as a score");
		score = input.nextInt();

		String letterGrade;
		switch (score / 10) {

		case 9:
			letterGrade = "A";
			System.out.println("you recived an A");
			break;
		case 8:
			letterGrade = "B";
			System.out.println("you recived a B");
			break;
		case 7:
			letterGrade = "C";
			System.out.println("you recived a C");
			break;
		case 6:
			letterGrade = "D";
			System.out.println("you recived a D");
		default:
			
			letterGrade = "F";
			System.out.println("you recived an F");
		}

	}

	public static void testScore() {

		int score;
		Scanner input = new Scanner(System.in);
		System.out.println("what did you recive on the test:");
		score = input.nextInt();
		if (score >= 0 && score <= 100) {
			System.out.println("valid score");
		} else {
			System.out.println("score is not valid ");
		}
	}

	public static void evenOdd() {
		int x;

		Scanner input = new Scanner(System.in);

		System.out.println("enter a value for x:");
		x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println("this is the even number " + x);
			x = x / 2;
			System.out.println(+x);
		} else {
			System.out.println("this is the odd number " + x);
			x = x * 3 - 1;
			System.out.println(+x);

		}

	}

	public static void main(String[] args) {
		// testScore();
		// evenOdd();
		testScoreCase();
	}

}
