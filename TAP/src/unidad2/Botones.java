package unidad2;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Botones extends Applet implements ActionListener{

	private Button b1, b2, b3;
	private int seleccion = 0;
	
	public void init()
	{
		b1 = new Button("Cuadro Rojo");
		add(b1);
		b1.addActionListener(this);
		b2 = new Button("Cuadro negro");
		add(b2);
		b2.addActionListener(this);
		b3 = new Button("Cuadro azul");
		add(b3);
		b3.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		if(seleccion == 1)
			g.setColor(Color.red);
		
		if(seleccion == 2)
			g.setColor(Color.black);
		
		if(seleccion == 3)
			g.setColor(Color.blue);
		
		g.fillRect(40, 80, 60, 100);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == b1)
			seleccion = 1;
		if(event.getSource() == b2)
			seleccion = 2;
		if(event.getSource() == b3)
			seleccion = 3;
		repaint();
	}
}
