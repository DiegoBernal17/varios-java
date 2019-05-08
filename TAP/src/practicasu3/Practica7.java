package practicasu3;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Practica7 extends Applet implements Runnable
{
	private int posi_x, posi_y;
	private boolean move;
	
	public Practica7(int x, int y)
	{
		posi_x = x;
		posi_y = y;
		move=false;
	}
	
	public Practica7()
	{
		posi_x = 80; // 86
		posi_y = 80; // 86
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
		g.fillRoundRect(posi_x+44, posi_y+4, 150, 212, 120, 120);
		
		// Cabello
		g.setColor(Color.ORANGE);
		g.fillArc(posi_x+38, posi_y, 170, 56, 96, 126);
		g.fillArc(posi_x+34, posi_y, 170, 56, 316, 126);
		
		for(int i=0; i<8; i++)
		{
			g.drawArc(posi_x+9, posi_y+4+i, 50, 30, 0, 180);
			g.drawArc(posi_x+190, posi_y+4+i, 50, 30, 0, 180);
		}
		g.fillOval(posi_x, posi_y+12, 18, 20);
		g.fillOval(posi_x+234, posi_y+12, 18, 20);
		g.fillOval(posi_x+110, posi_y+4, 22, 22);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+79, posi_y+34, 80, 80);
		g.setColor(Color.WHITE);
		g.fillOval(posi_x+89, posi_y+44, 60, 60);
		g.setColor(Color.decode("#96601F"));
		g.fillOval(posi_x+103, posi_y+64, 30, 30);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(posi_x+111, posi_y+72, 15, 15);
		g.setColor(Color.decode("#353535"));
		g.fillRect(posi_x+71, posi_y+60, 10, 28);
		g.fillRect(posi_x+157, posi_y+60, 10, 28);
		g.setColor(Color.BLACK);
		g.fillRect(posi_x+41, posi_y+62, 30, 24);
		g.fillRect(posi_x+167, posi_y+62, 30, 24);
		
		// Boca
		g.setColor(Color.WHITE);
		g.fillArc(posi_x+74, posi_y+104, 60, 40, 156, 200);
		g.setColor(Color.BLACK);
		g.drawLine(posi_x+84, posi_y+117, posi_x+84, posi_y+127);
		g.drawLine(posi_x+98, posi_y+122, posi_x+98, posi_y+127);
		g.drawLine(posi_x+112, posi_y+124, posi_x+112, posi_y+127);
		g.drawLine(posi_x+124, posi_y+124, posi_x+124, posi_y+127);
		g.setColor(Color.RED);
		g.fillArc(posi_x+74, posi_y+113, 60, 31, 180, 180);
		
		//Brazos
		g.setColor(Color.YELLOW);
		
		if(move) {
				// Brazo Derecho
			g.fillRoundRect(posi_x+28, posi_y+134, 28, 20, 40, 40);
			g.fillRect(posi_x-12, posi_y+136, 46, 15);
				// Brazo Izquierdo
			g.fillRoundRect(posi_x+182, posi_y+134, 28, 20, 40, 40);
			g.fillRect(posi_x+206, posi_y+136, 46, 15);
			// Mano Derecha
			g.setColor(Color.BLACK);
			g.fillRoundRect(posi_x-30, posi_y+134, 24, 20, 10, 10);
			// Mano Izquierda
			g.fillRoundRect(posi_x+249, posi_y+134, 24, 20, 10, 10);
		} else {
			// Brazo Derecho
			g.fillRoundRect(posi_x+28, posi_y+134, 28, 20, 40, 40);
			g.fillRect(posi_x+29, posi_y+142, 15, 46);
				// Brazo Izquierdo
			g.fillRoundRect(posi_x+182, posi_y+134, 28, 20, 40, 40);
			g.fillRect(posi_x+194, posi_y+142, 15, 46);
			// Mano Derecha
			g.setColor(Color.BLACK);
			g.fillRoundRect(posi_x+26, posi_y+184, 20, 24, 10, 10);
			// Mano Izquierda
			g.fillRoundRect(posi_x+193, posi_y+184, 20, 24, 10, 10);
		}
		
		// Pies
		g.setColor(Color.BLACK);
		g.fillOval(posi_x+84, posi_y+218, 38, 20);
		g.fillOval(posi_x+124, posi_y+218, 34, 18);
		
		// Vestido
		g.setColor(Color.CYAN);
		g.fillRect(posi_x+42, posi_y+160, 156, 60);

		for(int i=0; i<10; i++)
		{
			g.drawLine(posi_x+44, posi_y+120+i, posi_x+74-i, posi_y+160);
			g.drawLine(posi_x+194, posi_y+120+i, posi_x+172+i, posi_y+160);
		}
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(posi_x+64, posi_y+154, 12, 12);
		g.fillOval(posi_x+171, posi_y+154, 12, 12);
		g.fillRect(posi_x+42, posi_y+214, 156, 6);
		g.setColor(Color.WHITE);
		
		// Circulos del vestido
		int posiX = posi_x+53;
		for(int i=0;i<7; i++)
		{
			g.fillOval(posiX, posi_y+165, 7, 7);
			g.fillOval(posiX+2, posi_y+177, 7, 7);
			g.fillOval(posiX, posi_y+189, 7, 7);
			g.fillOval(posiX+2, posi_y+201, 7, 7);
			
			posiX += 21;
		}
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
