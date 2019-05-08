
/**
 * Write a description of class Nube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Nube extends Applet {

	public void paint (Graphics g, int x, int y){
		
		Graphics2D g2 = (Graphics2D)g;

        setBackground(Color.blue);
        
        g.setColor(Color.white);
		g.fillOval(x+60, y+60, 30, 30);
		
		g.setColor(Color.WHITE);
		g.fillOval(x+33, y+33, 45, 45);
		
		g.setColor(Color.WHITE);
		g.fillOval(x+33, y+70, 45, 45);
		
		g.setColor(Color.WHITE);
		g.fillOval(x+70, y+33, 45, 45);
		
		g.setColor(Color.WHITE);
		g.fillOval(x+70, y+70, 45, 45);
		
		g.setColor(Color.WHITE);
		g.fillOval(x+10, y+50, 45, 45);
		
		g.setColor(Color.WHITE);
		g.fillOval(x+90, y+50, 45, 45);
		
	}
}
