package practicasu1;
import java.awt.*;
import java.applet.Applet;

public class Practica5 extends Applet {

	public void paint(Graphics g)
	{
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(130, 86, 150, 220, 100, 100);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(169, 110, 66, 66);
		g.fillOval(225, 110, 66, 66);
		g.setColor(Color.WHITE);
		g.fillOval(177, 119, 51, 48);
		g.fillOval(232, 119, 51, 48);
		g.setColor(Color.BLACK);
		g.fillRect(127, 132, 44, 22);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(163, 130, 9, 26);
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(185, 138, 20, 20);
		g.fillOval(239, 138, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(190, 144, 10, 10);
		g.fillOval(244, 144, 10, 10);
		g.setColor(Color.YELLOW);
		g.fillArc(177, 119, 51, 46, 0, 180);
		g.fillArc(232, 119, 51, 46, 0, 180);
		
		// Flores Cabeza
		int flor_posix=130;
		for(int i=0;i<7;i++)
		{
			if(i%2==0)
				g.setColor(Color.MAGENTA);
			else
				g.setColor(Color.PINK);
			int j=0;
			while(j<360)
			{
				g.fillArc(flor_posix, 86, 24, 24, j, 40);
				j+=60;
			}
			flor_posix+=20;
		}
		
		// Boca
		g.setColor(Color.BLACK);
		g.drawArc(200, 190, 50, 20, 180, 150);
		
		// Sosten
		g.setColor(Color.decode("#704613"));
		g.fillRect(130, 242, 150, 4);
		g.setColor(Color.decode("#C17D2A"));
		g.fillOval(188, 222, 46, 46);
		g.fillOval(241, 222, 44, 44);
		
		// Brazos
		g.setColor(Color.decode("#FFED35"));
		g.fillRect(278, 210, 44, 16);
		g.fillRect(110, 210, 44, 16);
		
		// Manos
		g.setColor(Color.BLACK);
		g.fillOval(320, 206, 26, 26);
		g.fillOval(151, 206, 26, 26);
		
		// Pies
		g.setColor(Color.YELLOW);
		g.fillRect(176, 300, 20, 26);
		g.fillRect(220, 300, 20, 26);
		g.setColor(Color.decode("#E5B74E"));
		g.fillOval(171, 324, 30, 20);
		g.fillOval(215, 324, 30, 20);
		
		// Falda
		int vestido_posix=128;
		for(int i=0;i<15;i++)
		{
			if(i%2==0)
				g.setColor(Color.GREEN);
			else
				g.setColor(Color.decode("#99FF62"));
		
			g.fillOval(vestido_posix, 272, 12, 50);
			vestido_posix+=10;
		}
		
		g.setColor(Color.decode("#78C64E"));
		g.fillRect(130, 273, 150, 5);
	}
}
