package dibujosprimavera2;

import java.awt.Color;
import java.awt.Graphics;

public class Sol 
{
	private int posi_x;
	private int posi_y;
	private Color color;
	
	public Sol(int posi_x, int posi_y, Color color)
	{
		this.posi_x = posi_x;
		this.posi_y = posi_y;
		this.color = color;
	}
	
	public Sol()
	{
		posi_x = 0;
		posi_y = 0;
		color = Color.GREEN;
	}
	
	public void paint(Graphics g)
	{
		
	}
}
