package dibujosprimavera;

import java.awt.Color;
import java.awt.Graphics;

public class Catarina {
	private int posi_x;
	private int posi_y;
	private Color color;
	
	public Catarina(int posi_x, int posi_y, Color color)
	{
		this.posi_x = posi_x-250;
		this.posi_y = posi_y-240;
		this.color = color;
	}
	
	public Catarina()
	{
		posi_x = 0;
		posi_y = 0;
		color = Color.MAGENTA;
	}
	
	public void paint(Graphics g)
	{
		g.drawLine (posi_x+250,posi_y+250,posi_x+250,posi_y+480);
	    g.drawLine (posi_x+100,posi_y+250,posi_x+390,posi_y+250);
	    g.setColor(Color.red);
	    g.drawOval (posi_x+100,posi_y+80,300,400);
	    //ojos
	    g.setColor(Color.black);
	    g.drawOval (posi_x+180,posi_y+130,30,30);
	    g.drawOval (posi_x+280,posi_y+130,30,30);
	    g.drawOval (posi_x+188,posi_y+135,15,15);
	    g.drawOval (posi_x+288,posi_y+135,15,15);
	    g.fillOval (posi_x+188,posi_y+135,15,15);
	    g.fillOval (posi_x+288,posi_y+135,15,15);
	    
	    //
	    g.setColor(Color.black);
	    g.drawOval (posi_x+180,posi_y+300,40,40);
	    g.drawOval (posi_x+140,posi_y+380,40,40);
	    g.drawOval (posi_x+280,posi_y+300,40,40);
	    g.drawOval (posi_x+320,posi_y+380,40,40);
	    g.fillOval (posi_x+180,posi_y+300,40,40);
	    g.fillOval (posi_x+140,posi_y+380,40,40);
	    g.fillOval (posi_x+280,posi_y+300,40,40);
	    g.fillOval (posi_x+320,posi_y+380,40,40);
	    
	    //
	    g.drawLine (posi_x+230,posi_y+80,posi_x+230,posi_y+30);
	    g.drawLine (posi_x+270,posi_y+80,posi_x+270,posi_y+30);
	     g.setColor(Color.black);
	    g.drawOval (posi_x+228,posi_y+25,5,5);
	    g.drawOval (posi_x+268,posi_y+25,5,5);
	    g.fillOval (posi_x+228,posi_y+25,5,5);
	    g.fillOval (posi_x+268,posi_y+25,5,5);
	    
	    //
	    g.drawLine (posi_x+390,posi_y+200,posi_x+420,posi_y+240);
	    g.drawLine (posi_x+370,posi_y+400,posi_x+420,posi_y+430);
	    g.drawLine (posi_x+110,posi_y+200,posi_x+70,posi_y+250);
	    g.drawLine (posi_x+130,posi_y+400,posi_x+70,posi_y+440);
	}
}
