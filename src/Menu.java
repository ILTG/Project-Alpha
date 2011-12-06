import java.util.Scanner;

public class Menu extends NewGame{
	static Scanner s = new Scanner(System.in);
	private static boolean userIsInMenu = true;
	public static String getMenuText(){ //Displays the menu graphics and options

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
	
	public static boolean getUserInMenu(){  //This helps the listener for the JTextField to know if it should listen
		return userIsInMenu;							//For "1" and "2", which are the options in the menu but not in-game.
	}
	public static void setUserInMenu(boolean isInMenu){
		userIsInMenu = isInMenu;
	}
}
