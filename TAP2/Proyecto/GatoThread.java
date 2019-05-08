import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
 
// Un dibujo en un canvas, es posible "animarlo" convirtiendolo en un Thread
 
public class GatoThread extends Canvas implements Runnable
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
        
        //cuerpo //
g.setColor(Color.lightGray);
g.fillOval(120,150,280,240);
// oreja derecha
g.drawLine(90,165,160,185);
g.drawLine(90,165,165,175);
g.drawLine(90,165,145,190);
// oreja Izquierda
g.drawLine(415,152,349,173);
g.drawLine(415,152,355,178);
g.drawLine(415,152,360,185);
// ojo2//
g.setColor(Color.black);
g.drawOval(285,195,50,30);
g.setColor(Color.white);
g.fillOval(295,198,28,25);
g.setColor(Color.black);
g.fillOval(305,200,9,24);
// ojo1//
g.setColor(Color.black);
g.drawOval(198,197,50,30);
g.setColor(Color.white);
g.fillOval(210,200,28,25);
g.setColor(Color.black);
g.fillOval(220,200,9,25);

//bigote derecho//
g.drawLine(235,315,145,265);
g.drawLine(235,315,145,275);
g.drawLine(235,315,145,285);
g.drawLine(235,315,145,255);
//bigote izquierdo//
g.drawLine(290,315,385,300); //linea 3//
g.drawLine(290,315,385,310);// linea 2//
g.drawLine(290,315,385,290);// linea 1
g.drawLine(290,315,385,317);




//cachete derecho
g.setColor(Color.gray);
g.fillArc(216,269,50,88,360,360);
// cachete izquierdo
g.setColor(Color.gray);
g.fillArc(265,266,50,88,360,360);

//nariz//
g.setColor(Color.black);
g.drawArc(235,167,65,118,180,180);
g.setColor(Color.pink);
g.fillOval(248,250,40,35);


//lengua//
g.setColor(Color.red);
g.fillArc(255,335,25,25,180,180);
}
}
        
        
        