
import java.awt.*;
/**
 * Angela Cecilia Flores Duran
 * Clase Ejemplo
 * Esta clase sirve para dar un ejemplo de awt.
 */

public class Ejemplo{
    public static void main (String []args){
        
        Frame frame = new Frame();
        frame.setLayout(null);
        frame.setBounds(0,0,400,300);
        frame.setTitle("Ejemplo AWT");
        
        Panel panel = new Panel();
        panel.setLayout(null);
        panel.setBounds(50,40,250,220);
        panel.setBackground(Color.LIGHT_GRAY);
        
        Button boton = new Button("Aceptar");
        boton.setBounds(100,80,100,20);
        
        panel.add(boton);
        frame.add(panel);
        
        frame.setVisible(true);
        
    }
}