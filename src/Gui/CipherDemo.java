package Gui;

import java.util.Scanner;

public class CipherDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		SubstitutionChipher sc = new SubstitutionChipher(3);
		System.out.println("enter a word:");
		String plainText=in.next();
		String encodedText = sc.encode(plainText);
		sc.decode(encodedText);
		System.out.println(encodedText);
		System.out.println(sc.decode(encodedText));

	}

}
