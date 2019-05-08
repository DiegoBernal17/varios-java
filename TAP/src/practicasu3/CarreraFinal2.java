package practicasu3;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarreraFinal2 extends Applet
{
	private Button inicio;
	
	public void init()
	{
		inicio = new Button("Iniciar");
		add(inicio);
		Graphics g = getGraphics();
		inicio.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 g.setColor(Color.BLACK);
				 g.fillRect(860, 60, 40, 40);
				 g.setColor(Color.WHITE);
				 g.fillRect(860, 100, 40, 40);
				 g.setColor(Color.BLACK);
				 g.fillRect(860, 140, 40, 40);
				 g.setColor(Color.WHITE);
				 g.fillRect(860, 180, 40, 40);
				 g.setColor(Color.BLACK);
				 g.fillRect(860, 220, 40, 40);
				 
				LiebreGrafica liebre = new LiebreGrafica(g);
				TortugaGrafica tortuga = new TortugaGrafica(g);
				liebre.start();
				tortuga.start();
				remove(inicio);
			 }
		});
	}
}
