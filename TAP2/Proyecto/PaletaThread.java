package Proyecto;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
 
// Un dibujo en un canvas, es posible "animarlo" convirtiendolo en un Thread
 
public class PaletaThread extends Canvas implements Runnable
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
 
    public void paint(Graphics g)
    {
         AffineTransform en = new AffineTransform();
         en.rotate(r, 300, 300); //se asigna el angulo y centro de rotacion
        ((Graphics2D) g).setTransform(en);
 
         //se dibuja
         g.setColor(Color.red);
       g.fillOval(150,150,175,175);
       g.setColor(Color.white);
       g.drawOval(150,150,175,175);
       
       g.setColor(Color.orange);
       g.fillOval(163,163,150,150);
       g.setColor(Color.white);
       g.drawOval(163,163,150,150);

       g.setColor(Color.blue);
       g.fillOval(176,176,125,125);
       g.setColor(Color.white);
       g.drawOval(176,176,125,125);
       
       g.setColor(Color.green);
       g.fillOval(189,189,100,100);
       g.setColor(Color.white);
       g.drawOval(189,189,100,100);
       
       g.setColor(Color.yellow);
       g.fillOval(202,202,75,75);
       g.setColor(Color.white);
       g.drawOval(202,202,75,75);
       
        g.setColor(Color.red);
       g.fillOval(215,215,50,50);
       g.setColor(Color.white);
      g.drawOval(215,215,50,50);
       
       g.setColor(Color.orange);
       g.fillOval(228,228,25,25);
       g.setColor(Color.white);
       g.drawOval(228,228,25,25);
       
           g.setColor(Color.black);
       g.drawRect (230, 323, 20, 150);
    }
 
 
}