package Gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IntroGui extends JFrame {
	
	//start the gui program with extexting JFrame
	//created the constructor and implemented the gui t
	public IntroGui(){
		
		Container container= getContentPane();
		//i want the gray area so that i can usse the variable to fill things i named it container
	
		JPanel panel = new JPanel();
		//adding another container
		
		JButton redButton = new JButton("red");
		JButton blueButton = new JButton("blue");
		//CREATES A BUTTON WITH A TITLE 
		
		panel.add(blueButton);
		panel.add(redButton);
		//adds the buttons into the middle 
		
		container.add(panel);
		
		//this adds a component
		
		setSize(400,400);
		//setting the zise of a container
		
		setTitle("IntorGUi");
		//setting a title for the Gui
		
		
		//made the gui visible
		setVisible(true);
	}

}
