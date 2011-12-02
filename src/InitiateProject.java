public class InitiateProject{
	public static GUI gui = new GUI();  //The public GUI object that will be used everywhere
	public static void main (String [] args){
		 //Produce the menu text, with options to start a NEW game or LOAD and old one
		 //Create GUI object and create Window
		gui.initiateGUI();
		
		Menu.initiateMenu(); //Add meny text
	
	}
	
}