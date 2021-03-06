package practicasu1;
import java.awt.*;

import org.ietf.jgss.GSSContext;

import java.applet.Applet;

public class Practica4 extends Applet {

	public void paint(Graphics g)
	{
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(130, 76, 150, 240, 120, 120);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(143, 120, 68, 68);
		g.fillOval(200, 120, 68, 68);
		g.setColor(Color.WHITE);
		g.fillOval(151, 128, 54, 52);
		g.fillOval(207, 128, 54, 52);
		g.setColor(Color.BLACK);
		g.fillRect(127, 143, 18, 20);
		g.fillRect(266, 143, 17, 20);
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(176, 144, 20, 20);
		g.fillOval(218, 144, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(181, 150, 10, 10);
		g.fillOval(223, 150, 10, 10);
		
		// Boca
		g.setColor(Color.BLACK);
		g.drawArc(200, 220, 50, 10, 40, 180);
		
		// Zapatos
		g.fillRoundRect(162, 334, 29, 26, 20, 20);
		g.fillRoundRect(218, 334, 28, 26, 20, 20);
		
		// Brazos
		g.setColor(Color.YELLOW);
		g.fillRect(279, 262, 17, 60);
		g.fillRect(100, 254, 20, 20);
		g.fillRect(90, 232, 18, 42);
		
		// Manos
		g.setColor(Color.BLACK);
		g.fillOval(86, 211, 26, 26);
		g.fillOval(274, 319, 26, 26);
		
		// Pantalon
		g.setColor(Color.BLUE);
		g.fillRoundRect(130, 290, 150, 50, 30, 30);
		g.setColor(Color.WHITE);
		g.fillRect(200, 330, 10, 10);
		
		// Gorro
		g.setColor(Color.GRAY);
		g.fillOval(184, 40, 46, 46);
		g.setColor(Color.decode("#A93226"));
		g.fillArc(115, 70, 178, 80, 340, 220);

		// Sueter
		g.fillRoundRect(126, 240, 159, 70, 10, 10);
		g.setColor(Color.YELLOW);
		g.fillArc(130, 220, 150, 40, 180, 180);
		g.setColor(Color.GRAY);
		g.drawArc(130, 219, 150, 40, 180, 180);
		g.drawArc(130, 220, 150, 40, 180, 180);
		g.drawArc(130, 221, 150, 40, 180, 180);
		
		g.drawLine(130, 307, 280, 307);
		g.drawLine(130, 308, 280, 308);
		g.drawLine(130, 309, 280, 309);
		
		// Brazos
		g.setColor(Color.WHITE);
		g.fillArc(280, 250, 10, 30, 90, 180);
		g.fillArc(121, 250, 10, 30, 270, 180);
		g.setColor(Color.YELLOW);
		g.fillOval(279, 255, 18, 25);
		g.fillOval(114, 253, 18, 23);
		
		// Palo
		g.setColor(Color.GRAY);
		g.fillRect(96, 70, 8, 220);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(70, 40, 36, 26);
		g.fillRect(94, 54, 12, 20);
		g.fillRect(94, 280, 12, 90);
	}
}
