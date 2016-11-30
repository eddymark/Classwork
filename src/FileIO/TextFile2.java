package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFile2 {
	public static void main(String[] args) {
		
		String fileName = "out.txt";
		PrintWriter outStream = null;
		
		try {
			outStream = new PrintWriter(new FileOutputStream(fileName,true));
			//saves whatever i write
			outStream.println("this is the first line");
			outStream.println("this is the Secondline");
			outStream.println("this is the THird line");
			outStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("there was an error opening the file"+fileName);
			e.printStackTrace();
			System.exit(0);
		}
		
		
		
		
		
	}
}