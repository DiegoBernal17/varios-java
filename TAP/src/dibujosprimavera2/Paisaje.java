package dibujosprimavera2;

import java.awt.Color;
import java.awt.Graphics;

public class Paisaje {

	public void paint(Graphics g)
	{
		//didujar un string en la cordenada x 25 y la cordenada y 25
		 g.drawString(" BIENVENDIDO A LA CASITA ", 400,10);
		 
		g.setColor(new Color(20,100,200));
		 g.fillRect(1,1, 1300, 500);// fondo cielo
		 
		g.setColor(Color.LIGHT_GRAY);
		 g.fillRect(1,200, 1300, 500);// fondo
		 
		g.setColor(new Color(200,100,0));
		 
		g.fillRect(400,150, 200, 150);// CuadroCasa
		 g.setColor(new Color(100,50,0));
		 int x[] = {400, 500, 600};
		 int y[] = {150, 50, 150};
		 int n = 3;
		 g.fillPolygon(x, y, n);
		 g.fillRect(430,220, 30, 30);// VentanaCasa
		 g.fillRect(530,220, 30, 30);
		 g.fillRect(480,250, 30, 50);// puertacasa
		 //caminitocasa
		 g.setColor(Color.BLACK);
		 int xP[] = {480, 510, 520,470};
		 int yP[] = {300, 300, 550,550};
		 int nP = 4;
		 g.fillPolygon(xP, yP, nP);
		 //SOL
		 g.setColor(new Color(255,255,0));
		 g.fillOval(200, 10, 100, 100);
		 g.drawLine(250,115, 250, 1);
		 g.drawLine(195,55, 305, 55);
		 // ARBOLES
		 g.setColor(new Color(100,50,0));
		 g.fillRect(830,290, 30, 70);
		 g.fillRect(135,380, 30, 90);
		 g.setColor(new Color(0,200,0));
		 g.fillOval(100, 300, 100, 100);
		 g.fillOval(110, 280, 80, 80);
		 g.fillOval(90, 310, 100, 80);
		 g.fillOval(110, 310, 100, 80);
		 g.fillOval(800, 200, 80, 100);
		 g.fillOval(810, 180, 60, 70);
		 g.fillOval(790, 210, 80, 80);
		 g.fillOval(810, 210, 100, 80);
		 
		//Bird
		 g.setColor(Color.black);
		 g.drawArc(10, 30, 200, 90, 65, 25);
		 g.drawArc(50, 35, 200, 90, 65, 25);

		 //niño
		 g.setColor(Color.black);
		 g.drawOval(665, 290, 10, 10);//cabeza
		 g.drawLine(670, 300, 670, 330);//tronco
		 g.drawLine(665, 310, 675, 310);//brazos
		 g.drawLine(670, 330, 675, 340);
		 g.drawLine(670, 330, 665, 340);
		 //niña
		 g.drawOval(695, 290, 10, 10);//cabeza
		 g.drawLine(700, 300, 700, 320);
		 g.drawLine(695, 310, 705, 310);//brazos
		 g.drawLine(700, 320, 705, 330);
		 g.drawLine(700, 320, 695, 330);
		 g.drawLine(695, 330, 705, 330);
		 g.drawLine(698, 330, 698, 340);
		 g.drawLine(702, 330, 702, 340);
	}
}
