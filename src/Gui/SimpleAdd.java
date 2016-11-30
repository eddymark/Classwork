package Gui;

import java.awt.*;




import javax.swing.*;

public class SimpleAdd extends JFrame  {


	

	public SimpleAdd(){
		
		
		
		
	
		
		String firstNum=JOptionPane.showInputDialog("enter a number you want to add");
		int firstNumc=Integer.parseInt(firstNum);
		//this sets the variable that you input as an interger 
		
		String secondNum = JOptionPane.showInputDialog("enter the second number");
		int secondNumc= Integer.parseInt(secondNum);
		
		int sum= secondNumc+firstNumc;
		//this gets the sum of both of the intergers 
		
		JOptionPane.showMessageDialog(null,"this is the total num for the sum " +sum);
		System.exit(0);
		//this outputs the sum of the first and second num
		
		

	}

	

	


}
