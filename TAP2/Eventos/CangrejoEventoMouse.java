import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.Applet;

/**
 * Write a description of class vv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//esta practica trata de poder hacer una abeja con los comandos de oval arc y linea
public class CangrejoEventoMouse extends Applet implements MouseListener {
	private Button b1, b2, b3;
	private int seleccion = 0;
	public void init()
	{
		b1= new Button("Rojo");
		add(b1);
		b1.addMouseListener((MouseListener) this);
		b2= new Button("negro");
		add(b2);
		b2.addMouseListener(this);
		b3 = new Button("Azul");
		add(b3);
		b3.addMouseListener(this);
	}
	public void paint(Graphics g){
		g.setColor(Color.orange); 
		if (seleccion==1)
			g.setColor(Color.red);
		if (seleccion==2)
			g.setColor(Color.black);
		if (seleccion==3)
			g.setColor(Color.blue);
		 //Cuerpo
     
     
       g.drawOval(120,150,280,240);
       
       //OJO1
       g.setColor(Color.black);
       g.drawLine(195,145,200,160);
       g.drawLine(205,145,210,157);
       g.drawOval(180,100,35,45);
       //OJO2
       
       g.setColor(Color.black);
       
       g.drawLine(290,140,287,150);
       g.drawLine(300,140,295,155);
       g.drawOval(280,95,35,45);
       //Relleno de ojos
       g.setColor(Color.black);
       g.fillOval(190,100,24,35);
       g.fillOval(290,95,24,35);
       //SONRISA
       g.drawArc(200,250,120,70,180,180);
       //TenazaIzquierda
       g.drawArc(95,120,100,124,140,105);
       g.drawArc(120,120,100,124,140,80);
       g.drawOval(98,88,43,56);
       g.drawLine(110,90,120,118);
       g.drawLine(125,88,120,118);
       //TenazaDerecha
       g.drawArc(334,91,120,145,270,110);
       g.drawArc(265,100,170,120,295,84);
       g.drawOval(416,88,43,56);
       g.drawLine(428,90,438,118);
       g.drawLine(443,90,438,118);
       //Patitas Izquierdas
       g.drawArc(57,270,122,123,90,85);
       g.drawArc(52,295,144,105,90,65);
       g.drawArc(67,302,120,124,90,90);
       g.drawArc(62,327,164,110,94,65);
       g.drawArc(87,330,137,140,103,65);
       g.drawArc(86,355,191,87,103,70);
       //Patitas Derechas
       g.drawArc(336,270,129,120,90,-85);
       g.drawArc(327,295,144,105,90,-65);
       g.drawArc(329,302,129,115,90,-85);
       g.drawArc(298,327,171,100,90,-60);
       g.drawArc(310,330,150,168,95,-70);
       g.drawArc(274,353,187,82,95,-75);
       
       
       

	}
	@Override
	public void mouseClicked(MouseEvent event) {
		if(event.getSource()==b1)
			seleccion =1;
		if(event.getSource()==b2)
			seleccion =2;
		if(event.getSource()==b3)
			seleccion =3;
		
		repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent event) {
		if(event.getSource()==b1)
			seleccion =1;
		if(event.getSource()==b2)
			seleccion =2;
		if(event.getSource()==b3)
			seleccion =3;
		
		repaint();
	}
	@Override
	public void mouseExited(MouseEvent event) {
		if(event.getSource()==b1)
			seleccion =1;
		if(event.getSource()==b2)
			seleccion =2;
		if(event.getSource()==b3)
			seleccion =3;
		
		repaint();
		
	}
	@Override
	public void mousePressed(MouseEvent event) {
		if(event.getSource()==b1)
			seleccion =1;
		if(event.getSource()==b2)
			seleccion =2;
		if(event.getSource()==b3)
			seleccion =3;
		
		repaint();
		
	}
	@Override
	public void mouseReleased(MouseEvent event) {
		if(event.getSource()==b1)
			seleccion =1;
		if(event.getSource()==b2)
			seleccion =2;
		if(event.getSource()==b3)
			seleccion =3;
		
		repaint();
		
	}

}

