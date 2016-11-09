package Gui;

public class CipherDemo {

	public static void main(String[] args) {


		SubstitutionChipher sc = new SubstitutionChipher(20);
		String plainText="hello";
		String encodedText = sc.encode(plainText);
		sc.decode(encodedText);
		System.out.println(encodedText);
		System.out.println(sc.decode(encodedText));
		
	}

}
