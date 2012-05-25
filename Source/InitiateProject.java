public class InitiateProject{
	public static GUI gui = new GUI();  //The public GUI object that will be used everywhere. Initiates the GUI
	public static Inventory inv = new Inventory(400,400);
	
	public static void main (String [] args){
		 
		gui.setConsoleOutput(Menu.getMenuText()); //Create the menu text
		
	
	}
	
}