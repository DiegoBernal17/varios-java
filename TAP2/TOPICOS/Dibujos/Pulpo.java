package Dibujos;



import java.awt.*;
import javax.swing.*;


public class Pulpo extends JApplet
{
    public void paint(Graphics g)
    {
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

