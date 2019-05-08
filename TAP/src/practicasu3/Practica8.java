package practicasu3;

import java.awt.*;
import java.applet.Applet;

public class Practica8 extends Applet implements Runnable
{
	private int posi_x, posi_y;
	private boolean move;
	
	public Practica8(int x, int y)
	{
		posi_x = x;
		posi_y = y-90;
		move=false;
	}
	
	public Practica8()
	{
		posi_x = 0; // 80
		posi_y = -56; // 90
		move=false;
	}
	
	public void start () {
		setSize(400,400);
		Thread th = new Thread (this);
        th.start();
	}
	
	public void paint(Graphics g)
	{
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(posi_x+50, posi_y+76, 150, 220, 120, 120);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+68, posi_y+120, 66, 66);
		g.fillOval(posi_x+118, posi_y+120, 66, 66);
		g.setColor(Color.YELLOW);
		g.fillOval(posi_x+76, posi_y+128, 52, 50);
		g.fillOval(posi_x+126, posi_y+128, 52, 50);
		g.setColor(Color.WHITE);
		g.fillOval(posi_x+76, posi_y+134, 52, 38);
		g.fillOval(posi_x+126, posi_y+134, 52, 38);
		g.setColor(Color.BLACK);
		g.fillRect(posi_x+47, posi_y+142, 23, 22);
		g.fillRect(posi_x+182, posi_y+142, 21, 22);
		
		if(move)
		{
			// Ojos
			g.setColor(Color.decode("#96601F"));
			g.fillOval(posi_x+92, posi_y+138, 20, 20);
			g.fillOval(posi_x+142, posi_y+138, 20, 20);
			g.setColor(Color.decode("#301A06"));
			g.fillOval(posi_x+97, posi_y+144, 10, 10);
			g.fillOval(posi_x+147, posi_y+144, 10, 10);
		} else {
			// Ojos
			g.setColor(Color.decode("#96601F"));
			g.fillOval(posi_x+92, posi_y+150, 20, 20);
			g.fillOval(posi_x+142, posi_y+150, 20, 20);
			g.setColor(Color.decode("#301A06"));
			g.fillOval(posi_x+97, posi_y+156, 10, 10);
			g.fillOval(posi_x+147, posi_y+156, 10, 10);
		}
		
		g.setColor(Color.BLACK);
		g.drawLine(posi_x+96, posi_y+220, posi_x+154, posi_y+220);
		// Cabello
		g.drawLine(posi_x+30, posi_y+120, posi_x+60, posi_y+120);
		g.drawLine(posi_x+40, posi_y+96, posi_x+70, posi_y+116);
		g.drawLine(posi_x+70, posi_y+100, posi_x+70, posi_y+80);
		g.drawLine(posi_x+80, posi_y+106, posi_x+85, posi_y+70);
		g.drawLine(posi_x+100, posi_y+96, posi_x+96, posi_y+60);
		g.drawLine(posi_x+116, posi_y+90, posi_x+122, posi_y+56);
		g.drawLine(posi_x+130, posi_y+98, posi_x+132, posi_y+60);
		g.drawLine(posi_x+150, posi_y+91, posi_x+145, posi_y+64);
		g.drawLine(posi_x+164, posi_y+96, posi_x+194, posi_y+76);
		g.drawLine(posi_x+176, posi_y+106, posi_x+206, posi_y+100);
		
		// Dientes
		g.setColor(Color.WHITE);
		int d1xPoly[] = {posi_x+100, posi_x+120, posi_x+110};
        int d1yPoly[] = {posi_y+221, posi_y+221, posi_y+231};
		Polygon d1 = new Polygon(d1xPoly, d1yPoly, 3);
		int d2xPoly[] = {posi_x+130, posi_x+150, posi_x+140};
        int d2yPoly[] = {posi_y+221, posi_y+221, posi_y+231};
		Polygon d2 = new Polygon(d2xPoly, d2yPoly, 3);
		g.fillPolygon(d1);
		g.fillPolygon(d2);
		
		// Vestimenta
		g.setColor(Color.decode("#671590"));
		int right_xPoly[] = {posi_x, posi_x+50, posi_x+50};
		int right_yPoly[] = {posi_y+180, posi_y+200, posi_y+280};
		Polygon right_capa = new Polygon(right_xPoly, right_yPoly, 3);
		g.fillPolygon(right_capa);
		int left_xPoly[] = {posi_x+200, posi_x+250, posi_x+200};
		int left_yPoly[] = {posi_y+200, posi_y+180, posi_y+280};
		Polygon left_capa = new Polygon(left_xPoly, left_yPoly, 3);
		g.fillPolygon(left_capa);
		g.fillRect(posi_x+40, posi_y+250, 170, 80);
		
		// Piernas
		g.setColor(Color.WHITE);
		int pies_xPoly[] = {posi_x+125, posi_x+90, posi_x+160};
		int pies_yPoly[] = {posi_y+286, posi_y+330, posi_y+330};
		Polygon pies = new Polygon(pies_xPoly, pies_yPoly, 3);
		g.fillPolygon(pies);
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+128, posi_y+314, 24, 18);
		g.fillOval(posi_x+100, posi_y+312, 26, 20);
		g.setColor(Color.BLACK);
		g.drawLine(posi_x+125, posi_y+286, posi_x+125, posi_y+250);
		int piernas_xPoly[] = {posi_x+125, posi_x+100, posi_x+150};
		int piernas_yPoly[] = {posi_y+286, posi_y+315, posi_y+315};
		Polygon piernas = new Polygon(piernas_xPoly, piernas_yPoly, 3);
		g.fillPolygon(piernas);
		
		// Manos
		g.setColor(Color.DARK_GRAY);
		g.fillOval(posi_x+46, posi_y+302, 20, 20);
		g.fillOval(posi_x+180, posi_y+302, 20, 20);
		// Brazos
		g.setColor(Color.decode("#812FA9"));
		g.fillRect(posi_x+46, posi_y+256, 20, 50);
		g.fillRect(posi_x+180, posi_y+256, 20, 50);
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
}
