 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Pulpo1 extends Applet
{
    PulpoThread f1;
    Thread animacion;
    public void init()
    {
        f1=new PulpoThread();
        f1.setSize(1250,1250);
        animacion=new Thread(f1);
        animacion.start();
        add(f1);
    }// init
}