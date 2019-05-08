package practicasu3;

import java.awt.Color;
import java.awt.Graphics;

public class LiebreGrafica extends Thread
{
	private int posi_x=0, posi_y;
	private Graphics g;
	
	public LiebreGrafica(Graphics g)
	{
		this.g = g;
		posi_y = 150;
	}
	
	public void run()
	{
		while(posi_x<840)
		{
			liebre();
			try
			{
				Thread.sleep(100);
				posi_x+=4;
			}
			catch(InterruptedException ex) {}
		}
		for(int i=0; i<6; i++)
		{
			if(i%2==0)
				llegada(true);
			else
				llegada(false);
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex) {}
		}
	}
	
	public void liebre()
	{
		g.setColor(Color.LIGHT_GRAY);
		g.fillRoundRect(posi_x+10, posi_y+40, 60, 44, 40, 40);
		g.fillRoundRect(posi_x+54, posi_y+22, 32, 34, 30, 30);
		g.fillRoundRect(posi_x+56, posi_y+6, 11, 24, 10, 10);
		g.fillRoundRect(posi_x+64, posi_y+6, 11, 24, 10, 10);
		g.fillRoundRect(posi_x+50, posi_y+70, 14, 24, 10, 10);
		g.fillRoundRect(posi_x+14, posi_y+70, 28, 24, 20, 20);
		g.fillOval(posi_x+6, posi_y+36, 20, 20);
		g.setColor(Color.BLACK);
		g.fillOval(posi_x+66, posi_y+30, 8, 8);
		g.drawArc(posi_x+72, posi_y+40, 12, 8, 180, 150);
	}
	
	public void llegada(Boolean color)
	{
		if(color)
			g.setColor(Color.YELLOW);
		else
			g.setColor(Color.WHITE);
		
		g.fillOval(800, 40, 20, 20);
		g.fillOval(800, 100, 20, 20);
		g.fillOval(800, 160, 20, 20);
		g.fillOval(800, 220, 20, 20);
		g.fillOval(800, 280, 20, 20);
		
	}
}
