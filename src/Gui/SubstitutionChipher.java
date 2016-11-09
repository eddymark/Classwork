package Gui;

import java.util.*;

public class SubstitutionChipher implements MessageEncoder {
	Scanner sc = new Scanner(System.in);
	
	private int shift;

	public SubstitutionChipher(int shift) {
		this.shift = shift;
	}

	@Override
	public String encode(String plainText) {
		String encoded="";
		
		for (int i=0; i<plainText.length();i++){
			encoded = encoded + shiftChar(plainText.charAt(i)).toString();
		}
		
		return encoded;
	}

	public String decode(String encodedText) {
		String decoded = "";
		for (int i =0; i<encodedText.length(); i++){
			decoded = decoded + unShiftChar(encodedText.charAt(i)).toString();
		}
		
		
		return decoded;
	}
	
	private String shiftChar(char charToShift){
		int val = (int)charToShift;
		return Character.toString((char)(val+ shift));
	}
	private String unShiftChar(char charToUnshift){
		int val = (int) charToUnshift;
		return Character.toString((char)(val- shift));
	}
}
