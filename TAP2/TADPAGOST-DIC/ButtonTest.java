import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama ButtonTest , y te da la opcion con un boton  abrir una ventana

public class ButtonTest 
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.setTitle("buttonTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        Button b = new Button ("ABRIR");
        f.add(b);
        f.setVisible(true);
    }
}