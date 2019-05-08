import java.awt.*;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama ChoiceTest , te despliega un menu  con  dos opciones de colores
public class ChoiceTest
{
  
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("ChoiceTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        Choice cbg = new Choice();
        cbg.add("Rojo");
        cbg.add("Blanco");
        f.add(cbg);
        f.setVisible(true);
    }
}
        
      