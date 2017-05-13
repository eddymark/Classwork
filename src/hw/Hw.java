package hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

		try {
		//creates two Scanner objects 	
			Scanner input = new Scanner(System.in);
			Scanner input2 = new Scanner(System.in);

			System.out.println("Enter the name of the file that you want to open: ");
			try {
				File file = new File(input.nextLine()); //this gets the file we want to read
				input = new Scanner(file); //uses the file as an import paramaeter
				System.out.println("What name do you like for your copy ");

				try {
					File file1 = new File(input2.nextLine());

					if (file1.exists()) {
						System.out.println("Sorry this file already exist");
					} else {
						FileWriter fWriter = new FileWriter(file1);
						PrintWriter pWriter = new PrintWriter(fWriter);
						while (input.hasNextLine()) {
							String line = input.nextLine();
							pWriter.println(line);
						}
						pWriter.close();
						System.out.println(" the new file was created");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			

			} catch (FileNotFoundException e) {
				System.err.println("Sorry the file wasn't found");
				 e.printStackTrace();
			} catch (IOException e) {
				System.err.println("Problem getting file");
			}
		}
		finally{
			
		}
	}
}
				
	
