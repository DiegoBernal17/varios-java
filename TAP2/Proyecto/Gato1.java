
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Gato1 extends Applet
{
    GatoThread f1;
    Thread animacion;
    public void init()
    {
        f1=new GatoThread();
        f1.setSize(1250,1250);
        animacion=new Thread(f1);
        animacion.start();
        add(f1);
    }// init
}