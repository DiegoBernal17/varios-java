
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Reloj extends Applet implements Runnable, ActionListener
{
    Button i = new Button("Pausar");
    int segundos = 0;
    int minutos = 0;
    int horas = 0;
    Thread h = new Thread(this);
    boolean hiloSuspendido = false;
    Thread hilo;
    
    public void init(){
        add(i);
        i.addActionListener(this);
        h.start();
    }
    
    public synchronized void actionPerformed(ActionEvent e){
        hiloSuspendido = !hiloSuspendido;
        if(hiloSuspendido == false){
            notify();
        }
        if(hiloSuspendido){
            i.setLabel("Continuar");
        }else
            i.setLabel("Pausar");
    }
    
    public void paint(Graphics g){
        g.drawString("Segundos : " + segundos,20,50);
        g.drawString("Minutos : " + minutos,20,70);
        g.drawString("Horas : " + horas,20,90);
    }
    
    public void run()
    {
        while(true)
        {
            segundos ++;
            repaint();
        try { hilo.sleep(1000);}
        catch (InterruptedException e){}
        
        if(segundos>=59)
        {
           segundos = 0;
           minutos = minutos +1;
        }
        if(minutos >=59)
        {
            minutos = 0;
            horas = horas + 1;
        }
        
        
        }
    }
}
