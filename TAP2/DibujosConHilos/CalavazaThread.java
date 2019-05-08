package DibujosConHilos;

import java.awt.*;
import java.awt.geom.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics2D;

public class CalavazaThread extends Canvas implements Runnable
{
         int delay=15;  // 
 
     double grados=0;
     double r = 0; // en radianes
 
     public void run()
     { 
        while (true)
        {
            r= Math.toRadians(grados);// de grados a radianes
            repaint();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                break;
            }
            grados++; 
        }
   }
    public void paint (Graphics g)
   {
       AffineTransform en = new AffineTransform();
       en.rotate(r, 600, 140); // angulo y centro de rotacion
      ((Graphics2D) g).setTransform(en);
      
       g.setColor(Color.black);
       g.fillOval(105,95,275,320);
       g.fillOval(185,95,275,320);
       g.fillOval(265,95,275,320);
       
       g.setColor(Color.orange);
       g.fillOval(115,105,255,300);
       g.fillOval(195,105,255,300);
       g.fillOval(275,105,255,300);
       //ojos
       int valorX[]={250,200,300};
        int valorY[]={150,200,200};
        Polygon triangulo = new Polygon (valorX,valorY,3);
        g.setColor(Color.yellow);
        g.fillPolygon(triangulo);
         g.setColor(Color.black);
        g.drawPolygon(triangulo);
       
        int valorX2[]={400,350,450};
        int valorY2[]={150,200,200};
        Polygon triangulo2 = new Polygon (valorX2,valorY2,3);
        g.setColor(Color.yellow);
        g.fillPolygon(triangulo2);
        g.setColor(Color.black);
        g.drawPolygon(triangulo2);
        
         int valorX3[]={325,295,355};
        int valorY3[]={240,280,280};
        Polygon triangulo3 = new Polygon (valorX3,valorY3,3);
        g.setColor(Color.yellow);
        g.fillPolygon(triangulo3);
        g.setColor(Color.black);
        g.drawPolygon(triangulo3);
        
        //BOCA 
        int valorX4[]={325,295,355};
        int valorY4[]={320,360,360};
        Polygon triangulo4 = new Polygon (valorX4,valorY4,3);
        g.setColor(Color.yellow);
        g.fillPolygon(triangulo4);
         g.setColor(Color.red);
        g.drawPolygon(triangulo4);
        
        int valorX5[]={355,325,380};
        int valorY5[]={360,320,320};
        Polygon triangulo5 = new Polygon (valorX5,valorY5,3);
        g.setColor(Color.red);
        g.fillPolygon(triangulo5);
         g.setColor(Color.black);
        g.drawPolygon(triangulo5);
        
         int valorX5A[]={295,265,325};
        int valorY5A[]={360,320,320};
        Polygon triangulo5A = new Polygon (valorX5A,valorY5,3);
        g.setColor(Color.red);
        g.fillPolygon(triangulo5A);
         g.setColor(Color.black);
        g.drawPolygon(triangulo5A);
        
        
        int valorX6[]={295,265,205};
        int valorY6[]={360,320,360};
        Polygon triangulo6 = new Polygon (valorX6,valorY6,3);
        g.setColor(Color.yellow);
        g.fillPolygon(triangulo6);
         g.setColor(Color.black);
        g.drawPolygon(triangulo6);
        
        
        int valorX7[]={380,355,445};
        int valorY7[]={320,360,360};
        Polygon triangulo7 = new Polygon (valorX7,valorY7,3);
        g.setColor(Color.yellow);
        g.fillPolygon(triangulo7);
         g.setColor(Color.black);
        g.drawPolygon(triangulo7);
        
        //RAMA
        int valorXR[]={308,335,365};
        int valorYR[]={125,5,20};
        Polygon trianguloR = new Polygon (valorXR,valorYR,3);
        g.setColor(Color.GREEN);
        g.fillPolygon(trianguloR);
         g.setColor(Color.black);
        g.drawPolygon(trianguloR);
         int valorXR2[]={308,365,385};
        int valorYR2[]={125,20,45};
        Polygon trianguloR2 = new Polygon (valorXR2,valorYR2,3);
        g.setColor(Color.GREEN);
        g.fillPolygon(trianguloR2);
         g.setColor(Color.black);
        g.drawPolygon(trianguloR2);
    }
        
   
    }
