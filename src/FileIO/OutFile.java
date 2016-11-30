package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutFile {

	public static void main(String[] args) {
		
		String data="";
		String fileName = "data.txt";
		FileOutputStream fos = null;
		
		try {
			 fos = new FileOutputStream(fileName);
			 
			 data="i just want this to be a simple text file";
			 //this is what we want to output
			fos.write(data.getBytes());
			//outputs the databytes in the file
		}catch (FileNotFoundException e){
			System.out.println("Error opening the file: " +fileName);
			//throws an error if the file is not found 
		}catch(IOException e){
			System.out.println("Error getting the data bytes: "+data);
			//gives an error when there is no input or output in the file
		}finally{
			try{
				fos.close();
			}catch(IOException e){
				
			}
			System.exit(0);
		}
}
}