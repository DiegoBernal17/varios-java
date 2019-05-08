package Eventos;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class FocoEvento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FocoEvento extends Applet implements ActionListener{

	private Button a, b, c;
    private int seleccion = 0;
    private MenuItem azul, verde, naranja;
    
    Foco foco = new Foco();
    MenuBar mb = new MenuBar();
    
    public static void main(){
        new FocoEvento().setVisible(true);
    } 
    
    public void init()
    {
       
        a = new Button("foco azul");
        add(a);
        a.addActionListener(this);
        
        b = new Button("foco verde");
        add(b);
        b.addActionListener(this);
        
        c = new Button("foco naranja");
        add(c);
        c.addActionListener(this);
    }

    public void paint (Graphics g)
    {

        g.setColor(Color.GRAY);
        if (seleccion == 1)
        {
            g.setColor(Color.BLUE);
        }
        if (seleccion == 2)
        {
            g.setColor(Color.GREEN);
        }
        if (seleccion == 3)
        {
            g.setColor(Color.ORANGE);
        }

        foco.paint(g);
        /*t.fillRoundRect(100,140,360,260,35,35);//contorno de la tele

        t.setColor(Color.WHITE);
        t.fillRect(140,180,240,180); //contorno de pantalla
        t.setColor(Color.BLUE);
        t.fillOval(400,320,23,23); //boton1
        t.fillOval(400,360,23,23); //boton2
        t.setColor(Color.GRAY);
        t.drawLine(177,60,280,140); //antena1
        t.drawLine(383,60,280,140); //antena2

        t.setColor(Color.GRAY);
        t.fillRect(140,180,40,180);
        t.setColor(Color.RED);
        t.fillRect(180,180,40,180);
        t.setColor(Color.ORANGE);
        t.fillRect(220,180,40,180);
        t.setColor(Color.GREEN);
        t.fillRect(260,180,40,180);
        t.setColor(Color.BLUE);
        t.fillRect(300,180,40,180);
        t.setColor(Color.YELLOW);*/

    }	

    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == a)
            seleccion = 1;
        if (event.getSource() == b)
            seleccion = 2;
        if (event.getSource() == c)
            seleccion = 3;
        repaint();
    }
}
