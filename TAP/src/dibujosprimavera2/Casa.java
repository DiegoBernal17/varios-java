package dibujosprimavera2;

import java.awt.Color;
import java.awt.Graphics;

public class Casa {
	
	private int x,y;
	
	public Casa()
	{
		x=0;
		y=0;
	}
	
	public void paint(Graphics g)
	{
		g.fillRect(400,150, 200, 150);// CuadroCasa
		 g.setColor(new Color(100,50,0));
		 int x[] = {400, 500, 600};
		 int y[] = {150, 50, 150};
		 int n = 3;
		 g.fillPolygon(x, y, n);
		 g.fillRect(430,220, 30, 30);// VentanaCasa
		 g.fillRect(530,220, 30, 30);
		 g.fillRect(480,250, 30, 50);// puertacasa
	}

}
