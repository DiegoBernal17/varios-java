package practicasu3;
import java.awt.Color;
import java.awt.Graphics;

public class TortugaGrafica extends Thread
{
	private int posi_x, posi_y;
	private Graphics g;
	
	public TortugaGrafica(Graphics g)
	{
		this.g = g;
		posi_y = 60;
		posi_x = 0;
	}
	
	public void run()
	{
		while(posi_x<840)
		{
			tortuga();
			try
			{
				Thread.sleep(100);
				posi_x+=2;
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
	
	public void tortuga()
	{
		g.setColor(Color.GREEN);
		g.fillArc(posi_x+10, posi_y+10, 80, 80, 0, 180);
		g.setColor(Color.decode("#B46D2D"));
		g.fillArc(posi_x+15, posi_y+30, 90, 40, 180, 180);
		g.fillOval(posi_x+30, posi_y+60, 20, 20);
		g.fillOval(posi_x+66, posi_y+60, 20, 20);
		g.fillRoundRect(posi_x+91, posi_y+20, 13, 40, 10, 10);
		g.fillOval(posi_x+86, posi_y+16, 30, 30);
		g.setColor(Color.BLACK);
		g.fillOval(posi_x+100, posi_y+24, 7, 7);
		g.drawArc(posi_x+104, posi_y+30, 10, 10, 180, 160);
		g.setColor(Color.decode("#3B8545"));
		g.fillRoundRect(posi_x+26, posi_y+18, 14, 14, 6, 6);
		g.fillRoundRect(posi_x+20, posi_y+34, 14, 14, 6, 6);
		g.fillRoundRect(posi_x+48, posi_y+14, 14, 14, 6, 6);
		g.fillRoundRect(posi_x+42, posi_y+32, 14, 14, 6, 6);
		g.fillRoundRect(posi_x+65, posi_y+30, 14, 14, 6, 6);
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
