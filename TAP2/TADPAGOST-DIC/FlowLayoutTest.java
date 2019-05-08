import java.awt.*;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama FlowLayoutTest y crea una interfaz  con varios botones de opciones


public class FlowLayoutTest
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.setTitle("FlowLayoutTest");
        f.setSize(300,150);
        f.setLayout(new FlowLayout());
        Button b1 = new Button("button 1");
        f.add(b1);
        Button b2 = new Button("button 2");
        f.add(b2);
       
        Button b3 = new Button("button 3");
        f.add(b3);
        f.setVisible(true);
        
    }
}