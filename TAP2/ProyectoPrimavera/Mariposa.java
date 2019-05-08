
/**
 * Write a description of class Mariposa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Mariposa extends Applet{
	
	public void paint (Graphics g, int x, int y){
		
		g.setColor(Color.orange);
		g.fillOval(x+40, y+40, 50, 70);
		
		g.setColor(Color.orange);
		g.fillOval(x+40, y+90, 50, 50);
		
		g.setColor(Color.orange);
		g.fillOval(x+90, y+40, 50, 70);
		
		g.setColor(Color.orange);
		g.fillOval(x+90, y+90, 50, 50);
		
		g.setColor(Color.black);
		g.fillRoundRect(x+75, y+56, 30, 90, 30, 30);
		
		g.drawLine(x+70, y+10, x+85, y+56);
		g.drawLine(x+120, y+10, x+95, y+56);
	}
	
}