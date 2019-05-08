package practicasu3;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CarreraFinal extends Frame
{	
	Button inicio;
	public CarreraFinal()
	{
		super("Ejemplo de Hilos");
		setSize(940, 280);
		setLayout(new FlowLayout());
		inicio = new Button("Iniciar");
		add(inicio);
		setLocation(260,200);
		setVisible(true);
		
		 addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				 System.exit(0);
			 }
		 });
		 
		 inicio.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 Graphics meta = getGraphics();
				 meta.setColor(Color.BLACK);
				 meta.fillRect(860, 60, 40, 40);
				 meta.setColor(Color.WHITE);
				 meta.fillRect(860, 100, 40, 40);
				 meta.setColor(Color.BLACK);
				 meta.fillRect(860, 140, 40, 40);
				 meta.setColor(Color.WHITE);
				 meta.fillRect(860, 180, 40, 40);
				 meta.setColor(Color.BLACK);
				 meta.fillRect(860, 220, 40, 40);
				 
				 Graphics g = getGraphics();
				 Graphics g2 = getGraphics();
				 LiebreGrafica liebre = new LiebreGrafica(g);
				TortugaGrafica tortuga = new TortugaGrafica(g2);
				liebre.start();
				tortuga.start();
				remove(inicio);
			 }
		 });
	}
	
	public static void main(String args[])
	{
		new CarreraFinal();
	}
}
