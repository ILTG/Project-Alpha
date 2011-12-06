import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GUI extends JFrame{
	
	ConsoleInputListener listener = new ConsoleInputListener(); //Declare a ConsoleInput Listener
	
	//Declare class variables
	private JTextPane ConsoleOutput = new JTextPane(); //The game communicates to the player through this JLabel
	private JTextField ConsoleInput = new JTextField(); //The filed where the player will input data
	private JFrame frame = new JFrame();
	
	int WIDTH = 600; //Set the constant height and width of some components
	int HEIGHT = 450;
	
	
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
		ConsoleOutput.setBounds(0, 0, WIDTH , HEIGHT-100);
		
		//----------------------------------------------------------------------
		
		ConsoleInput.setBackground(Color.WHITE);
		ConsoleInput.setForeground(Color.PINK);
		ConsoleInput.setBounds(0, HEIGHT-60, WIDTH, 20); //Should add a listener if the frame is resized
		ConsoleInput.addActionListener(listener);
		
		
		//-----------------------------------------------------------------------
		
		Container con = frame.getContentPane();  //Set background color to black
		con.setBackground(Color.BLACK);
		
		//-----------------------------------------------------------------------
		
		frame.setSize(WIDTH, HEIGHT); //Setup frame
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(ConsoleOutput); //Add the TextPane to the Frame
		frame.add(ConsoleInput);
	}
	public void setConsoleOutput(String output){
		ConsoleOutput.setText(output);
	}
	public String getConsoleInputText(){ //Returns the text contained in the ConsoleInput textfield as a string
		return ConsoleInput.getText();
	}
	public void setConsoleOutputColor(int r, int g, int b){
		ConsoleOutput.setForeground(new Color(r, g, b));
		ConsoleOutput.repaint();
	}
	public void setConsoleOutputColor(String s){
		String s1 = s.toLowerCase();
		
		switch(s1){
		case "red": ConsoleOutput.setForeground(Color.RED); break; 
		case "green": ConsoleOutput.setForeground(Color.GREEN); break;
		case "blue": ConsoleOutput.setForeground(Color.BLUE); break;
		case "pink": ConsoleOutput.setForeground(Color.PINK); break;
		case "BLACK": ConsoleOutput.setForeground(Color.BLACK); break;
		case "orange": ConsoleOutput.setForeground(Color.ORANGE); break;
		case "gray": ConsoleOutput.setForeground(Color.GRAY); break;
		case "cyan": ConsoleOutput.setForeground(Color.CYAN); break;
		default: System.out.println("Not a pre-defined color"); break;
		}
	}

}
