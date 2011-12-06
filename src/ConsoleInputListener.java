import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConsoleInputListener implements ActionListener {
	public void actionPerformed(ActionEvent e){
		String text = InitiateProject.gui.getConsoleInputText(); //Get the user command
		System.out.println("Action Event Fired..."); //For debugging purpose
		
		if (Menu.getUserInMenu()){//All the commands that are valid while in the menu
			switch (text){ 
			case "1": NewGame.startNewGame(); //Starts a new game
			case "2": 						 //load an old game
			}
		
		}
		else{ //Commands that are valid while in game
			
			
		}
	}
}
