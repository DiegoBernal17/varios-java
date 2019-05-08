package aplicacion;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import practicasu1.*;

public class AplicacionLista extends Applet implements ItemListener
{
	private int x=100, y=100, seleccion, eleccion;

	List lista;
	Practica1 minion1 = new Practica1();
	Practica2 minion2 = new Practica2();
	Practica3 minion3 = new Practica3();
	Practica4 minion4 = new Practica4();
	Practica5 minion5 = new Practica5();

	public void init()
	{
		List lista = new List(5);
		lista.add("Minion 1");
		lista.add("Minion 2");
		lista.add("Minion 3");
		lista.add("Minion 4");
		lista.add("Minion 5");
		
		add(lista);
		lista.addItemListener(this);
	}
	
	public void paint(Graphics g)
	{
		switch(eleccion)
		{
		case 0:
			minion1.paint(g);
			break;
		case 1:
			minion2.paint(g);
			break;
		case 2: 
			minion3.paint(g);
			break;
		case 3:
			minion4.paint(g);
			break;
		case 4:
			minion5.paint(g);
			break;
		}
	}

	public void itemStateChanged(ItemEvent e) 
	{
		eleccion = Integer.parseInt(e.getItem()+"");
		repaint();
	}
}