import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Abeja1 extends Applet
{
    AbejaThread f1;
    Thread animacion;
    public void init()
    {
        f1=new AbejaThread();
        f1.setSize(1250,1250);
        animacion=new Thread(f1);
        animacion.start();
        add(f1);
    }// init
}