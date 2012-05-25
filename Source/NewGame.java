import java.awt.Color;

public class NewGame{
	private static void displayNewGameIntroStory(){
		
		InitiateProject.gui.setConsoleOutput("Cold...so cold. He didn't want to wake up. " +
				"He knew what was waiting, and it was defenetly not better than darkness...");
		
	}
	private static void removeMenuText(){
		
		Menu.setUserInMenu(false); //We're not in menu, so set userIsInMenu to false
		InitiateProject.gui.flushConsole();
		
	}
	public static void startNewGame(){
		System.out.println("Starting New Game..."); //For debugging purpose
		
		removeMenuText(); //removes the menu
		displayNewGameIntroStory(); //Displays an intro
	}
	public static void createSaveFile(){ //Creates a .txt file for saves
		
	}
}
