package dibujosprimavera2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Arbol extends Applet implements Runnable
{
	private int posi_x;
	private int posi_y;
	private Color color;
	private boolean move;
	
	public Arbol(int posi_x, int posi_y, Color color)
	{
		this.posi_x = posi_x-60;
		this.posi_y = posi_y-60;
		if(color == null)
			this.color = new Color(0,200,0);
		else
			this.color = color;
		move=false;
		Thread th = new Thread (this);
        th.start();
	}
	
	public void start()
	{
		setSize(400,400);
		Thread th = new Thread (this);
        th.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			try
			{	
				move = !(i%2==0);
				repaint();
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {}
			i++;
		}
	}
	
	public Arbol()
	{
		posi_x = 0;
		posi_y = 0;
		color = new Color(0,200,0);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(new Color(100,50,0));
		g.fillRect(posi_x+45, posi_y+100, 30, 90);
		g.setColor(color);
		if(move)
		{
			g.fillOval(posi_x+10, posi_y+20, 96, 96);
			g.fillOval(posi_x+20, posi_y+0, 76, 76);
			g.fillOval(posi_x+0, posi_y+30, 96, 76);
			g.fillOval(posi_x+20, posi_y+30, 96, 76);
		}
		else
		{
			g.fillOval(posi_x+10, posi_y+20, 100, 100);
			g.fillOval(posi_x+20, posi_y+0, 80, 80);
			g.fillOval(posi_x+0, posi_y+30, 100, 80);
			g.fillOval(posi_x+20, posi_y+30, 100, 80);
		}
	}
}
