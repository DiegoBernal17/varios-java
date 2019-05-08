package DibujosConHilos;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Calavaza extends Applet
{
    CalavazaThread c;
    Thread animacion;
    public void init()
    {
        c=new CalavazaThread();
        c.setSize(1500,1500);
        animacion=new Thread(c);
        animacion.start();
        add(c);
    }// init
}