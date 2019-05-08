package practicasu3;
import java.awt.*;
import java.applet.Applet;

public class Practica10 extends Applet implements Runnable {

	private int posi_x, posi_y;
	private int move;
	
	public Practica10(int x, int y)
	{
		posi_x = x+160;
		posi_y = y-20;
	}
	
	public Practica10()
	{
		posi_x = 160; //70
		posi_y = -20; //40
	}
	
	public void start () {
		setSize(600,400);
		Thread th = new Thread (this);
        th.start();
	}
	
	public void paint(Graphics g)
	{
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(posi_x+130, posi_y+76, 150, 240, 120, 120);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+143, posi_y+120, 68, 68);
		g.fillOval(posi_x+200, posi_y+120, 68, 68);
		g.setColor(Color.WHITE);
		g.fillOval(posi_x+151, posi_y+128, 54, 52);
		g.fillOval(posi_x+207, posi_y+128, 54, 52);
		g.setColor(Color.BLACK);
		g.fillRect(posi_x+127, posi_y+143, 18, 20);
		g.fillRect(posi_x+266, posi_y+143, 17, 20);
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(posi_x+176, posi_y+144, 20, 20);
		g.fillOval(posi_x+218, posi_y+144, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(posi_x+181, posi_y+150, 10, 10);
		g.fillOval(posi_x+223, posi_y+150, 10, 10);
		
		// Boca
		g.setColor(Color.BLACK);
		if(move==3)
			g.fillOval(posi_x+210, posi_y+220, 40, 40);
		else
			g.drawArc(posi_x+200, posi_y+220, 50, 10, 40, 180);
		
		// Zapatos
		g.fillRoundRect(posi_x+162, posi_y+334, 29, 26, 20, 20);
		g.fillRoundRect(posi_x+218, posi_y+334, 28, 26, 20, 20);
		
		// Brazos
		g.setColor(Color.YELLOW);
		g.fillRect(posi_x+279, posi_y+262, 17, 60);
		g.fillRect(posi_x+100, posi_y+254, 20, 20);
		g.fillRect(posi_x+90, posi_y+232, 18, 42);
		
		// Manos
		g.setColor(Color.BLACK);
		g.fillOval(posi_x+86, posi_y+211, 26, 26);
		g.fillOval(posi_x+274, posi_y+319, 26, 26);
		
		// Pantalon
		g.setColor(Color.BLUE);
		g.fillRoundRect(posi_x+130, posi_y+290, 150, 50, 30, 30);
		g.setColor(Color.WHITE);
		g.fillRect(posi_x+200,posi_y+330, 10, 10);
		
		// Gorro
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+184, posi_y+40, 46, 46);
		g.setColor(Color.decode("#A93226"));
		g.fillArc(posi_x+115, posi_y+70, 178, 80, 340, 220);

		// Sueter
		g.fillRoundRect(posi_x+126, posi_y+240, 159, 70, 10, 10);
		g.setColor(Color.YELLOW);
		g.fillArc(posi_x+130, posi_y+220, 150, 40, 180, 180);
		g.setColor(Color.GRAY);
		g.drawArc(posi_x+130, posi_y+219, 150, 40, 180, 180);
		g.drawArc(posi_x+130, posi_y+220, 150, 40, 180, 180);
		g.drawArc(posi_x+130, posi_y+221, 150, 40, 180, 180);
		
		g.drawLine(posi_x+130, posi_y+307, posi_x+280, posi_y+307);
		g.drawLine(posi_x+130, posi_y+308, posi_x+280, posi_y+308);
		g.drawLine(posi_x+130, posi_y+309, posi_x+280, posi_y+309);
		
		// Brazos
		g.setColor(Color.WHITE);
		g.fillArc(posi_x+280, posi_y+250, 10, 30, 90, 180);
		g.fillArc(posi_x+121, posi_y+250, 10, 30, 270, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(posi_x+279, posi_y+255, 18, 25);
		g.fillOval(posi_x+114, posi_y+253, 18, 23);
		
		// Palo
		g.setColor(Color.GRAY);
		if(move==1)
		{
			g.fillRect(posi_x-110, posi_y+222, 220, 8);
			g.setColor(Color.DARK_GRAY);
			g.fillOval(posi_x-134, posi_y+220, 26, 36);
			g.fillRect(posi_x-120, posi_y+220, 20, 12);
			g.fillRect(posi_x+84, posi_y+220, 90, 12);
		} else {
			g.fillRect(posi_x+96, posi_y+70, 8, 220);
			g.setColor(Color.DARK_GRAY);
			g.fillOval(posi_x+70, posi_y+40, 36, 26);
			g.fillRect(posi_x+94, posi_y+54, 12, 20);
			g.fillRect(posi_x+94, posi_y+280, 12, 90);
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
				Thread.sleep(1600);
			}
			catch(InterruptedException ex) {}
			i++;
		}
	}
}
