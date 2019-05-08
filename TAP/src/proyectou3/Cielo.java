package proyectou3;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import dibujosprimavera2.*;

import javax.swing.JPanel;

public class Cielo extends Applet implements Runnable
{
	
	
	Thread hilo;
	int x = 0;
	int y = 0;
	int x_carro = 100;
	boolean move_arbol;
	Carro v = new Carro();
	Casa c = new Casa();
	
	public void start()
	{
		resize(1250,700);
		Thread th = new Thread(this);
		th.start();
		move_arbol=false;
	}
	
    public void paint (Graphics g)
    {

       super.paint(g);     
	
	 //Cielo (la parte superior) 
	    g.setColor(new Color(30, 144, 255));//cambia el color del cielo 
	    g.fillRect(1,1, 1300, 2000);// fondo cielo
	    
	    // solecito
	    g.setColor(new Color(255,255,0));
	    g.fillOval(300+x, 20, 200, 200);
	    g.drawLine(350+x,215, 350+x, 10);
	    g.drawLine(295+x,155, 405+x, 155);
	    //Suelo
	   g.setColor(new Color(139,69,19));
	   g.fillRect(1,600, 1300, 500);
	
	   
	   
	   //maticas
	    g.setColor(new Color(34,139,34 ));//con new color se pueden crear distintas combinaciones de colores
	    g.fillOval(200, 350, 150, 100);//dibujar ovalo, los parámetros son: x,y, ancho, largo
	    g.fillRect(200,400, 150, 200);
	    g.setColor(new Color(107,142,35));
	    g.fillOval(120, 400, 100, 100);
	    g.fillRect(120,450, 98, 150);//Dibujar rectángulo, los parámetros con los mismos del ovalo
	
	
	   //nubes
	    g.setColor(new Color(255,255,240));
	    g.fillOval(300+x,9, 200, 100);
	    g.fillOval(310+x, 60, 180, 80);
	    g.fillOval(290+x, 30, 200, 80);
	    g.fillOval(310+x, 15, 200, 80);
	    g.fillOval(900+x, 200, 180, 100);
	    g.fillOval(910+x, 180, 160, 70);
	    g.fillOval(890+x, 210, 180, 80);
	    g.fillOval(910+x, 210, 100, 80);
	   // mas nubes
	    g.fillOval(400+x,9, 500, 100);
	    g.fillOval(410+x, 60, 280, 80);
	    g.fillOval(390+x, 30, 300, 80);
	    g.fillOval(310+x, 15, 300, 80);
	    g.fillOval(1000+x, 200, 280, 100);
	    g.fillOval(1010+x, 180, 260, 70);
	    g.fillOval(990+x, 210, 280, 80);
	    g.fillOval(1010+x, 210, 300, 80);
	
	  //SOL
	    g.setColor(new Color(255,255,0));
	    g.fillOval(200+x, 10, 100, 100);
	    g.drawLine(250+x,115, 250, 1);
	    g.drawLine(195+x,55, 305, 55);
	    
	    
	    // ARBOLES
	    g.setColor(new Color(100,50,0));
	    g.fillRect(830,390, 30, 270);
	    g.fillRect(135,480, 30, 290);
	    if(move_arbol)
	    {
		    g.setColor(new Color(0,200,0));
		    g.fillOval(110, 400, 100, 300);
		    g.fillOval(120, 580, 80, 280);
		    g.fillOval(100, 410, 100, 280);
		    g.fillOval(120, 510, 100, 280);
		    g.fillOval(810, 300, 80, 300);
		    g.fillOval(820, 280, 60, 270);
		    g.fillOval(800, 310, 80, 280);
		    g.fillOval(820, 310, 100, 280);
	    } else {
	    	g.setColor(new Color(0,200,0));
	 	    g.fillOval(100, 400, 100, 300);
	 	    g.fillOval(110, 580, 80, 280);
	 	    g.fillOval(90, 410, 100, 280);
	 	    g.fillOval(110, 510, 100, 280);
	 	    g.fillOval(800, 300, 80, 300);
	 	    g.fillOval(810, 280, 60, 270);
	 	    g.fillOval(790, 310, 80, 280);
	 	    g.fillOval(810, 310, 100, 280);
	    }
	    
	    c.paint(g);
	    
	    v.paint(g,x_carro);
        x_carro = x_carro+15;
	  
	    //Pajaro
	    g.setColor(Color.black);
	    g.drawArc(10, 30, 200, 90, 65, 25);
	    g.drawArc(50, 35, 200, 90, 65, 25);
    }
  
    public void run()
    {
    	while(true)
    	{
    		try 
    		{
    			x+=2;
    			x_carro+=20;
    			repaint();
    	         Thread.sleep(800);
    	         move_arbol = !(move_arbol);
    	        x_carro+=20;
     			repaint();
     			Thread.sleep(200);
    		}catch (InterruptedException ex) {
    			System.err.println("Error al intentar detener el hilo");
    		}
    	}
    }
    
}
