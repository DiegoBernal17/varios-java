package practicasu1;
import java.awt.*;
import java.applet.Applet;

public class Practica1 extends Applet {

	public void paint(Graphics g)
	{
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(130, 90, 150, 212, 120, 120);
		
		// Cabello
		g.setColor(Color.ORANGE);
		g.fillArc(124, 86, 170, 56, 96, 126);
		g.fillArc(120, 86, 170, 56, 316, 126);
		
		for(int i=0; i<8; i++)
		{
			g.drawArc(95, 90+i, 50, 30, 0, 180);
			g.drawArc(276, 90+i, 50, 30, 0, 180);
		}
		g.fillOval(86, 98, 18, 20);
		g.fillOval(320, 98, 18, 20);
		g.fillOval(196, 90, 22, 22);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(165, 120, 80, 80);
		g.setColor(Color.WHITE);
		g.fillOval(175, 130, 60, 60);
		g.setColor(Color.decode("#96601F"));
		g.fillOval(189, 150, 30, 30);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(197, 158, 15, 15);
		g.setColor(Color.decode("#353535"));
		g.fillRect(157, 146, 10, 28);
		g.fillRect(243, 146, 10, 28);
		g.setColor(Color.BLACK);
		g.fillRect(127, 148, 30, 24);
		g.fillRect(253, 148, 30, 24);
		
		// Boca
		g.setColor(Color.WHITE);
		g.fillArc(160, 190, 60, 40, 156, 200);
		g.setColor(Color.BLACK);
		g.drawLine(170, 203, 170, 213);
		g.drawLine(184, 208, 184, 213);
		g.drawLine(198, 210, 198, 213);
		g.drawLine(210, 210, 210, 213);
		g.setColor(Color.RED);
		g.fillArc(160, 199, 60, 31, 180, 180);
		
		//Brazos
		g.setColor(Color.YELLOW);
			// Brazo Derecho
		g.fillRoundRect(114, 220, 28, 20, 40, 40);
		g.fillRect(115, 228, 15, 46);
			// Brazo Izquierdo
		g.fillRoundRect(268, 220, 28, 20, 40, 40);
		g.fillRect(280, 228, 15, 46);
		
		// Mano Derecha
		g.setColor(Color.BLACK);
		g.fillRoundRect(112, 270, 20, 24, 10, 10);
		// Mano Izquierda
		g.fillRoundRect(279, 270, 20, 24, 10, 10);
			
		// Pies
		g.setColor(Color.BLACK);
		g.fillOval(170, 304, 38, 20);
		g.fillOval(210, 304, 34, 18);
		
		// Vestido
		g.setColor(Color.CYAN);
		g.fillRect(128, 246, 156, 60);

		for(int i=0; i<10; i++)
		{
			g.drawLine(130, 206+i, 160-i, 246);
			g.drawLine(280, 200+i, 258+i, 246);
		}
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(150, 240, 12, 12);
		g.fillOval(257, 240, 12, 12);
		g.fillRect(128, 300, 156, 6);
		g.setColor(Color.WHITE);
		
		// Circulos del vestido
		int posiX = 139;
		for(int i=0;i<7; i++)
		{
			g.fillOval(posiX, 251, 7, 7);
			g.fillOval(posiX+2, 263, 7, 7);
			g.fillOval(posiX, 275, 7, 7);
			g.fillOval(posiX+2, 287, 7, 7);
			
			posiX += 21;
		}
	}
}
