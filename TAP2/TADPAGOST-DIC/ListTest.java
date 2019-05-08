import java.awt.*;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama  LisTest , habre una  interfaz con un menu que se despliega hacia arriba o abajo 
public class ListTest
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("ListTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        List l = new List(3);
        l.add("Primero");
        l.add("Segundo");
        l.add("Tercero");
        l.add("Cuarto");
        f.add(l);
        f.setVisible(true);
    }
}