package Gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//has to extend JFRame for the GUi

public class GuiDemo extends JFrame implements ActionListener{
	
	public GuiDemo(){
		setTitle("my first Gui"); // sets the title
		setSize(300,300); // sets the zise of it 
		
		Container container =getContentPane();//adds a container 
		
		JPanel panel =new JPanel();
		//this is a container inside of a container 
		
		JButton submitButton=new JButton("Submit"); //creates the butto 
		submitButton.addActionListener(this);
		JButton cancelButton=new JButton("Cancel");
		cancelButton.addActionListener(this);
		panel.add(submitButton);
		panel.add(cancelButton);
		FlowLayout layout = new FlowLayout();  //a flow layout
		container.setLayout(layout);
		container.add(panel);
		
		//container.add(submitButton);
	//	container.add(cancelButton);
		
		
		
		
		setVisible(true);// makes the gui visible
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		String event = e.getActionCommand();
		
		if (event.equals("Submit")){
			System.out.println("Submit Button clicked");
		}else if(event.equals("Cancel")){
			System.out.println("cancel Button was Clicked");
		}
//		System.out.println(event);
	}
	
	public static void main(String[] args) {
		GuiDemo ne = new GuiDemo();
		
	}

}
