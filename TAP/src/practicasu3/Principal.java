package practicasu3;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Applet
{
	public void paint(Graphics g)
	{
		
		//super("Ejemplo de Hilos");
		setSize(600, 500);
		//setLayout(new FlowLayout());
		setLocation(200,200);
		//setVisible(true);
		
		Practica7 pp7 = new Practica7(0,0);
		pp7.paint(g);
		pp7.setSize(100, 100);
		Thread p7 = new Thread(pp7);
		p7.start();
		
		/*
		addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				 System.exit(0);
			 }
		 });*/
	}
	
	/*public static void main(String args[])
	{
		new Principal();
	}*/
}
