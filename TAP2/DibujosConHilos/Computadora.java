package DibujosConHilos;
import java.awt.*;
import java.applet.Applet;

public class Computadora extends Applet implements  Runnable
{
    public int y=100;
    Thread hilo;
    
     public void init()
    {
        hilo = new Thread(this);
        hilo.start();
        resize(700, 600); //Redimensionar tamaño applet.
    }

    
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(108,60,255,230);//cuadro negro afuera

        g.setColor(Color.white);
        g.fillRect(121,70,230,210);

        g.setColor(Color.black);
        g.fillRect(150,100,180,150);//cuadro negro adentro
        g.fillRect(110,300,250,100);

        g.setColor(Color.white);
        g.fillRect(125,315,225,75);

        g.setColor(Color.black);
        g.fillRect(260,340,75,15);//cuadrito negro
        g.setColor(Color.black);
        g.fillOval(200,325,16,16);//1ra
        g.fillOval(180,325,16,16);
        g.fillOval(140,325,16,16);
        g.fillOval(160,325,16,16);
        g.fillOval(200,345,16,16);//2da
        g.fillOval(180,345,16,16);
        g.fillOval(140,345,16,16);
        g.fillOval(160,345,16,16);
        g.fillOval(200,365,16,16);//3ra
        g.fillOval(180,365,16,16);
        g.fillOval(140,365,16,16);
        g.fillOval(160,365,16,16);
        //raton 
        g.setColor(Color.red);
        g.drawArc(30,179+y,300,200,120,80);
        g.drawOval(5,310+y,75,125);
        g.drawLine(6,350+y,78,350+y);

        g.setColor(Color.white);
        g.fillOval(160,100,150,150);
        g.setColor(Color.black);
        g.fillOval(180,120,111,111);
        
        y=y-3;
     }
     public void run()//metodo para ejecutar los eventos y transformaciones de la applet, que captura la excepcion con u hilo de 1 seg de mov
    {
        while (true)//mientras sea verdad
        {
            repaint();
            try{
                hilo.sleep(250);//hilo controlado con el tiempo de 1seg de movimiento de la applet
            }catch(InterruptedException e)
            {
            }
        }//fin del while
    }//fin del metodo run

}