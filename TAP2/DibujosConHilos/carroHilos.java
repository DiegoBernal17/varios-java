package DibujosConHilos;
import java.applet.Applet;
import java.awt.*;

public class carroHilos extends Applet implements Runnable
{
    public int x=5;
    Thread hilo;
    Carro c = new Carro();
    
    public void init(){
        hilo = new Thread(this);
        hilo.start();
        resize(800,700);//redimencionar tamanio applet
    }

    public void paint(Graphics g){
        c.paint(g,x);
        x = x+5;
    }
    
     public void run(){//ejecutar los eventos y transformaciones hilos
        while(true){
            repaint();
            try{
                hilo.sleep(100);//hillos controlado con tiempo
            }catch(InterruptedException e){}
            
        }//fin de while
    }//fin de run
}
