import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama TextArea, se muestra  un cuadro de texto  para escribir 
public class TextAreaTest
{
    public static void main(String[] args)
    {
        Frame f= new Frame();
        f.setTitle("TextAreaTest");
        f.setLayout(new FlowLayout());
        TextArea ta = new TextArea("Escribe a qui ....",5,15);
        f.add(ta);
        f.setVisible(true);
    }
}