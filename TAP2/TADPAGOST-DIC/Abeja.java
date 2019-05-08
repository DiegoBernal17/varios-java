
import java.awt.*;
import javax.swing.*;


public class Abeja extends JApplet
{
    public void paint (Graphics g)
    {
        //antenas
        g.fillOval(105,205,15,15);
        g.fillOval(165,205,15,15);
        g.drawLine(110,205,128,265);
        g.drawLine(175,205,160,265);
        //cara
        g.drawOval(100,280,80,80);
        g.drawArc(110,300,60,50,180,180);
        //ojos
        g.fillOval(128,310,5,8);
        g.fillOval(148,310,5,8);
        //cuerpo
        g.drawOval(185,262,140,110);
        
        //alas
        g.drawArc(250,130,110,150,280,90);
        g.drawArc(160,100,110,185,36,220);
        g.drawArc(250,100,110,185,0,230);
        
        //agijon
        g.drawLine(323,300,345,315);
        g.drawLine(323,330,345,315);
        
        //rallas
        g.drawArc(80,250,140,130,320,74);
        g.drawArc(110,251,140,130,310,100);
        g.drawArc(140,250,140,130,305,109);
        g.drawArc(170,251,140,130,310,100);

    }
 }