 
import java.awt.*;
/**
 * Angela Cecilia Flores Duran
 * Clase GraphicsTest
 * Esta clase sirve para
 */
public class GraphicsTest extends Frame
{
public static void main(String[] args)
{
new GraphicsTest().setVisible(true);
}
public GraphicsTest()
{
this.setTitle("GraphicsTest");
this.setBackground(Color.LIGHT_GRAY);
this.setSize(300,150);
}

public void paint(Graphics g)

{
g.setColor(Color.LIGHT_GRAY);
g.draw3DRect(10,30,this.getWidth()-20,this.getHeight()-40,true);
g.setColor(Color.BLACK);
g.drawLine(15,35,65,65);
g.drawRect(70,35,50,30);
g.drawRoundRect(125,35,50,30,10,10);
g.drawOval(180,35,50,30);
g.drawArc(235,35,50,30,25,200);
int[] x = {15,65,15,65};
int[] y = {90,90,120,120};
g.drawPolygon(x,y,x.length);
g.setColor(Color.RED);
g.fillRect(70,90,50,30);
g.fillRoundRect(125,90,50,30,10,10);
g.fillOval(180,90,50,30);
g.fillArc(235,90,50,30,25,200);
g.setColor(Color.BLACK);
g.setFont(new Font("SansSerif",Font.PLAIN,9));
g.drawString("Línea",30,80);
g.drawString("Rectángulos",95,80);
g.drawString("Óvalo",192,80);
g.drawString("Arco",250,80);
g.drawString("Polígono",22,135);
g.drawString("Rectángulos",95,135);
g.drawString("Óvalo",192,135);
g.drawString("Arco",250,135);
}

}
