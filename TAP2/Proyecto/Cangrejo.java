
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Cangrejo extends Applet
{
    CangrejoThread f4;
    Thread animacion;
    public void init()
    {
        f4=new CangrejoThread();
        f4.setSize(1250,1250);
        animacion=new Thread(f4);
        animacion.start();
        add(f4);
    }// init
}