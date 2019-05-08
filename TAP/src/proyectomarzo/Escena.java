package proyectomarzo;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Escena extends Applet implements ActionListener
{
	private int escena;
	private Button last,next;
	
	public void mexico(Graphics g)
	{
		new TerritorioMexico(g);
		new TorrePerforacion(g);
		new MultitudHuelga(g);
		new EmpresasPetroleras(g);
		new MediosComunicacion(g);
		new MontoBienes(g);
	}
	
	public void init()
	{
		setSize(1300, 650);
		last = new Button("Regresar");
		last.addActionListener(this);
		add(last);
		next = new Button("Avanzar");
		next.addActionListener(this);
		add(next);
	}
	
	public void paint(Graphics g)
	{	
		switch(escena)
		{
			case 0:
				setBackground(Color.decode("#12A01F"));//Verde
				new TerritorioMexico(g);
				break;
			case 1:
				setBackground(Color.WHITE);
				new TorrePerforacion(g);
				break;
			case 2:
				setBackground(Color.decode("#C91A1F"));//Rojo
				new MultitudHuelga(g);
				break;
			case 3:
				setBackground(Color.decode("#12A01F"));//Verde
				this.addMouseListener(new EmpresasPetroleras(g));
				break;
			case 4:
				setBackground(Color.WHITE);
				new MediosComunicacion(g);
				break;
			case 5:
				setBackground(Color.decode("#C91A1F"));//Rojo
				new MontoBienes(g);
				break;
			default:
				setBackground(Color.LIGHT_GRAY);
				this.mexico(g);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == next) {	
			if(escena<=6)
				escena++;
		}
		else {
			if(escena>0)
				escena--;
		}
		repaint();
	}
}
