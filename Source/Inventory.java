import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Inventory extends JPanel {
	JFrame frame;
	private final int WIDTH;
	private final int HEIGHT;
	
	private static Image items[][] = new Image[10][10];
	private static String itemsLabel[][] = new String[10][10];
	

	public Inventory(int x, int y){
		frame = new JFrame();
	
		frame.setSize(x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLayout(null);
		setLayout(null);
		setSize(x, x);
		
		WIDTH = x;
		HEIGHT = y;
		
	}
	
	public void toggleInventory(boolean show){
		frame.setVisible(show);
	}
	
	private Image getImage(String filePath){
		return new ImageIcon(filePath).getImage();
	}
	public void loadImages(){
		items[0][0] = getImage("/Project-Alpha/äpple.png");
		items[4][4] = getImage("/Project-Alpha/apelsin.png");
		
		itemsLabel[0][0] = "Äpple";
		itemsLabel[4][4] = "Apelsin";
	}
	
	public void paint(Graphics g){
		
		g.setColor(Color.BLACK);
		for(int i = 40; i < WIDTH; i += 40){
			g.drawLine(i, 0, i, HEIGHT);
			g.drawLine(0, i, 400, i);
		}
		
		int ix = 0; int iy = 0;
		for(int i = 0; i < 10; i++){
			ix = 0; //Set x to 0 so as to start over from the left
			for(int a = 0; a < 10; a++){
				g.drawImage(items[i][a], ix, iy, 40, 40, null);
				ix += 40;
			}
			iy += 40;
		}
	
		
	}
}
