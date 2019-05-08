import java.awt.*;
import java.applet.Applet;

public class segunderoHilo extends Applet implements Runnable{
    
    Thread hilo;
    int segundos, minutos,horas;
    
    public void init()
    {
        //iniciar hilo
        hilo= new Thread(this);
        //comenzar ejecucion del hilo
        hilo.start();
    }
    
    //funcion run, corazon del hilo
    
    public void run()
    {
        while(true)
        {
            segundos++;
            repaint();
            
            try
            {
                hilo.sleep(1000); 
            }
            catch (InterruptedException e) {}
        }
    }
    
    public void paint(Graphics g)
    {
        g.drawString("segundos:" + segundos,20,20);
    }
}