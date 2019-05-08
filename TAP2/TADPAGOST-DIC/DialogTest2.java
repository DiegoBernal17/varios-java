import java.awt.FileDialog;
import java.awt.Frame;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama DialogTest2 , te habre  a la venta  seleccionada 
public class DialogTest2
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("FrameTest");
        f.setSize(200,150);
        f.setVisible(true);
        
        FileDialog d = new FileDialog(f);
        d.setTitle("FileDialogTest");
        d.setBounds(50,50,70,50);
        d.setVisible(true);
        
        System.out.println(d.getFile());//Recibir el nombre del fichero seleccionado
    }
}