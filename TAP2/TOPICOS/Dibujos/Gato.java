package Dibujos;

import java.awt.*;
import java.applet.Applet;
public class Gato extends Applet
{
public void paint(Graphics g)
{
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
