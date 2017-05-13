package practice;

import java.util.*;

public class GonzaloLoco {

	public static void main(String[] args) {

		Grades();
	}

	public static void Grades() {

		int score;

		Scanner input = new Scanner(System.in);

		System.out.println("what score did you get on the test");
		score = input.nextInt();

		if (score >= 90) {
			System.out.println("you got an A");
		} else if (score >= 80 && score < 90) {

			System.out.println("you got an B");
		} else if (score >= 70 && score < 80) {

			System.out.println("you got an C");
		} else if (score >= 60 && score < 70) {
			System.out.println("you got an D");
		}

		else {
			System.out.println("you got an F");
		}
	}

}
