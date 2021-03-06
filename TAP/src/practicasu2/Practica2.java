package practicasu2;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Practica2 extends Applet implements ActionListener {
	
	private Menu menu1, menu2;
	private MenuItem[][] m;
	private int seleccion;
	
	public void init()
	{
		m = new MenuItem[2][3];
		
		menu1 = new Menu("Piel");
		m[0][0] = new MenuItem("Amarilla");
		m[0][0].addActionListener(this);
		menu1.add(m[0][0]);
		m[0][1] = new MenuItem("Roja");
		m[0][1].addActionListener(this);
		menu1.add(m[0][1]);
		m[0][2] = new MenuItem("Verde");
		m[0][2].addActionListener(this);
		menu1.add(m[0][2]);
		
		menu2 = new Menu("Capa");
		m[1][0] = new MenuItem("Morada");
		m[1][0].addActionListener(this);
		menu2.add(m[1][0]);
		m[1][1] = new MenuItem("Gris");
		m[1][1].addActionListener(this);
		menu2.add(m[1][1]);
		m[1][2] = new MenuItem("Azul");
		m[1][2].addActionListener(this);
		menu2.add(m[1][2]);
		
		Object f = getParent ();
		  while (! (f instanceof Frame))
		    f = ((Component) f).getParent ();
		  Frame frame = (Frame) f;
		  
		frame.getMenuBar().add(menu1);
		frame.getMenuBar().add(menu2);
		frame.setSize(500, 500);
	}

	public void paint(Graphics g)
	{
		
		// Cuerpo
		g.setColor(Color.YELLOW);
		if(seleccion==1)
			g.setColor(Color.RED);
		else if(seleccion==2)
			g.setColor(Color.GREEN);
		
		g.fillRoundRect(130, 76, 150, 220, 120, 120);
		
		// Lentes
		g.setColor(Color.GRAY);
		g.fillOval(148, 120, 66, 66);
		g.fillOval(198, 120, 66, 66);
		g.setColor(Color.YELLOW);
		if(seleccion==1)
			g.setColor(Color.RED);
		else if(seleccion==2)
			g.setColor(Color.GREEN);
		g.fillOval(156, 128, 52, 50);
		g.fillOval(206, 128, 52, 50);
		g.setColor(Color.WHITE);
		g.fillOval(156, 134, 52, 38);
		g.fillOval(206, 134, 52, 38);
		g.setColor(Color.BLACK);
		g.fillRect(127, 142, 23, 22);
		g.fillRect(262, 142, 21, 22);
		
		// Ojos
		g.setColor(Color.decode("#96601F"));
		g.fillOval(172, 148, 20, 20);
		g.fillOval(222, 148, 20, 20);
		g.setColor(Color.decode("#301A06"));
		g.fillOval(177, 154, 10, 10);
		g.fillOval(227, 154, 10, 10);
		
		g.setColor(Color.BLACK);
		g.drawLine(176, 220, 234, 220);
		// Cabello
		g.drawLine(110, 120, 140, 120);
		g.drawLine(120, 96, 150, 116);
		g.drawLine(150, 100, 150, 80);
		g.drawLine(160, 106, 165, 70);
		g.drawLine(180, 96, 176, 60);
		g.drawLine(196, 90, 202, 56);
		g.drawLine(210, 98, 212, 60);
		g.drawLine(230, 91, 225, 64);
		g.drawLine(244, 96, 274, 76);
		g.drawLine(256, 106, 286, 100);
		
		// Dientes
		g.setColor(Color.WHITE);
		int d1xPoly[] = {180, 200, 190};
        int d1yPoly[] = {221, 221, 231};
		Polygon d1 = new Polygon(d1xPoly, d1yPoly, 3);
		int d2xPoly[] = {210, 230, 220};
        int d2yPoly[] = {221, 221, 231};
		Polygon d2 = new Polygon(d2xPoly, d2yPoly, 3);
		g.fillPolygon(d1);
		g.fillPolygon(d2);
		
		// Vestimenta
		
			g.setColor(Color.decode("#671590"));
		if(seleccion==4)
			g.setColor(Color.GRAY);
		else if(seleccion==5)
			g.setColor(Color.BLUE);
		
		int right_xPoly[] = {80, 130, 130};
		int right_yPoly[] = {180, 200, 280};
		Polygon right_capa = new Polygon(right_xPoly, right_yPoly, 3);
		g.fillPolygon(right_capa);
		int left_xPoly[] = {280, 330, 280};
		int left_yPoly[] = {200, 180, 280};
		Polygon left_capa = new Polygon(left_xPoly, left_yPoly, 3);
		g.fillPolygon(left_capa);
		g.fillRect(120, 250, 170, 80);
		
		// Piernas
		g.setColor(Color.WHITE);
		int pies_xPoly[] = {205, 170, 240};
		int pies_yPoly[] = {286, 330, 330};
		Polygon pies = new Polygon(pies_xPoly, pies_yPoly, 3);
		g.fillPolygon(pies);
		g.setColor(Color.GRAY);
		g.fillOval(208, 314, 24, 18);
		g.fillOval(180, 312, 26, 20);
		g.setColor(Color.BLACK);
		g.drawLine(205, 286, 205, 250);
		int piernas_xPoly[] = {205, 180, 230};
		int piernas_yPoly[] = {286, 315, 315};
		Polygon piernas = new Polygon(piernas_xPoly, piernas_yPoly, 3);
		g.fillPolygon(piernas);
		
		// Manos
		g.setColor(Color.DARK_GRAY);
		g.fillOval(126, 302, 20, 20);
		g.fillOval(260, 302, 20, 20);
		// Brazos
		g.setColor(Color.decode("#812FA9"));
		if(seleccion==4)
			g.setColor(Color.LIGHT_GRAY);
		else if(seleccion==5)
			g.setColor(Color.CYAN);
		g.fillRect(126, 256, 20, 50);
		g.fillRect(260, 256, 20, 50);
		
	}

	public void actionPerformed(ActionEvent eve)
	{
		int contador=0;
		for(int i=0; i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				if(eve.getSource() == m[i][j])
				{
					seleccion = contador;
					break;
				}
				contador++;
			}
		}
		repaint();
	}
}
