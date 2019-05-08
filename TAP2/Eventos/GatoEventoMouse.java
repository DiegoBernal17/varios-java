
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.Applet;

public class GatoEventoMouse extends Applet implements MouseListener 
{
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
			
		       //cuerpo //
g.drawOval(120,150,280,240);

// oreja derecha
g.drawLine(90,165,160,185);
g.drawLine(90,165,165,175);
g.drawLine(90,165,145,190);

// oreja Izquierda
g.drawLine(415,152,349,173);
g.drawLine(415,152,355,178);
g.drawLine(415,152,360,185);
// ojo2//
g.drawOval(285,195,50,30);
g.drawOval(295,198,28,25);
g.fillOval(305,200,9,24);
// ojo1//
g.drawOval(198,197,50,30);
g.drawOval(210,200,28,25);
g.fillOval(220,200,9,25);
//bigote derecho//
g.drawLine(235,315,145,265);
g.drawLine(235,315,145,275);
g.drawLine(235,315,145,285);
g.drawLine(235,315,145,255);
//bigote izquierdo//
g.drawLine(290,315,385,300); //linea 3//
g.drawLine(290,315,385,310);// linea 2//
g.drawLine(290,315,385,290);// linea 1
g.drawLine(290,315,385,317);
//nariz//
g.drawArc(235,167,65,118,180,180);
g.fillOval(248,250,40,35);
//cachete derecho
g.drawArc(216,269,50,88,360,360);

// cachete izquierdo
g.drawArc(265,269,53,88,360,360);
//lengua//
g.setColor(Color.pink);
g.fillArc(255,335,25,25,180,180);


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

