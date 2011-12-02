import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GUI extends JFrame{
	//Declare class variables
	private JTextPane ConsoleOutput = new JTextPane(); //The game communicates to the player through this JLabel
	private JTextField ConsoleInput = new JTextField(); //The filed where the player will input data
	JFrame frame = new JFrame();
	
	int WIDTH = 600; //Set the constant height and width of some components
	int HEIGHT = 450;
	
	
	public void initiateGUI(){
		
		ConsoleOutput.setEditable(false);  //Setup the TextPane where all the output will be displayed
		ConsoleOutput.setBackground(Color.BLACK);
		ConsoleOutput.setForeground(Color.GREEN);
		ConsoleOutput.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		ConsoleOutput.setAlignmentX(FlowLayout.CENTER);
		ConsoleOutput.setAlignmentY(FlowLayout.CENTER);
		
		//----------------------------------------------------------------------
		
		ConsoleInput.setBackground(Color.WHITE);
		ConsoleInput.setForeground(Color.PINK);
		ConsoleInput.setAlignmentX(HEIGHT - 100);
		ConsoleInput.setAlignmentY(WIDTH/2);
		ConsoleInput.setSize(WIDTH, HEIGHT);
		
		
		//-----------------------------------------------------------------------
		
		Container con = frame.getContentPane();  //Set background color to black
		con.setBackground(Color.BLACK);
		
		//-----------------------------------------------------------------------
		
		frame.setSize(600, 450); //Setup frame
		frame.setLayout(none);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(ConsoleOutput); //Add the TextPane to the Frame
		frame.add(ConsoleInput);
	}
	public void setConsoleOutput(String output){
		ConsoleOutput.setText(output);
		frame.add(ConsoleOutput);
	}

}
