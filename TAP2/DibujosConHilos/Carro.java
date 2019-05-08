package DibujosConHilos;
import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class Carro extends Applet
{

    public void paint (Graphics g,int x)
   {
       g.setColor(Color.green);//parte verde
       g.fillOval(174+x,155,520,175);
       g.fillOval(170+x,175,530,175);
       g.setColor(Color.green);
       g.fillRoundRect(170+x, 206,530,145,170,250);
       
       g.setColor(Color.gray);
       g.fillOval(244+x,275,135,135);
       g.fillOval(484+x,290,135,135);
       
       g.setColor(Color.black);
       g.drawOval(244+x,275,135,135);
       g.fillOval(268+x,300,85,85);
       
       g.setColor(Color.black);
       g.drawOval(484+x,290,135,135);
       g.fillOval(508+x,315,85,85);
       g.fillOval(400+x,250,75,75);//cisculo centro

       g.setColor(Color.white);
       g.fillOval(344+x,75,235,135);
       
       g.setColor(Color.white);
       g.fillRect(428+x,260,20,50);//numero
 }
}