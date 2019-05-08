 

import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class paleta extends Applet
{
   public void paint (Graphics g)
   {  
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
