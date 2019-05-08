package unidad3;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Rebotador extends Applet implements ActionListener {
	private Button iniciar;
	
	public void init()
	{
		iniciar = new Button("Iniciar");
		add(iniciar);
		iniciar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == iniciar)
		{
			Graphics g = getGraphics();
			Pelota1 pelota = new Pelota1(g);
			pelota.mostrar();
		}
	}
}

class Pelota1 {
	private Graphics g;
	private int x=7, xCambio=7;
	private int y=0, yCambio=2;
	private int diametro = 10;
	private int rectIzqX = 0, rectDerX = 100;
	private int rectSupY = 0, rectInfY = 100;
	
	public Pelota1(Graphics graficos) {
		g = graficos;
	}
	
	public void mostrar()
	{
		g.drawRect(rectIzqX, rectSupY, rectDerX - rectIzqX+10, rectInfY - rectSupY+10);
		
		for(int n=1; n<1000; n++)
		{
			g.setColor(Color.white);
			g.fillOval(x,y,diametro,diametro);
			
			if(x+xCambio <= rectIzqX)
				xCambio = -xCambio;
			if(x+xCambio >= rectDerX)
				xCambio = -xCambio;
			
			if(y+yCambio <= rectSupY)
				yCambio = -yCambio;
			if(y+yCambio >= rectInfY)
				yCambio = -yCambio;
			
			x = x + xCambio;
			y = y + yCambio;
			g.setColor(Color.red);
			g.fillOval(x, y, diametro, diametro);
			
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				System.err.println("Excepción de inactividad");
			}
		}
	}
}
