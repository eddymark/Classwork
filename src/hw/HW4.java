package hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class HW4 {

	public static void main(String[] args) {
		
		String fileName="file.txt";
		String newFileName = "newFile.txt";
		PrintWriter out = null;
		
		try{
			out = new  PrintWriter(new FileOutputStream(fileName,true));
			out.println(fileName);
			out.println(newFileName);
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("there is trouble opening the file: "+fileName );
		}
		

	}

}
