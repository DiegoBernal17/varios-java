package practicasu3;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Cronometro extends Applet implements Runnable, ActionListener {
	Thread hilo;
	int segundos=0, minutos=0, horas=0;
	Button iniciar, pausar, continuar, detener;
	
	public void init() {
		this.setSize(260, 200);
		iniciar = new Button("Iniciar");
		pausar = new Button("Pausar");
		continuar = new Button("Continuar");
		detener = new Button("Detener");
		add(iniciar);
		add(pausar);
		add(continuar);
		add(detener);
		iniciar.addActionListener(this);
		pausar.addActionListener(this);
		detener.addActionListener(this);
		continuar.addActionListener(this);
	}
	
	public void run() {
		while(true) {
			try {
				hilo.sleep(1000);
			}
			catch(InterruptedException e) { }
			
			segundos++;
			if(minutos == 59 && segundos == 60) {
				horas++;
				minutos=0;
			}
			if(segundos == 60){
				minutos++;
				segundos=0;
			}
			repaint();
		}
	}
	
	
	
	public void paint(Graphics g) {
		g.drawString("Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos, 40, 60);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == iniciar) {
			hilo = new Thread(this);
			remove(iniciar);
			add(detener);
			repaint();
			hilo.start();
		}
		else if(e.getSource() == pausar) {
			hilo.suspend();
			remove(pausar);
			add(continuar);
		}
		else if(e.getSource() == continuar)
		{
			hilo.resume();
			//hilo.start();
			remove(continuar);
			add(pausar);
		}
		else if(e.getSource() == detener)
		{
			hilo.stop();
			remove(detener);
			add(iniciar);
			segundos=0;
			minutos=0;
			horas=0;
		}
	}
}
