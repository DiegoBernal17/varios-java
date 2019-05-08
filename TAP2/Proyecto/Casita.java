import java.awt.*;
//import java.applet.Applet;
/**
 * Se hará una Casita con java 2d.
* @versión (10-sep-15)
 */
public class Casita 
//public class Casita extends Applet
{
    // instance variables - replace the example below with your own
    public void paint(Graphics g,int x){
        
        //se dibujan las 4 lineas
        //l1
        g.drawLine(100+x,200,150+x,100);
        //l2
        g.drawLine(200+x,200,150+x,100);
        //l3
        g.drawLine(150+x,100,400+x,100);
        //l4
        g.drawLine(400+x,100,400+x,200);
        
        //se dibujan las figuras
        //c1
        g.setColor(Color.orange);
        g.fillRect(100+x,200,100,200);
        g.setColor(Color.black);
        g.drawRect(100+x,200,100,200);
        
        //c3
        g.setColor(Color.orange);
        g.fillRect(200+x,200,200,200);
        g.setColor(Color.black);
        g.drawRect(200+x,200,200,200);
        
        //o1
        g.setColor(Color.blue);
        g.fillOval(250+x,250,100,100);
        g.setColor(Color.black);
        g.drawOval(250+x,250,100,100);
        
        //c2
        g.setColor(Color.blue);
        g.fillRect(120+x,300,60,100);
        g.setColor(Color.black);
        g.drawRect(120+x,300,60,100);
    }
}
