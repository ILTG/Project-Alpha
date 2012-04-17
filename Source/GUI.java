import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GUI extends JFrame{
	
	ConsoleInputListener listener = new ConsoleInputListener(); //Declare a ConsoleInput Listener
	
	//Declare class variables
	private JTextPane ConsoleOutput = new JTextPane(); //The game communicates to the player through this JTextPane
	private JTextField ConsoleInput = new JTextField(); //The field where the player will input data
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	
	private final int WIDTH = 600; //Set the constant height and width of some components
	private final int HEIGHT = 450;
	
	public void flushConsole(){
		System.out.flush();
	}
	public GUI(String Menu){  //Constructor, will add the menu to the JTextPane
		ConsoleOutput.setText(Menu);
	}
	public void initiateGUI(){
		System.out.println("Creating GUI...");
		
		//---------------------------------------------------------------------
		
		ConsoleOutput.setEditable(false);  //Setup the TextPane where all the output will be displayed
		ConsoleOutput.setBackground(Color.BLACK);
		ConsoleOutput.setForeground(Color.GREEN);
		ConsoleOutput.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		ConsoleOutput.setBounds(0, 0, WIDTH , HEIGHT);
		
		//----------------------------------------------------------------------
		
		ConsoleInput.setBackground(Color.WHITE);
		ConsoleInput.setForeground(Color.PINK);
		ConsoleInput.setBounds(0,HEIGHT-60,WIDTH,20); //Should add a listener if the frame is resized
		ConsoleInput.addActionListener(listener);
		
		
		//-----------------------------------------------------------------------
		
		//Container con = frame.getContentPane();  //Set background color to black
		//con.setBackground(Color.BLACK);
		
		//-----------------------------------------------------------------------
		
		frame.setSize(WIDTH, HEIGHT); //Setup frame
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//-----------------------------------------------------------------------
		
		panel.setBounds(0,0,WIDTH, HEIGHT);
		panel.setLayout(null);
		panel.add(ConsoleInput);
		panel.add(ConsoleOutput);
		frame.add(panel);
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
}
