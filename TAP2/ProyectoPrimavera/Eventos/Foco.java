package Eventos;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class Foco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foco extends Applet
{
    public void paint(Graphics g){
		
		g.setColor(Color.yellow);
		g.fillOval(140, 150, 200, 200);
		
		g.setColor(Color.yellow);
		g.fillRoundRect(205, 310, 70, 105, 100, 70);
		
	}
}
