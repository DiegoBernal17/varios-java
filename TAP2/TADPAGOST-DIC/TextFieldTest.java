
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llamaTextFieldTest , y sirve para escribir el texto en  una ventana de una interfaz.
public class TextFieldTest
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("TextFieldTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        TextField tf = new TextField("Escribe a qui ....");
        f.add(tf);
        f.setVisible(true);
    }
}