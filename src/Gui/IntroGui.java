package Gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntroGui extends JFrame implements ActionListener{
	
	
	private JLabel label;
	//created an instance variable to use anywhere else in the class
	
	//start the gui program with extexting JFrame
	//created the constructor and implemented the gui t
	public IntroGui(){
		
		Container container= getContentPane();
		//i want the gray area so that i can use the variable to fill things i named it container
	
		JPanel panel = new JPanel();
		//adding another container
		
		FlowLayout layout=new FlowLayout();
		
		setLayout(layout);
		//using the layout
		
		label = new JLabel();
		//created a label
		
		JButton redButton = new JButton("Red");
		redButton.addActionListener(this);
		//this wants to listen to anything that happens to the button 
		JButton blueButton = new JButton("Blue");
		blueButton.addActionListener(this);
		//CREATES A BUTTON WITH A TITLE 
		
		panel.add(blueButton);
		panel.add(redButton);
		//adds the buttons into the middle 
		
		container.add(panel);
		container.add(label);
		
		//this adds a component
		
		setSize(400,400);
		//setting the zise of a container
		
		setTitle("IntorGUi");
		//setting a title for the Gui
		
		
		//made the gui visible
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		//this prints out what is in the event listener
		String action=e.getActionCommand();
		if(action.equals("Blue")){
			label.setText("Blue");
		}
		if (action.equals("Red")){
			label.setText("Red");
		}
		
	}

}
