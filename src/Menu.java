import java.util.Scanner;

public class Menu extends NewGame{
	static Scanner s = new Scanner(System.in);
	private static String menuText(){ //Displays the menu graphics and options

		return 	 "                   __________                   __               __   \n" + 
				 "                   \\______   \\_______  ____    |__| ____   _____/  |_ \n" + 
	             "                    |     ___/\\_  __ \\/  _ \\   |  |/ __ \\_/ ___\\   __\\\n" + 
				 "                    |    |     |  | \\(  <_> )  |  \\  ___/\\  \\___|  |  \n" + 
	             "                    |____|     |__|   \\____/\\__|  |\\___  >\\___  >__|  \n" + 
				 "                                           \\______|    \\/     \\/      \n" + 
	             "                             _____  .__         .__            \n" + 
				 "                            /  _  \\ |  | ______ |  |__ _____   \n" + 
	             "                           /  /_\\  \\|  | \\____ \\|  |  " + "\\" + "\\__  \\  \n" + 
				 "                          /    |    \\  |_|  |_> >   Y  \\/ __ \\_\n" + 
	             "                          \\____|__  /____/   __/|___|  (____  /\n" + 
				 "                                  \\/     |__|        \\/     \\/ \n" + 
	             " __________________________________________________________________________________________\n" + 
				 "|\t \t \t      Story: TBD \t \t \t       |\n" + 
	             "|\t \t Gengre: Text-based Dungeon crawler \t\t       |\n" + 
				 "|Creators: Sebastian \"Zorobay\" Hegardt, Sebastian \"Snyken\" Senyk, Isak \"Circusfreak\" Lindhé|\n" + 
	             "\n\n" + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ \n" + 
				 "\n\t\t\t     (1)NEW GAME"+ 
	             "\n\t\t\t     (2)LOAD";
	}
	private static int getChosenOption(){ //returns and integer depending on whether the player chose to start		
		int PlayerChoice;                //a new game or load an old save  
		
		while (true){
			PlayerChoice = s.nextInt();
			
			if (PlayerChoice == 1){
				return 1;
			}
			else if (PlayerChoice == 2){
				return 2;
			}
			else{
				; //One more time =)
			}
		}
	}
	public static void initiateMenu(){ //is called by main, and takes action based on what getChosenOption returned
		InitiateProject.gui.setConsoleOutput(menuText()); //Sets the console output to the menu text
		
		int option = getChosenOption();
		
		if (option == 1){
			startNewGame();
			
		}
	
	}
}
