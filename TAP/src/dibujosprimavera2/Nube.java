package dibujosprimavera2;

import java.awt.Color;
import java.awt.Graphics;

public class Nube
{
	private int posi_x;
	private int posi_y;
	private Color color;
	
	public Nube(int posi_x, int posi_y, Color color)
	{
		this.posi_x = posi_x-62;
		this.posi_y = posi_y-40;
		if(color==null)
			this.color = Color.GRAY;
		else
			this.color = color;
	}
	
	public Nube()
	{
		posi_x = -62;
		posi_y = -40;
		color = Color.GRAY;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillOval(posi_x+4, posi_y+0, 80, 60);
		g.fillOval(posi_x+56, posi_y+0, 80, 60);
		g.fillOval(posi_x+0, posi_y+30, 80, 60);
		g.fillOval(posi_x+60, posi_y+30, 80, 60);
		g.fillOval(posi_x+40, posi_y+40, 70, 60);
	}
}
