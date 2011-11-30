import java.util.Scanner;


public class Menu {
	static Scanner s = new Scanner(System.in);
	
	private static void showMenuText(){

		System.out.println("              __________                   __               __   ");
		System.out.println("              \\______   \\_______  ____    |__| ____   _____/  |_ ");
		System.out.println("               |     ___/\\_  __ \\/  _ \\   |  |/ __ \\_/ ___\\   __\\");
		System.out.println("               |    |     |  | \\(  <_> )  |  \\  ___/\\  \\___|  |  ");
		System.out.println("               |____|     |__|   \\____/\\__|  |\\___  >\\___  >__|  ");
		System.out.println("                                      \\______|    \\/     \\/      ");
		System.out.println("                        _____  .__         .__            ");
		System.out.println("                       /  _  \\ |  | ______ |  |__ _____   ");
		System.out.println("                      /  /_\\  \\|  | \\____ \\|  |  " + "\\" + "\\__  \\  ");
		System.out.println("                     /    |    \\  |_|  |_> >   Y  \\/ __ \\_");
		System.out.println("                     \\____|__  /____/   __/|___|  (____  /");
		System.out.println("                             \\/     |__|        \\/     \\/ ");
		System.out.println(" __________________________________________________________________________________________");
		System.out.println("|\t \t \t \t      Story: TBD \t \t \t \t \t   |");
		System.out.println("|\t \t \t Gengre: Text-based Dungeon crawler\t \t \t \t   |");
		System.out.println("|Creators: Sebastian \"Zorobay\" Hegardt, Sebastian \"Snyken\" Senyk, Isak \"Circusfreak\" Lindhé|");
		System.out.println("\n\n" + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + 
		"\n\t\t\t\t      (1)NEW GAME\n\t\t\t\t\t(2)LOAD");
		
		getChosenOption(); //What did the player choose, New Game or Load game?
	}
	private static int getChosenOption(){ //returns and integer depending on whether the player chose to start		
		int PlayerChoice;                //a new game or load an old save  
		
		while (true){
			PlayerChoice = s.nextInt();
			
			if (PlayerChoice == 1){
				System.out.println("Creating New Game!");
				return 1;
			}
			else if (PlayerChoice == 2){
				System.out.println("Loading Previous Game!");
				return 2;
			}
			else{
				; //One more time =)
			}
		}
	}
	public static void Start(){
		showMenuText();
		getChosenOption();
	}
}
