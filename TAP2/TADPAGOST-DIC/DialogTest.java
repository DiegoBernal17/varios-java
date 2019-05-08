import java.awt.Dialog;
import java.awt.Frame;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama dialogTest , te muestra una ventana de interfaz simple 
public class DialogTest
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("FrameTest");
        f.setSize(200,150);
        f.setVisible(true);
        
        Dialog d= new Dialog(f);
        d.setTitle("DialogTest");
        d.setBounds(50,50,70,50);
        d.setVisible(true);
    }
}