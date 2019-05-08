package proyectomarzo;
import java.awt.*;

public class MontoBienes {

	public MontoBienes(Graphics g) {
		g.drawString("El hecho celebrado por el pueblo mexicano, tuvo como consecuencia el quebrantamiento de las relaciones diplomáticas de los Países Bajos, el Reino Unido y Estados Unidos con México, que decretaron un embargo comercial", 10, 100);
		g.drawString("y retiraron a todo su personal. Miles de personas se juntaron en todo el país para apoyar la causa incluso organizaron colectas para cubrir la indemnización que el gobierno debía pagar a las empresas extranjeras.", 10, 110);
		      
		//Billetes
		      g.setColor(Color.green);
		      g.drawLine(1120,520,1070,560);
		      g.drawLine(1120,520,1210,570);
		      g.drawLine(1210,570,1160,620);
		      g.drawLine(1160,620,1070,560);
		      g.drawLine(1075,565,1070,575);
		      g.drawLine(1070,575,1160,640);
		      g.drawLine(1160,640,1210,590);
		      g.drawLine(1210,590,1200,580);
		      
		      
		      //Monedas
		      g.setColor (Color.yellow);
		      g.fillOval (1260,570,15,30);
		      g.drawOval(1240,550,30,15);
		      g.drawOval(1260,570,15,30);
		      g.drawLine(1240,560,1240,570);
		      g.drawLine(1240,570,1270,570);
		      g.drawLine(1270,570,1270,560);
		      g.drawLine(1240,560,1240,600);
		      g.drawLine(1240,600,1270,600);
		      g.drawLine(1270,600,1270,560);
		      g.drawLine(1240,580,1270,580);
		      g.drawLine(1240,590,1270,590);
		      g.drawLine(1240,600,1270,600);
		    
		      
		      //Gallina
		      g.setColor(Color.black);
		      g.drawRect(900,500,130,80);
		      g.drawRect(900,450,50,50);
		      g.drawOval(910,460,5,5);
		      g.drawOval(920,460,5,5);
		      g.fillOval(910,460,5,5);
		      g.fillOval(920,460,5,5);
		      g.drawRect(920,580,10,30);
		      g.drawRect(950,580,10,30);
		      g.setColor(Color.yellow);
		      g.drawLine(915,470,920,470);
		      g.drawLine(915,470,917,475);
		      g.drawLine(920,470,917,475);
		      g.setColor (Color.red);
		      g.drawLine(900,450,900,425);
		      g.drawLine(900,425,916,425);
		      g.drawLine(916,425,916,435);
		      g.drawLine(916,435,932,435);
		      g.drawLine(932,435,932,440);
		      g.drawLine(932,440,950,440);
		      g.drawLine(950,440,950,450);
	}
}
