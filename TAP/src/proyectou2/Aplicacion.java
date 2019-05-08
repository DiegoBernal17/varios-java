package proyectou2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import dibujosprimavera.*;

public class Aplicacion extends Applet implements ActionListener, MouseListener, ItemListener {

	private Button 
			b1 = new Button("Césped"),
			b2 = new Button("Arbol"),
			b3 = new Button("Flor"),
			b4 = new Button("Nube"),
			b5 = new Button("Montaña"),
			b6 = new Button("Catarina"),
			b7 = new Button("Borrar");
	private List listaColores = new List(6);
	private Cesped cesped;
	private Arbol arbol;
	private Flor flor; 
	private Nube nube;
	private Montana montana;
	private Catarina catarina;
	private int seleccion=0, posi_x, posi_y;
	private Color color;
	//private int index;
	//private Object ultimo;
	
	public void init()
	{
		this.resize(500,500);
		add(b1);
		add(b2);
		//add(b3);//Flor
		add(b4);
		add(b5);
		add(b6);//Borrar
		//add(b7);
		b1.addActionListener(this);
		b2.addActionListener(this);
		//b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		//b7.addActionListener(this);
		listaColores.add("Rojo");
		listaColores.add("Verde");
		listaColores.add("Naranja");
		listaColores.add("Azul");
		listaColores.add("Margenta");
		listaColores.add("Gris");
		add(listaColores);
		
		listaColores.addItemListener(this);
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		 Paisaje p = new Paisaje();
		 p.paint(g);
	}
	
	public void update(Graphics g)
	{
		switch(seleccion)
		{
		case 1:
			cesped = new Cesped(posi_x, posi_y, color);
			cesped.paint(g);
			//ultimo = cesped;
			break;
		case 2:
			arbol = new Arbol(posi_x, posi_y, color);
			arbol.paint(g);
			//ultimo = arbol;
			break;
		case 3: 
			flor = new Flor(posi_x,posi_y, color);
			flor.paint(g);
			//ultimo = flor;
			break;
		case 4:
			nube = new Nube(posi_x, posi_y, color);
			nube.paint(g);
			//ultimo = nube;
			break;
		case 5:
			montana = new Montana(posi_x, posi_y, color);
			montana.paint(g);
			//ultimo = montana;
			break;
		case 6:
			catarina = new Catarina(posi_x, posi_y, color);
			catarina.paint(g);
			//ultimo = catarina;
		default:
			g.setColor(Color.RED);
			g.drawString("Selecciona un dibujo", 200, 50);
		}
	}
	
	// Clickea boton. Seleccionar dibujo
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			seleccion=1;
		}
		else if(e.getSource() == b2)
		{
			seleccion=2;
		}
		else if(e.getSource() == b3)
		{
			seleccion=3;
		}
		else if(e.getSource() == b4)
		{
			seleccion=4;
		}
		else if(e.getSource() == b5)
		{
			seleccion=5;
		}
		else if(e.getSource() == b6)
		{
			seleccion=6;
		}
	}
	
	// Clickea pantalla. Agregar dibujo seleccionado
	public void mouseClicked(MouseEvent e) 
	{
		posi_x = e.getX();
		posi_y = e.getY();
		
		repaint();
	}
	
	// Clickea color de la lista. Seleccionar color
	public void itemStateChanged(ItemEvent e) 
	{
		if(listaColores.getSelectedIndex() == 0)
			color = Color.RED;
		else if(listaColores.getSelectedIndex() == 1)
			color = Color.GREEN;
		else if(listaColores.getSelectedIndex() == 2)
			color = Color.ORANGE;
		else if(listaColores.getSelectedIndex() == 3)
			color = Color.BLUE;
		else if(listaColores.getSelectedIndex() == 4)
			color = Color.MAGENTA;
		else if(listaColores.getSelectedIndex() == 5)
			color = Color.GRAY;
		
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
