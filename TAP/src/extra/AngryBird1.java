package extra;

import java.applet.Applet;
import java.awt.*;

public class AngryBird1 extends Applet  implements Runnable 
{
	private int posi_x, posi_y;
	private boolean lado;
	private int avanzar;
	
	public AngryBird1()
	{
		posi_x = 0;
		posi_y = 0;
		lado=false;
	}
	
	public void start () {
		setSize(700,640);
		Thread th = new Thread (this);
        th.start();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		for(int i=0; i<10; i++)
		{
			g.drawLine(posi_x+26-i, posi_y+110+i, posi_x+50-i, posi_y+130+i);
			g.drawLine(posi_x+10, posi_y+130+i+(i%2), posi_x+40, posi_y+130+i+(i%2));
			g.drawLine(posi_x+18+i, posi_y+150+i, posi_x+50+i, posi_y+130+i);
		}
		g.setColor(Color.red);
		g.fillOval(posi_x+70, posi_y+24, 80, 24);
		g.fillOval(posi_x+140, posi_y, 24, 60);
		g.fillOval(posi_x+40,posi_y+ 40, 204, 204);
		g.setColor(Color.white);
		g.fillOval(posi_x+120, posi_y+120, 46, 46);
		g.fillOval(posi_x+160, posi_y+120, 46, 46);
		g.setColor(Color.black);
		g.fillRect(posi_x+110, posi_y+110, 105, 16);
		g.fillOval(posi_x+140, posi_y+134, 16, 16);
		g.fillOval(posi_x+170, posi_y+134, 16, 16);
		g.setColor(Color.lightGray);
		g.fillArc(posi_x+74, posi_y+190, 138, 100, 20, 140);
		g.fillArc(posi_x+80, posi_y+191, 126, 52, 184, 172);
		g.setColor(Color.yellow);
		int[] xPoints = {posi_x+133, posi_x+159, posi_x+167, posi_x+200};
		int[] yPoints = {posi_y+190, posi_y+160, posi_y+160,  posi_y+190};
		g.fillPolygon(xPoints, yPoints, 4);
		int[] xPoints2 = {posi_x+140, posi_x+164, posi_x+192};
		int[] yPoints2 = {posi_y+190, posi_y+210,  posi_y+190};
		g.fillPolygon(xPoints2, yPoints2, 3);
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			try
			{
				if(!lado) {
					posi_x++;
					posi_y++;
					if(posi_x>=400 || posi_y>=400)
						lado=true;
				} else {
					posi_x--;
					posi_y--;
					if(posi_x<=0 || posi_y<=0)
						lado=false;
				}
				
				repaint();
				Thread.sleep(70);
			}
			catch(InterruptedException ex) {}
			i++;
		}
	}
}
