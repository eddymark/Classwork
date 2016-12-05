package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFile2 {
	public static void main(String[] args) {
		
		String fileName = "input.txt";
		PrintWriter outStream = null;
		
		try {
			outStream = new PrintWriter(new FileOutputStream(fileName,true));
			//saves whatever i write
			outStream.println("this is   the line i want to fix.how do i do that");
			outStream.println("this is also  a line i would like to fix?hopefully it makes the h capital");
			outStream.println("this is the last line i would like to test!this should become a capital letter");
//			outStream.println("this is the THird line");
			outStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("there was an error opening the file"+fileName);
			e.printStackTrace();
			System.exit(0);
		}
		
		
		
		
		
	}
}