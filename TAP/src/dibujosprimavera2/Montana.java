package dibujosprimavera2;

import java.awt.Color;
import java.awt.Graphics;

public class Montana
{
	private int posi_x;
	private int posi_y;
	private Color color;
	
	public Montana(int posi_x, int posi_y, Color color)
	{
		this.posi_x = posi_x-60;
		this.posi_y = posi_y-70;
		if(color==null)
			this.color = Color.decode("#935116");
		else
			this.color = color;
	}
	
	public Montana()
	{
		posi_x = 0;
		posi_y = 0;
		color = Color.decode("#935116");
	}
	
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillArc(posi_x+0, posi_y+0, 150, 320, 0, 180);
	}
}
