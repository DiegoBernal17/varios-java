
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama  CheckboxTest , te facilita una interfaz para elegir  una opcion 
public class CheckboxTest
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("CheckboxTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        Checkbox c= new Checkbox("Mayor de 18 años");
        f.add(c);
        f.setVisible(true);
    }
}