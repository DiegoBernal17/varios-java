package unidad2;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import minions.*;

public class aplicacion extends Applet implements ActionListener, MouseListener
{
	private Button 
			b1 = new Button("Minion niña"),
			b2 = new Button("Minion vampiro"),
			b3 = new Button("Minion pastel"),
			b4 = new Button("Minion golf"),
			b5 = new Button("Minion Hawaii");
	private Girl nina;
	private Vampire vampiro;
	private Cake pastel;
	private Golf golf;
	private Hawaii hawaii;
	private int seleccion=0, posi_x, posi_y;
	
	public void init()
	{	
		this.setBounds(40, 40, 500, 500);
		this.setSize(500,500);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		this.addMouseListener(this);
	}

	public void update(Graphics g)
	{
		switch(seleccion)
		{
		case 1:
			nina = new Girl(posi_x, posi_y);
			nina.paint(g);
			break;
		case 2:
			vampiro = new Vampire(posi_x, posi_y);
			vampiro.paint(g);
			break;
		case 3: 
			pastel = new Cake(posi_x,posi_y);
			pastel.paint(g);
			break;
		case 4:
			golf = new Golf(posi_x, posi_y);
			golf.paint(g);
			break;
		case 5:
			hawaii = new Hawaii(posi_x, posi_y);
			hawaii.paint(g);
			break;
		default:
			g.setColor(Color.RED);
			g.drawString("Selecciona un minion", 200, 50);
		}
	}
	
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
	}

	public void mouseClicked(MouseEvent e) {
		posi_x = e.getX();
		posi_y = e.getY();
		
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
