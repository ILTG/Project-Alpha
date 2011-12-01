public class InitiateProject{
	public static void main (String [] args){
		 //Produce the menu text, with options to start a NEW game or LOAD and old one
		GUI gui = new GUI(); //Create GUI object and create Window
		gui.initiateGUI();
		gui.setConsoleOutput("              __________                   __               __   \n" + 
							 "              \\______   \\_______  ____    |__| ____   _____/  |_ \n" + 
				             "               |     ___/\\_  __ \\/  _ \\   |  |/ __ \\_/ ___\\   __\\\n" + 
							 "               |    |     |  | \\(  <_> )  |  \\  ___/\\  \\___|  |  \n" + 
				             "               |____|     |__|   \\____/\\__|  |\\___  >\\___  >__|  \n" + 
							 "                                      \\______|    \\/     \\/      \n");
		
		Menu.initiateMenu(); //Add meny text
	
	}
	
}