package dibujosprimavera2;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class Cesped extends Applet
{
	private int posi_x;
	private int posi_y;
	private Color color;
	
	public Cesped(int posi_x, int posi_y, Color color)
	{
		this.posi_x = posi_x-46;
		this.posi_y = posi_y-9;
		if(color==null)
			this.color = Color.GREEN;
		else
			this.color = color;
	}
	
	public Cesped()
	{
		posi_x = 0;
		posi_y = 0;
		color = Color.GREEN;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(color);
		g.fillRect(posi_x, posi_y+10, 98, 10);
		int[] poly_x1 = {posi_x, posi_x+12, posi_x+24};
		int[] poly_x2 = {posi_x+24, posi_x+36, posi_x+48};
		int[] poly_x3 = {posi_x+48, posi_x+60, posi_x+72};
		int[] poly_x4 = {posi_x+72, posi_x+84, posi_x+96};
		int[] poly_y = {posi_y+10, posi_y, posi_y+10};
		g.fillPolygon(poly_x1, poly_y, 3);
		g.fillPolygon(poly_x2, poly_y, 3);
		g.fillPolygon(poly_x3, poly_y, 3);
		g.fillPolygon(poly_x4, poly_y, 3);
	}
	
	public void removeDibujo()
	{
		this.removeAll();
	}
}
