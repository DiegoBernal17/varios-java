import java.applet.Applet;
import java.awt.*;


/**
 * Clase para implementar hilos en los dibujos
* @version 3/nov/2015
 */
public class DibujoCasita extends Applet implements Runnable
{
    public int x=100;
    Thread hilo;
    Casita v = new Casita();
    public void init(){
        hilo = new Thread(this);
        hilo.start();
        resize(800,700);//redimencionar tamaÃ±o applet
    }
    
    public void paint(Graphics g){
        v.paint(g,x);
        x = x+15;
    }
    
    public void run(){//ejecutar los eventos y transformaciones hilos
        while(true){
            repaint();
            try{
                hilo.sleep(1000);//hillos controlado con tiempo
            }catch(InterruptedException e){}
            
        }//fin de while
    }//fin de run
}


