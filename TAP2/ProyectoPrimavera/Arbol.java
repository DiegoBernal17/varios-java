
/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Arbol extends Applet{

	public void paint(Graphics g, int x, int y){
		g.setColor(Color.DARK_GRAY);
		g.fillRect(160+x, 325, 70, 200);
	    
		g.setColor(Color.GREEN);
		g.fillOval(118+x, 126, 151, 151);
		g.fillOval(70+x, 70, 100, 100);
		g.fillOval(130+x, 60, 75, 75);
		g.fillOval(175+x, 60, 75, 75);
		g.fillOval(220+x, 70, 100, 100);
		g.fillOval(70+x, 140, 75, 75);
		g.fillOval(55+x, 190, 75, 75);
		g.fillOval(55+x, 230, 100, 100);
		g.fillOval(130+x, 260, 75, 75);
		g.fillOval(180+x, 260, 75, 75);
		g.fillOval(225+x, 240, 100, 100);
		g.fillOval(255+x, 200, 75, 75);
		g.fillOval(255+x, 150, 75, 75);
		
		
	}
}