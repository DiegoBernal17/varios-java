import java.awt.*;
// Nombre:Angela cecilia Flores Duran
// 24/08/2016
// la clase se llama MenuTest , y  te muestra la interfaz de un menu donde
// te despliega varias opciones.

public class MenuTest
{
    public static void main(String [] args)
    {
        Frame f = new Frame();
        f.setTitle("Menu Test");
        MenuBar mb = new MenuBar();
        Menu m1 = new Menu("menu 1");
        m1.add(new MenuItem("opcion 1"));
        m1.add(new MenuItem("opcion 2"));
        Menu m2 = new Menu("menu 2");
        m2.add(new CheckboxMenuItem("opcion 1",true));
        m2.add(new CheckboxMenuItem("opcion 2"));
        mb.add(m1);
        mb.add(m2);
        f.setMenuBar(mb);
        f.setSize(200,150);
        f.setVisible(true);
    }
}