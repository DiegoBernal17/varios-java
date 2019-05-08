package practicasu3;

import java.awt.*;
import java.awt.event.*;

public class Practica5 extends Frame {
	Button inicio;
	Control c = new Control();

	public Practica5() 
	{
		 super("Ejemplo de Hilos");
		 setSize(420,420);
		 setLayout(new FlowLayout());
		 inicio = new Button("Iniciar");
		 add(inicio);
		 setBackground(Color.BLACK);
		 c.setLocation(100,50);
		 c.setVisible(true);
		 setLocation(500,50);
		 setVisible(true);
		
		 addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				 System.exit(0);
			 }
		 });
		 inicio.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 Graphics g = getGraphics();
				 Balon b = new Balon(g,c);
				 b.start();

			 }
		 });
	}

	public static void main(String[] args) 
	{
		Practica5 p = new Practica5();
	}

	private class Balon extends Thread {
		int x, y, diametro;
		boolean direccionX=true;
		boolean direccionY=true;
		Graphics g;
		Control c;
	
		public Balon(Graphics g, Control c)
		{
			x=(int)(Math.random()*300+1);
			y=(int)(Math.random()*300+1);
			diametro=10;
			this.g = g;
			this.c = c;
		}
	
		public void run()
		{
			int incX,incY;
			while(!c.salir)
			{
				g.setColor(Color.BLACK);
				g.fillOval(x,y,diametro,diametro);
				if (direccionX) incX = c.IncX;
				else incX = -c.IncX;
				if(x + incX <= 0 || x + incX >= 400)
				direccionX = !direccionX;
				if (direccionY) incY = c.IncY;
				else incY = -c.IncY;
				if(y + incY <= 30 || y + incY >= 400)
				direccionY = !direccionY;
				x+=incX;
				y+=incY;
				g.setColor(Color.WHITE);
				g.fillOval(x,y,diametro,diametro);
				
				try {
					sleep(50);
				} catch(InterruptedException e){
					 System.err.println("Error de excepcion");
				}
			}
		}
	}
} 