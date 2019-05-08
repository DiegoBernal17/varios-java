package DibujosConHilos;

import java.applet.Applet;
import java.awt.*;

public class EdifHilos extends Applet implements Runnable
{
    public int x=5;
    Thread hilo;
    Edificios ed = new Edificios();
    
    public void init(){
        hilo = new Thread(this);
        hilo.start();
        resize(800,700);//redimencionar tamanio applet
    }

    public void paint(Graphics g){
        ed.paint(g,x);
        x = x+5;
    }
    
     public void run(){//ejecutar los eventos y transformaciones hilos
        while(true){
            repaint();
            try{
                hilo.sleep(500);//hillos controlado con tiempo
            }catch(InterruptedException e){}
            
        }//fin de while
    }//fin de run
}
