package projects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Project4{
	// This method deletes all the spaces 
	public static String spaces(String line){
		if (line.length() == 1) //  base case :checks line for 1 character if true returns line
			return line;
		else {
			if (!line.startsWith(" ")) // line doesn't start with the space 
				return line.substring(0,1)+spaces(line.substring(1));
			else if(line.startsWith(" ")&& !line.subSequence(1,2).equals(" ")){ // the line starts with the space but the next character is not with the space
				return line.substring(0,1)+spaces(line.substring(1));
			}
			else{ // I have multiple spaces so we need to not include them in a string
				return spaces(line.substring(1)); // it keeps the last character at the end 
			}
				
		}
	}

	public static void main(String[] args) {
		
	
		
		String filename = "input.txt";
		String outfile = "output.txt";
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = 
					new FileReader(filename);

			FileWriter fileWriter =
					new FileWriter(outfile);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = 
					new BufferedReader(fileReader);

			BufferedWriter bufferedWriter =
					new BufferedWriter(fileWriter);

			Character temp = new Character(' ');

			//int counter = 0;

			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				//if(counter == 0){
				char x = temp.toUpperCase(line.charAt(0));// first char. to upper case
				line = line.replaceFirst(line.charAt(0)+ "" , x +""); // replacing the lower case letter with the upper case letter
				//}
				//counter++;
				line = spaces(line); // deleting the spaces
				
				// checking if there is . , ? or ! replacing the next character to the upper case 
				char[] l = line.toCharArray(); 	
				for(int i = 0; i < l.length; i++){
					if(i != 0 && l[i] == '.' && i != (l.length-1)){
						l[i+ 1] =  (temp.toUpperCase(l[i+1]));
					}else if(i != 0 && l[i] == '?' && i != (l.length-1)){
						l[i+ 1] = temp.toUpperCase(l[i+1]);
					}else if(i != 0 && l[i] == '!' && i != (l.length-1)){
						l[i+ 1] = temp.toUpperCase(l[i+1]);
					}
				}
					
				bufferedWriter.write(String.valueOf(l)); // writes the line to the output file
				bufferedWriter.newLine(); // creates a new line
			}

			// Always close files. 
			bufferedReader.close();         
			bufferedWriter.close();
		}
		catch(FileNotFoundException ex) { // if the file does not exits 
			System.out.println(
					"Unable to open file '" + 
							filename + "'");                
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file '" 
							+ filename + "'");                  
			// Or we could just do this: 
			// ex.printStackTrace();
		}

	}

}
