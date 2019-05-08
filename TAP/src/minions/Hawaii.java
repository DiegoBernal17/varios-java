package minions;
import java.awt.*;
import java.applet.Applet;

public class Hawaii extends Applet {

	private int posi_x, posi_y;
	
	public Hawaii(int x, int y)
	{
		posi_x = x-110;
		posi_y = y-86;
	}
	
	public Hawaii()
	{
		posi_x = -110; // 110
		posi_y = -86; // 86
	}
	
	public void paint(Graphics g)
	{
		// Cuerpo
		g.setColor(Color.YELLOW);
		g.fillRoundRect(posi_x+130, posi_y+86, 150, 220, 100, 100);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(posi_x+169, posi_y+110, 66, 66);
		g.fillOval(posi_x+225, posi_y+110, 66, 66);
		g.setColor(Color.WHITE);
		g.fillOval(posi_x+177, posi_y+119, 51, 48);
		g.fillOval(posi_x+232, posi_y+119, 51, 48);
		g.setColor(Color.BLACK);
		g.fillRect(posi_x+127, posi_y+132, 44, 22);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(posi_x+163, posi_y+130, 9, 26);
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(posi_x+185, posi_y+138, 20, 20);
		g.fillOval(posi_x+239, posi_y+138, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(posi_x+190, posi_y+144, 10, 10);
		g.fillOval(posi_x+244, posi_y+144, 10, 10);
		g.setColor(Color.YELLOW);
		g.fillArc(posi_x+177, posi_y+119, 51, 46, 0, 180);
		g.fillArc(posi_x+232, posi_y+119, 51, 46, 0, 180);
		
		// Flores Cabeza
		int flor_posix=posi_x+130;
		for(int i=0;i<7;i++)
		{
			if(i%2==0)
				g.setColor(Color.MAGENTA);
			else
				g.setColor(Color.PINK);
			int j=0;
			while(j<360)
			{
				g.fillArc(flor_posix, posi_y+86, 24, 24, j, 40);
				j+=60;
			}
			flor_posix+=20;
		}
		
		// Boca
		g.setColor(Color.BLACK);
		g.drawArc(posi_x+200, posi_y+190, 50, 20, 180, 150);
		
		// Sosten
		g.setColor(Color.decode("#704613"));
		g.fillRect(posi_x+130, posi_y+242, 150, 4);
		g.setColor(Color.decode("#C17D2A"));
		g.fillOval(posi_x+188, posi_y+222, 46, 46);
		g.fillOval(posi_x+241, posi_y+222, 44, 44);
		
		// Brazos
		g.setColor(Color.decode("#FFED35"));
		g.fillRect(posi_x+278, posi_y+210, 44, 16);
		g.fillRect(posi_x+110, posi_y+210, 44, 16);
		
		// Manos
		g.setColor(Color.BLACK);
		g.fillOval(posi_x+320, posi_y+206, 26, 26);
		g.fillOval(posi_x+151, posi_y+206, 26, 26);
		
		// Pies
		g.setColor(Color.YELLOW);
		g.fillRect(posi_x+176, posi_y+300, 20, 26);
		g.fillRect(posi_x+220, posi_y+300, 20, 26);
		g.setColor(Color.decode("#E5B74E"));
		g.fillOval(posi_x+171, posi_y+324, 30, 20);
		g.fillOval(posi_x+215, posi_y+324, 30, 20);
		
		// Falda
		int vestido_posix=posi_x+128;
		for(int i=0;i<15;i++)
		{
			if(i%2==0)
				g.setColor(Color.GREEN);
			else
				g.setColor(Color.decode("#99FF62"));
		
			g.fillOval(vestido_posix, posi_y+272, 12, 50);
			vestido_posix+=10;
		}
		
		g.setColor(Color.decode("#78C64E"));
		g.fillRect(posi_x+130, posi_y+273, 150, 5);
	}
}
