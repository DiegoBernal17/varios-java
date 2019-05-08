package extra;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AngryBird2 extends Applet implements Runnable{
	private int posi_x, posi_y;
	private boolean move;
	
	public AngryBird2()
	{
		posi_x = 0;
		posi_y = 0;
		move=false;
	}
	
	public void start () {
		setSize(700,260);
		Thread th = new Thread (this);
        th.start();
	}
	
	public void paint(Graphics g)
	{
		g.fillOval(posi_x, 50, 200, 200);
		g.fillRoundRect(posi_x+90, 0, 30, 100, 20, 20);
		g.setColor(Color.YELLOW);
		g.fillRoundRect(posi_x+90, 1, 30, 20, 20, 10);
		g.setColor(Color.lightGray);
		g.fillOval(posi_x+54, 104, 48, 48);
		g.fillOval(posi_x+110, 104, 48, 48);
		g.setColor(Color.WHITE);
		g.fillOval(posi_x+90, 76, 26, 26);
		g.fillOval(posi_x+60, 110, 34, 34);
		g.fillOval(posi_x+116, 110, 34, 34);
		g.fillRect(posi_x+120, 176, 36, 6);
		g.setColor(Color.BLACK);
		if(move) {
			g.fillOval(posi_x+83, 120, 14, 14);
			g.fillOval(posi_x+135, 120, 14, 14);
		} else {
			g.fillOval(posi_x+63, 120, 14, 14);
			g.fillOval(posi_x+115, 120, 14, 14);
		}
		g.setColor(Color.ORANGE);
		g.fillRect(posi_x+50, 106, 48, 10);
		g.fillRect(posi_x+110, 106, 48, 10);
		g.setColor(Color.lightGray);
		g.fillArc(posi_x+30, 190, 140, 100, 20, 140);
		g.fillArc(posi_x+36, 196, 128, 52, 160, 200);
		
		g.setColor(Color.YELLOW);
		int[] xPoints = {posi_x+73, posi_x+99, posi_x+107, posi_x+140};
		int[] yPoints = {178, 148, 148,  178};
		g.fillPolygon(xPoints, yPoints, 4);
		int[] xPoints2 = {posi_x+80, posi_x+106, posi_x+132};
		int[] yPoints2 = {180, 200,  180};
		g.fillPolygon(xPoints2, yPoints2, 3);
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			try
			{
				move = !(move);
				posi_x++;
				if(posi_x>=400)
					posi_x=0;
				repaint();
				Thread.sleep(200);
			}
			catch(InterruptedException ex) {}
			i++;
		}
	}
}
