import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama ScrollbarTest te da la opcion de dirigirte  o arrastrarte para la izquierda o derecha
// de una ventana
public class ScrollbarTest
{
    public static void main(String [] args)
    {
        Frame f= new Frame();
        f.setTitle("ScrollbarTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL,0,5,-100,100);
        f.add(sb);
        f.setVisible(true);
    }
}