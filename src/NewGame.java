import java.awt.Color;


public class NewGame{
	private static void displayNewGameIntroStory(){
		
		InitiateProject.gui.setConsoleOutput("Cold, wet floor.");
		
	}
	private static void removeMenuText(){
		
		Menu.setUserInMenu(false); //We're not in menu, so set userIsInMenu to false
		
			for(int i = 255; i >= 0; i--){ //A flashy way to remove it, fade into black (doesn't work!)
				InitiateProject.gui.setConsoleOutputColor(0, i, 0);
				System.out.println("Decreasing output color, green is now 0, " + i + ", 0");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("Thread.sleep exception");
				}
			}
		
		
	}
	public static void startNewGame(){
		System.out.println("Starting New Game..."); //For debugging purpose
		
		removeMenuText();
		displayNewGameIntroStory();
	}
}
