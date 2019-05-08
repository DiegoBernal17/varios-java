
/**
 * Write a description of class Sol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Sol extends Applet{

	public void paint(Graphics g, int x, int y){
		
		g.setColor(Color.yellow);
		g.fillOval(x+1, y+1, 150, 150);
		
		g.setColor(Color.yellow);
		g.drawLine(x+1, y+1, x+70, y+70);
		
		g.setColor(Color.yellow);
		g.drawLine(x+10, y+10, x+40, y+40);
		
		g.setColor(Color.yellow);
		g.drawLine(x+50, y+20, x+80, y+80);
		
		g.setColor(Color.yellow);
		g.drawLine(x+10, y+50, x+100, y+100);
		
		g.setColor(Color.yellow);
		g.drawLine(x+10, y+60, x+120, y+120);
	}
}
