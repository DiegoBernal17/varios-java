import java.awt.*;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama CheckboxGroupTest y te da opcion de  escojer un obejeto hombre o mujer


public class CheckboxGroupTest
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("CheckboxGroupTest");
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Hombre" ,cbg,true);
        Checkbox c2 = new Checkbox("Mujer",cbg,false);
        f.add(c1);
        f.add(c2);
        f.setVisible(true);
    }
}