import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GUI extends JFrame{
	
	private ConsoleInputListener listener = new ConsoleInputListener(); //Declare a ConsoleInput Listener
	
	//Declare class variables
	public JTextPane ConsoleOutput; 
	public JTextField ConsoleInput; 
	public JFrame frame;
	public JPanel panel;
	
	private final int WIDTH = 600; //Set the constant height and width of some components
	private final int HEIGHT = 500;
	
	public GUI(){  //Constructor, will add the menu to the JTextPane
		initiateGUI();
	}
	private void initiateGUI(){
		System.out.println("Creating GUI...THIS IS CHANGE!hhhhh");
		
		//---------------------------------------------------------------------
		
		ConsoleOutput = new JTextPane();   //The game communicates to the player through this JTextPane
		ConsoleOutput.setEditable(false);  //Setup the TextPane where all the output will be displayed
		ConsoleOutput.setBackground(Color.BLACK);
		ConsoleOutput.setForeground(Color.GREEN);
		ConsoleOutput.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		ConsoleOutput.setBounds(0, 0, WIDTH , HEIGHT-57); 
		
		//----------------------------------------------------------------------
		
		ConsoleInput = new JTextField(); //The field where the player will input data
		ConsoleInput.setBackground(Color.WHITE);
		ConsoleInput.setForeground(Color.PINK);
		ConsoleInput.setBounds(0,HEIGHT-57,WIDTH,20); //The top bar seems to be 27 pixels high...
		ConsoleInput.addActionListener(listener);
		
		//-----------------------------------------------------------------------
		
		frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT); 
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//-----------------------------------------------------------------------
		panel = new JPanel();
		panel.setBounds(0,0,WIDTH, HEIGHT);
		panel.setLayout(null);
		frame.add(panel);
		panel.add(ConsoleOutput);
		panel.add(ConsoleInput);
	
	}
	
	public void setConsoleOutput(String output){
		ConsoleOutput.setText(output);
	}
	public String getConsoleInputText(){ //Returns the text contained in the ConsoleInput textfield as a string
		return ConsoleInput.getText();
	}
	public void setFrameResizable(boolean resizable){
		frame.setResizable(resizable);
	}
	public void setConsoleOutputColor(int r, int g, int b){
		ConsoleOutput.setForeground(new Color(r, g, b));
	}
	public void setConsoleOutputColor(Color c){
		ConsoleOutput.setForeground(c); 
	}
	public void flushConsole(){
		System.out.flush();
	}
	
}
