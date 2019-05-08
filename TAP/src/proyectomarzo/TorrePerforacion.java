package proyectomarzo;
import java.awt.*;

public class TorrePerforacion {
	
	public TorrePerforacion(Graphics g) {
		g.drawString("El hecho que tuvo lugar durante el mandato del presidente Lázaro Cárdenas del Río, implicó la toma del petróleo mexicano que hasta el momento era manejado por 17 compañías extranjeras, por parte del Estado.", 10, 50);
		//1
		g.setColor(Color.black);
		g.fillRect(527, 365	, 200, 15);
		//2
		g.fillRect(566, 335, 130, 30);
		//3C
		g.fillRect(630, 145, 10, 190);
		//4 3ro abajo a arriba
		g.fillRect(575, 280, 113, 20);
		//5 4to abajo a arriba
		g.fillRect(588, 230, 90, 20);
		//5 4to arriba a abajo
		g.fillRect(598, 180, 70, 20);
		//6 3ro arriba a abajo
		g.fillRect(609, 125, 50, 20);
		//7 2do arriba a abajo
		g.fillRect(619, 115, 30, 10);
		//8
		g.fillRect(629, 105, 10, 10);
		//recta larga izq
		g.drawLine(630, 145, 566, 335);
		//recta larga der
		g.drawLine(640, 145, 696, 335);
		//cruz1
		g.drawLine(566, 335, 630, 299);
		g.drawLine(628, 335, 576, 298);
		//cruz2
		g.drawLine(641, 335, 688, 298);
		g.drawLine(696, 335, 639, 299);
		//cruz3
		g.drawLine(583, 281, 630, 249);
		g.drawLine(629, 279, 593, 248);
		//cruz4
		g.drawLine(639, 281, 670, 249);
		g.drawLine(679, 279, 641, 249);
		//cruz5
		g.drawLine(602, 231, 630, 199);
		g.drawLine(629, 229, 609, 199);
		//cruz6
		g.drawLine(642, 231, 658, 199);
		g.drawLine(666, 229, 639, 199);
	}
}
