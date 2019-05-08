package proyectou3;
import java.awt.*;
import java.applet.Applet;
import javax.swing.JApplet;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
public class HiloCarro extends Applet implements Runnable

{
	public int x=100;
    Thread hilo;
    Carro v = new Carro();
    public void init ()
    {
        hilo = new Thread(this);
        hilo.start();
        resize(800,700);
    }
    
    public void paint(Graphics g)
    {
        v.paint(g,x);
        x = x+15;
    }
    
    public void run()
    {
        while(true)
        {
            repaint();
            try
            {
                hilo.sleep(1000);//hilos controlado en tiempo
            }catch(InterruptedException e){}
        }
    }
}
