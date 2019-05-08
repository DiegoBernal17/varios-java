import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.Applet;

public class PulpoEventoMouse extends Applet implements MouseListener 
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
			
        //Cabeza
        g.drawArc(220,95,110,138,-60,300);
        
        //Ojos
        g.drawOval(240,140,20,26);
        g.drawOval(285,140,20,26);
        //pupilas
        g.fillOval(245,150,5,11);
        g.fillOval(290,150,5,11);
        //Tentaculos
         setBackground(Color.blue);
        g.drawArc(225,215,15,260,80,300);
        
        g.drawArc(240,300,15,198,140,220);
        
        g.drawArc(255,220,15,250,140,220);
        g.drawArc(270,200,15,260,200,-40);
        g.drawArc(270,200,15,230,140,220);
        g.drawArc(285,240,15,250,140,220);
        g.drawArc(300,230,15,270,140,220);
        g.drawArc(315,200,15,300,200,-40);
        g.drawArc(315,120,15,300,200,-40);
        
   

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

