
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
/**
 * 
 * @Angela Cecilia Flore Duran
 * @version 01/03/2016
 */
public class RadioBuuton extends Applet implements ActionListener
{
   JRadioButton c1 = new  JRadioButton ("Gato");
   JRadioButton  c2 = new JRadioButton ("Cangrejo");
   JRadioButton  c3 = new JRadioButton("Abeja");
   JRadioButton  c4 = new JRadioButton ("Leon");
   JRadioButton  c5 = new JRadioButton  ("Pulpo");
   
    private int seleccion=0;
    public void init() 
    {
        c1.addActionListener(this);
        add(c1);
        c2.addActionListener(this);
        add(c2);
        c3.addActionListener(this);
        add(c3);
        c4.addActionListener(this);
        add(c4);
        c5.addActionListener(this);
        add(c5);
    }
    Gato ga = new Gato();
    Cangrejo n = new Cangrejo();
    Abeja  a = new Abeja();
    Leon  l = new Leon();
    Pulpo p = new Pulpo();
    
     public void paint(Graphics g)
        //explica cual es el cuadro uno y asi 
    {
        if (seleccion == 1)
        {
            ga.paint(g);
        }
        if (seleccion == 2)
        {
            n.paint(g);
        }
        if (seleccion == 3)
        {
            a.paint(g);
        }
        if(seleccion==4)
        {
            l.paint(g);
        }
        if(seleccion==5)
        {
            p.paint(g);
        }
        
    } 
    public void actionPerformed(ActionEvent  e)
    //el que genera el evento
    {
        if (e.getSource()==c1)
        {
            seleccion = 1;
        }
        if (e.getSource() ==c2)
        {
            seleccion = 2;
        }
        if (e.getSource() ==c3)
        {
            seleccion = 3;
        }
        if(e.getSource()==c4)
        {
            seleccion=4;
        }
        if(e.getSource()==c5)
        {
            seleccion=5;
        }
        repaint();
    }
}