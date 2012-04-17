public class InitiateProject{
	public static GUI gui = new GUI(Menu.getMenuText());  //The public GUI object that will be used everywhere, adds the menu text
													      ////Produce the menu text, with options to start a NEW game or LOAD and old one
	public static void main (String [] args){
		 
		gui.initiateGUI();//Create and show GUI
		 
	
	}
	
}