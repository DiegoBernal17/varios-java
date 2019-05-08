package practicasu2;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Practica3 extends Applet implements MouseListener {
	
	private int color;
	private int color2;
	
	public void init()
	{
		this.addMouseListener(this);
	}

	public void paint(Graphics g)
	{
		setSize(400, 400);
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(130, 76, 150, 220, 140, 140);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(148, 120, 66, 66);
		g.fillOval(198, 120, 66, 66);
		g.setColor(Color.WHITE);
		g.fillOval(156, 128, 52, 50);
		g.fillOval(206, 128, 52, 50);
		g.setColor(Color.BLACK);
		g.fillRect(127, 142, 23, 22);
		g.fillRect(262, 142, 21, 22);
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(175, 138, 20, 20);
		g.fillOval(219, 138, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(180, 144, 10, 10);
		g.fillOval(224, 144, 10, 10);
		
		// Sonrisa
		g.setColor(Color.BLACK);
		g.drawArc(170, 190, 60, 20, 180, 140);
		
		// Cabello
		g.drawArc(170, 74, 30, 10, 0, 160);
		g.drawArc(170, 76, 28, 10, 0, 160);
		g.drawArc(170, 78, 26, 10, 0, 160);
		g.drawArc(218, 74, 30, 10, 20, 160);
		g.drawArc(218, 76, 28, 10, 20, 160);
		g.drawArc(218, 78, 26, 10, 20, 160);
		g.drawLine(210, 80, 212, 70);
		g.drawLine(208, 80, 206, 70);
		
		// Brazos
		g.setColor(Color.YELLOW);
		g.fillRect(126, 230, 20, 50);
		g.fillRect(264, 230, 20, 50);
		// Manos
		g.setColor(Color.BLACK);
		g.fillOval(124, 270, 24, 24);
		g.fillOval(262, 270, 24, 24);
		
		// Ropa
		g.setColor(Color.decode("#191ECF"));
		g.fillRect(155, 230, 100, 50);
		g.setColor(Color.decode("#292FE3"));
		for(int i=0; i<12; i++)
		{
			g.drawLine(128, 210+i, 164, 234+i);
			g.drawLine(246, 234+i, 280, 210+i);
		}
		
		// Pastel
		
		if(color2==0)
			g.setColor(Color.decode("#935116"));
		else if(color2==1)
			g.setColor(Color.decode("#C58245"));
		else
			g.setColor(Color.decode("#B06F34"));
		
		g.fillRoundRect(136, 250, 138, 90, 50, 50);
		
		switch(color)
		{
			case 1: g.setColor(Color.decode("#ACE6FF")); break;
			case 2: g.setColor(Color.decode("#FFAB70")); break;
			case 3: g.setColor(Color.decode("#FC9158")); break;
			case 4: g.setColor(Color.decode("#FFF291")); break;
			case 5: g.setColor(Color.decode("#FFEF66")); break;
			case 6: g.setColor(Color.decode("#E7209C")); break;
			default: g.setColor(Color.decode("#E7209C"));
		}
		g.fillRoundRect(132, 246, 146, 50, 80, 40);
		g.setColor(Color.BLACK);
		g.drawArc(150, 260, 110, 20, 180, 180);
		
		// Velas
		g.setColor(Color.decode("#F8C471"));
		g.fillRoundRect(160, 230, 7, 32, 8, 8);
		g.fillRoundRect(180, 240, 7, 32, 8, 8);
		g.fillRoundRect(200, 232, 7, 32, 8, 8);
		g.fillRoundRect(220, 238, 7, 32, 8, 8);
		g.fillRoundRect(240, 231, 7, 32, 8, 8);
		
		if(color2 == 0)
			g.setColor(Color.decode("#FF9C4F"));
		else if(color2 == 1)
			g.setColor(Color.decode("#FEBD5E"));
		else
			g.setColor(Color.decode("#FF824F"));
		
		g.fillRoundRect(159, 218, 9, 13, 9, 9);
		g.fillRoundRect(179, 227, 9, 14, 9, 9);
		g.fillRoundRect(199, 220, 9, 12, 9, 9);
		g.fillRoundRect(219, 224, 9, 15, 9, 9);
		g.fillRoundRect(239, 219, 9, 13, 9, 9);
	}

	@Override
	public void mouseClicked(MouseEvent eve) 
	{
		if(color < 6)
			color++;
		else
			color=0;
		
		if(color2 < 3)
			color2++;
		else
			color2=0;
		
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent eve) {}

	@Override
	public void mouseExited(MouseEvent eve) {}

	@Override
	public void mousePressed(MouseEvent eve) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
