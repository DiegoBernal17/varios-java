 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Leon extends Applet
{
    LeonThread f2;
    Thread animacion;
    public void init()
    {
        f2=new LeonThread();
        f2.setSize(1250,1250);
        animacion=new Thread(f2);
        animacion.start();
        add(f2);
    }// init
}