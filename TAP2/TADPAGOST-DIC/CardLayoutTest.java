
/**
 * Angela Cecilia Flores Duran
 * Clase CardLayoutTest
 * Esta clase sirve para crear una ventana expandible solo hacia los lados con un boton .
 */

import java.awt.*;
public class CardLayoutTest{
public static void main(String[] args){
Frame f =new Frame();
f.setTitle("CardLayoutTest");
f.setSize(300,150);
CardLayout cl = new CardLayout();
f.setLayout(cl);
Button b1 =new Button("Button 1");
f.add(b1,"uno");
Button b2 =new Button("Button 2");
f.add(b2,"dos");
Button b3 =new Button("Button 3");
f.add(b3,"tres");
f.setVisible(true);
cl.show(f,"dos");   
}
}
