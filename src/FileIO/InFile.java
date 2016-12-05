package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InFile {

	public static void main(String[] args) {
		// this is the filereader

		String fileName = "out.txt";
		byte[] data = new byte[1000];

		// made up a random length for the bytes
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(fileName);
			fis.read(data);
			// this reads the data from the file
			String s = new String(data);
			System.out.println(s);

		} catch (FileNotFoundException e) {
			System.out.println("Error the opening file: " + fileName);
		} catch (IOException e) {
			System.out.println("error getting the data bytes: " + data);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {

			}
		}

	}

}
