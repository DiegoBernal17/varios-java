package DibujosConHilos;

/**
 *yaquelin monserrat flores avila
 * 17/02/16
 * pratica hacer un edificio
 */
import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class Edificios extends Applet
{
   public void paint (Graphics g,int x)
   {
      g.setColor(Color.yellow);
       g.fillRect(325,110+x,75,40);//cuadro1 
       g.fillRect(300,150+x,125,75);//cuadro2 
       g.fillRect(200,225+x,225,75);//cuadro3
       g.fillRect(75,300+x,350,65);//cuadro4
      
       g.setColor(Color.blue);
       //fillRect(x,y,anch,larg)
       g.fillRect(325,166+x,20,20);//cuadro1a 
       g.fillRect(375,166+x,20,20);//cuadro1b 
       g.fillRect(325,200+x,20,20);//cuadro2a
       g.fillRect(375,200+x,20,20);//cuadro2b 
       g.fillRect(215,235+x,20,20);//cuadro3a
       g.fillRect(248,235+x,20,20);//cuadro3b
       g.fillRect(285,235+x,20,20);//cuadro3c
       g.fillRect(325,235+x,20,20);//cuadro3d
       g.fillRect(375,235+x,20,20);//cuadro3e
       g.fillRect(215,275+x,20,20);//cuadro4a
       g.fillRect(248,275+x,20,20);//cuadro4b
       g.fillRect(285,275+x,20,20);//cuadro4c
       g.fillRect(325,275+x,20,20);//cuadro4d
       g.fillRect(375,275+x,20,20);//cuadro4e
       g.fillRect(95,315+x,20,20);//cuadro5a
       g.fillRect(135,315+x,20,20);//cuadro5b
       g.fillRect(175,315+x,20,20);//cuadro5c
       g.fillRect(215,315+x,20,50);//cuadro5d
       g.fillRect(248,315+x,20,50);//cuadro5e
       g.fillRect(285,315+x,20,20);//cuadro5f
       g.fillRect(325,315+x,20,20);//cuadro5g
       g.fillRect(375,315+x,20,20);//cuadro5h
       
       g.setColor(Color.white);
       g.drawRect(325,166+x,20,20);//cuadro1a 
       g.drawRect(375,166+x,20,20);//cuadro1b 
       g.drawRect(325,200+x,20,20);//cuadro2a
       g.drawRect(375,200+x,20,20);//cuadro2b 
       g.drawRect(215,235+x,20,20);//cuadro3a
       g.drawRect(248,235+x,20,20);//cuadro3b
       g.drawRect(285,235+x,20,20);//cuadro3c
       g.drawRect(325,235+x,20,20);//cuadro3d
       g.drawRect(375,235+x,20,20);//cuadro3e
       g.drawRect(215,275+x,20,20);//cuadro4a
       g.drawRect(248,275+x,20,20);//cuadro4b
       g.drawRect(285,275+x,20,20);//cuadro4c
       g.drawRect(325,275+x,20,20);//cuadro4d
       g.drawRect(375,275+x,20,20);//cuadro4e
       g.drawRect(95,315+x,20,20);//cuadro5a
       g.drawRect(135,315+x,20,20);//cuadro5b
       g.drawRect(175,315+x,20,20);//cuadro5c
       g.drawRect(215,315+x,20,50);//cuadro5d
       g.drawRect(248,315+x,20,50);//cuadro5e
       g.drawRect(285,315+x,20,20);//cuadro5f
       g.drawRect(325,315+x,20,20);//cuadro5g
       g.drawRect(375,315+x,20,20);//cuadro5h
       
}
}
