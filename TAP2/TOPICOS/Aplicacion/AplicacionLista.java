package Aplicacion;

import Dibujos.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class AplicacionLista extends Applet implements ItemListener
{
    // instance variables - replace the example below with your own
    private int x=100, y=100, seleccion, eleccion;
        
    List lista;
    Gato r = new Gato();
    Leon l = new Leon();
    Cangrejo c = new Cangrejo();
    Pulpo p = new Pulpo();
    Abeja a = new Abeja();
    
    public void init()
    {
        //LISTA DE COSAS
        lista = new List(5);
        lista.add("GATO");
        lista.add("LEON");
        lista.add("CANGREJO"); 
        lista.add("PULPO");
        lista.add("ABEJA");
        
        add(lista);
        
        lista.addItemListener(this);
        
           }
     
    public void paint(Graphics g) 
    {       

        switch(eleccion){
            case 1:
            r.paint(g);
            break;
            case 2:
            l.paint(g);
            break;
            case 3:
            c.paint(g);
            break;
            case 4:
            p.paint(g);
            break;
            case 5:
            a.paint(g);
            break;
        }
    }   
 
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange() == ItemEvent.SELECTED)
        {
            eleccion = lista.getSelectedIndex()+1;
        }
        
        repaint();
    }
}
