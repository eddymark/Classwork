package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		String fileName = "new.txt";
		String outFN = "copy.txt";
		
		
		try {
			fis = new FileInputStream(fileName);
			byte[] b = new byte[100];
			try {
				fis.read(b);
			} catch (IOException e) {
				System.out.println("error reading file" + b);
			}

		} catch (FileNotFoundException e) {

			System.out.println("Error opening file: " +fileName);
		} finally {
			try {
				if (fis != null) {
					fis.close();
					fos.close();
				}
			} catch (IOException e) {
			}
		}

	}

}
