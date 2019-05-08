
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.Applet;

//esta practica trata de poder hacer una abeja con los comandos de oval arc y linea
public class AbejaEventoMouse extends Applet implements MouseListener {
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
			
			//antenas
        g.fillOval(105,205,15,15);
        g.fillOval(165,205,15,15);
        g.drawLine(110,205,128,265);
        g.drawLine(175,205,160,265);
        //cara
        g.drawOval(100,280,80,80);
        g.drawArc(110,300,60,50,180,180);
        //ojos
        g.fillOval(128,310,5,8);
        g.fillOval(148,310,5,8);
        //cuerpo
        g.drawOval(185,262,140,110);
        
        //alas
        g.drawArc(250,130,110,150,280,90);
        g.drawArc(160,100,110,185,36,220);
        g.drawArc(250,100,110,185,0,230);
        
        //agijon
        g.drawLine(323,300,345,315);
        g.drawLine(323,330,345,315);
        
        //rallas
        setBackground(Color.yellow);
        g.drawArc(80,250,140,130,320,74);
        g.drawArc(110,251,140,130,310,100);
        g.drawArc(140,250,140,130,305,109);
        g.drawArc(170,251,140,130,310,100);

		

	}
	@Override
	public void mouseClicked(MouseEvent event) {
		if(event.getSource()==b1)
			seleccion =1;
		if(event.getSource()==b2)
			seleccion =2;
		if(event.getSource()==b3)
			seleccion =3;
			
		
			

		
	
		
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