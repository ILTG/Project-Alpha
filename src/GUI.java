import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class GUI extends JFrame{
	//Declare class variables
	private JTextPane ConsoleOutput = new JTextPane(); //The game communicates to the player through this JLabel
	
	public void initiateGUI(){
		JFrame frame = new JFrame();
		ConsoleOutput.setEditable(false);
		ConsoleOutput.setBackground(Color.BLACK);
		ConsoleOutput.setForeground(Color.WHITE);
		ConsoleOutput.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		
		Container con = frame.getContentPane();
		con.setBackground(Color.BLACK);
		
		frame.setSize(600, 450);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(ConsoleOutput);
	}
	public void setConsoleOutput(String output){
		ConsoleOutput.setText(output);
		
	}

}
