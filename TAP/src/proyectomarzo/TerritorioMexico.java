package proyectomarzo;
import java.awt.*;

public class TerritorioMexico {

	public TerritorioMexico(Graphics g) {
		g.drawString("Hace cas 76 años los mexicanos recibíamos una de las noticias más trascendentes de la historia del país: la expropiación petrolera.", 10, 40);
		g.setColor(Color.decode("#12A01F"));//Verde
		g.fillRect(50, 220, 90, 130);
		g.setColor(Color.WHITE);
		g.fillRect(140, 220, 100, 130);
		g.setColor(Color.decode("#C91A1F"));//Rojo
		g.fillRect(230, 220, 90, 130);
		g.setColor(Color.decode("#AF6626"));//Cafe
		g.fillOval(166, 266, 40, 40);
	}

}
