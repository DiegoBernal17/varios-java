package practicasu3;
import java.awt.*;
import java.applet.Applet;

public class Practica9 extends Applet implements Runnable
{	
	private int posi_x, posi_y;
	private int move;
	
	public Practica9(int x, int y)
	{
		posi_x = x;
		posi_y = y;
		move=0;
	}
	
	public Practica9()
	{
		posi_x = 56; // 128
		posi_y = 0; // 72
		move=0;
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
		g.fillRoundRect(posi_x+2, posi_y+4, 150, 220, 140, 140);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+20, posi_y+48, 66, 66);
		g.fillOval(posi_x+70, posi_y+48, 66, 66);
		g.setColor(Color.WHITE);
		g.fillOval(posi_x+28, posi_y+56, 52, 50);
		g.fillOval(posi_x+78, posi_y+56, 52, 50);
		g.setColor(Color.BLACK);
		g.fillRect(posi_x-1, posi_y+70, 23, 22);
		g.fillRect(posi_x+134, posi_y+70, 21, 22);
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(posi_x+47, posi_y+66, 20, 20);
		g.fillOval(posi_x+91, posi_y+66, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(posi_x+52, posi_y+72, 10, 10);
		g.fillOval(posi_x+96, posi_y+72, 10, 10);
		
		// Sonrisa
		g.setColor(Color.BLACK);
		g.drawArc(posi_x+42, posi_y+118, 60, 20, 180, 140);
		
		// Cabello
		g.drawArc(posi_x+42, posi_y+2, 30, 10, 0, 160);
		g.drawArc(posi_x+42, posi_y+4, 28, 10, 0, 160);
		g.drawArc(posi_x+42, posi_y+6, 26, 10, 0, 160);
		g.drawArc(posi_x+90, posi_y+2, 30, 10, 20, 160);
		g.drawArc(posi_x+90, posi_y+4, 28, 10, 20, 160);
		g.drawArc(posi_x+90, posi_y+6, 26, 10, 20, 160);
		g.drawLine(posi_x+82, posi_y+8, posi_x+84, posi_y-2);
		g.drawLine(posi_x+80, posi_y+8, posi_x+78, posi_y-2);
		
		// Brazos
		g.setColor(Color.YELLOW);
		g.fillRect(posi_x-2, posi_y+158, 20, 50);
		g.fillRect(posi_x+134, posi_y+158, 20, 50);
		// Manos
		g.setColor(Color.BLACK);
		g.fillOval(posi_x-4, posi_y+198, 24, 24);
		g.fillOval(posi_x+134, posi_y+198, 24, 24);
		
		// Ropa
		g.setColor(Color.decode("#191ECF"));
		g.fillRect(posi_x+27, posi_y+158, 100, 50);
		g.setColor(Color.decode("#292FE3"));
		for(int i=0; i<12; i++)
		{
			g.drawLine(posi_x, posi_y+138+i, posi_x+34, posi_y+162+i);
			g.drawLine(posi_x+118, posi_y+162+i, posi_x+154, posi_y+138+i);
		}
		
		// Pastel
		g.setColor(Color.decode("#935116"));
		g.fillRoundRect(posi_x+8, posi_y+178, 138, 90, 50, 50);
		g.setColor(Color.decode("#E7209C"));
		g.fillRoundRect(posi_x+4, posi_y+174, 146, 50, 80, 40);
		g.setColor(Color.BLACK);
		g.drawArc(posi_x+22, posi_y+188, 110, 20, 180, 180);
		
		// Velas
		g.setColor(Color.decode("#F8C471"));
		g.fillRoundRect(posi_x+32, posi_y+158, 7, 32, 8, 8);
		g.fillRoundRect(posi_x+52, posi_y+168, 7, 32, 8, 8);
		g.fillRoundRect(posi_x+72, posi_y+160, 7, 32, 8, 8);
		g.fillRoundRect(posi_x+92, posi_y+166, 7, 32, 8, 8);
		g.fillRoundRect(posi_x+112, posi_y+159, 7, 32, 8, 8);
		
		if(move==1)
		{
			g.setColor(Color.decode("#FF824F"));
			g.fillRoundRect(posi_x+33, posi_y+146, 9, 13, 9, 9);
			g.fillRoundRect(posi_x+53, posi_y+155, 9, 14, 9, 9);
			g.fillRoundRect(posi_x+73, posi_y+148, 9, 12, 9, 9);
			g.fillRoundRect(posi_x+93, posi_y+152, 9, 15, 9, 9);
			g.fillRoundRect(posi_x+113, posi_y+147, 9, 13, 9, 9);
		} else if(move==3) {
			g.setColor(Color.decode("#FF824F"));
			g.fillRoundRect(posi_x+29, posi_y+146, 9, 13, 9, 9);
			g.fillRoundRect(posi_x+49, posi_y+155, 9, 14, 9, 9);
			g.fillRoundRect(posi_x+69, posi_y+148, 9, 12, 9, 9);
			g.fillRoundRect(posi_x+89, posi_y+152, 9, 15, 9, 9);
			g.fillRoundRect(posi_x+109, posi_y+147, 9, 13, 9, 9);
		} else {
			
			g.setColor(Color.decode("#FF7520"));
			g.fillRoundRect(posi_x+31, posi_y+146, 9, 13, 9, 9);
			g.fillRoundRect(posi_x+51, posi_y+155, 9, 14, 9, 9);
			g.fillRoundRect(posi_x+71, posi_y+148, 9, 12, 9, 9);
			g.fillRoundRect(posi_x+91, posi_y+152, 9, 15, 9, 9);
			g.fillRoundRect(posi_x+111, posi_y+147, 9, 13, 9, 9);
		}
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			try
			{	
				move++;
				repaint();
				if(move==4) move=0;
				Thread.sleep(600);
			}
			catch(InterruptedException ex) {}
			i++;
		}
	}
}
