package Proyecto;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Paleta1 extends Applet
{
    PaletaThread f1;
    Thread animacion;
    public void init()
    {
        f1=new PaletaThread();
        f1.setSize(1250,1250);
        animacion=new Thread(f1);
        animacion.start();
        add(f1);
    }// init
}