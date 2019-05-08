package unidad3;

import java.awt.*;
import java.applet.Applet;

public class SegunderoHilo extends Applet implements Runnable {
	// Variables
	Thread hilo;
	int segundos;
	
	public void init() {
		// Inicializar hilo
		hilo = new Thread(this);
		// Comenzar ejecuci�n del hilo
		hilo.start();
	}
	
	// Funci�n run coraz�n del hilo
	public void run() {
		while(true){
			segundos++;
			repaint();
			try {
				hilo.sleep(1000);
			}
			catch(InterruptedException e) { }
		}
	}
	
	// Exhibir la variable segundo en la pantalla
	public void paint(Graphics g) {
		g.drawString("Segundos: "+segundos, 20, 20);
	}
}
