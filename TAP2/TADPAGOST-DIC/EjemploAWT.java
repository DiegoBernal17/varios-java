import java.awt.*;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama EmploAWT y te despliega la opcion de aceptar en la interfaz.

public class EjemploAWT
{
    public static void main(String[] args)
    {
        Frame frame= new Frame();
        frame.setLayout(null);
        frame.setBounds(0,0,400,300);
        frame.setTitle("Ejemplo AWT");
        
        Panel panel= new Panel();
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