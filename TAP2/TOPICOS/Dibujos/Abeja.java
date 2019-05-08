package Dibujos;

import java.awt.*;
import javax.swing.*;


public class Abeja extends JApplet
{
    public void paint (Graphics g)
    {
        
        
        //antenas
        
        g.fillOval(105,200,15,15);
        g.fillOval(145,200,15,15);
        g.drawLine(110,205,128,265);
        g.drawLine(155,205,138,265);
        
        
        //cara
        
        g.setColor(Color.yellow);
        g.fillOval(100,280,80,80);
        
         //ojos
        g.setColor(Color.black);
        g.fillOval(128,310,5,8);
        g.fillOval(148,310,5,8);
        
        //boca
        g.fillArc(110,300,60,50,180,180);
        
        
       //agijon
        g.drawLine(323,300,345,315);
        g.drawLine(323,330,345,315);
       
        
        //alas
        //g.drawArc(250,130,110,150,360,360);
        g.setColor(Color.black);
        g.fillArc(160,100,110,185,360,360);
        g.fillArc(250,100,110,185,360,360);
        
     
        //cuerpo
        
        g.setColor(Color.yellow);
        g.fillOval(185,262,140,110);
        
      
        
        //rallas
        
        g.setColor(Color.black);
        g.drawArc(80,250,140,130,320,74);
        g.drawArc(110,251,140,130,310,100);
        g.drawArc(140,250,140,130,305,109);
        g.drawArc(170,251,140,130,310,100);
        
        
        
        

    }
 }