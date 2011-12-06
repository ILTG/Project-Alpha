import java.awt.Color;


public class NewGame{
	private static void displayNewGameIntroStory(){
		
		
	}
	private static void removeMenuText(){
		
			for(int i = 255; i >= 0; i--){
				InitiateProject.gui.setConsoleOutputColor(0, i, 0);
				System.out.println("Decreasing output color, green is now " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("You got fucked");
				}
			}
		
		Menu.setUserInMenu(false); //We're not in menu, so set userIsInMenu to false
	}
	public static void startNewGame(){
		System.out.println("Starting New Game..."); //For debugging purpose
		
		removeMenuText();
		displayNewGameIntroStory();
	}
}
