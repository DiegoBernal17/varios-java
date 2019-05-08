package Proyecto;
import java.awt.*;
import java.awt.geom.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics2D;
public class Balero extends Applet
{
    public void paint (Graphics g,int x)
   {
      
    g.setColor (Color.black);
    g.drawRoundRect (249, 159+x, 71, 91, 51, 21);   
    g.setColor (Color.lightGray);
    g.fillRoundRect (250, 160+x, 70, 90, 50, 22);
    
    g.setColor (Color.orange);
    g.fillRect(250,170+x,70,70);
    g.setColor (Color.white);
   g.fillRect(250,190+x,70,35);
   g.setColor (Color.red);
   g.fillRect(250,200+x,70,17);
   g.setColor (Color.black);
   g.drawRect(250,170+x,70,70);
   g.drawRect(250,190+x,70,35);
   g.drawRect(250,200+x,70,17);
   
    g.setColor (Color.black);
    g.drawArc(220,238+x,250,200,120,100);
    
    g.setColor(Color.black);
   // g.drawLine(265,350,194,550);
   g.drawRect(250,385+x,20,80);
    }
    
}
