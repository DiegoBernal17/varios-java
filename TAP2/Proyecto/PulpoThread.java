import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
 
// Un dibujo en un canvas, es posible "animarlo" convirtiendolo en un Thread
 
public class PulpoThread extends Canvas implements Runnable
{
     int delay=15;  // para que gire rapido, ponlo mayor para que gire lento
 
     double grados=0;
     double r = 0; // en radianes
 
     public void run()
     {  // cuando inicias (start) entonces se arranca este ciclo infinito
        // pero lo puedes detener (suspend) o reiniciar (resume)
        while (true)
        {
            r= Math.toRadians(grados);// de grados a radianes
            repaint();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                break;
            }
            grados++; // de uno en uno los grados, pero lo puedes cambiar
        }
    }
     public void paint (Graphics g)
    {
         AffineTransform en = new AffineTransform();
         en.rotate(r, 300, 300); //se asigna el angulo y centro de rotacion
        ((Graphics2D) g).setTransform(en);
        
        
        
        //Cabeza
        g.drawArc(220,95,110,138,-60,300);
        //Ojos
        g.drawOval(240,140,20,26);
        g.drawOval(285,140,20,26);
        //pupilas
        g.fillOval(245,150,5,11);
        g.fillOval(290,150,5,11);
        //Tentaculos
        
        g.drawArc(225,215,15,260,80,300);
        
        g.drawArc(240,300,15,198,140,220);
        
        g.drawArc(255,220,15,250,140,220);
        g.drawArc(270,200,15,260,200,-40);
        g.drawArc(270,200,15,230,140,220);
        g.drawArc(285,240,15,250,140,220);
        g.drawArc(300,230,15,270,140,220);
        g.drawArc(315,200,15,300,200,-40);
        g.drawArc(315,120,15,300,200,-40);
        
        
    }
}