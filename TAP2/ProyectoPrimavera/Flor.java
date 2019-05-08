
/**
 * Write a description of class Flor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Flor extends Applet{

	public void paint (Graphics g, int x, int y){

		g.setColor(Color.GREEN);
		g.fillRect(x+45, y+81, 10, 50);
		
		g.setColor(Color.red);
		g.fillOval(x+8, y+8, 45, 45);
	
		g.setColor(Color.red);
		g.fillOval(x+8, y+45, 45, 45);
		
		g.setColor(Color.red);
		g.fillOval(x+45, y+8, 45, 45);
		
		g.setColor(Color.red);
		g.fillOval(x+45, y+45, 45, 45);
		
		g.setColor(Color.yellow);
		g.fillOval(x+35, y+35, 30, 30);
		
		/*
		 * g.setColor(Color.GREEN);
		g.fillRect(110,146, 10, 50);
		
		g.setColor(Color.red);
		g.fillOval(73, 73, 45, 45);
		
		g.setColor(Color.red);
		g.fillOval(73, 110, 45, 45);
		
		g.setColor(Color.red);
		g.fillOval(110, 73, 45, 45);
		
		g.setColor(Color.red);
		g.fillOval(110, 110, 45, 45);
		
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 30, 30);
		 */
		

	}
}