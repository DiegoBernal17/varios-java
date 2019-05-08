 
import java.awt.*;
/**
 * Angela Cecilia Flores Duran
 * Clase BorderLayoutTest
 * Esta clase sirve para una ventana con botones de diferentes tamaños y en diferentes posiciones.
 */
public class BorderLayoutTest{
public static void main(String[] args){
Frame f = new
Frame();
f.setTitle("BorderLayoutTest");
f.setLayout(new
BorderLayout());
Button b1 =new Button("Button 1 (NORTH)");
f.add(b1,BorderLayout.NORTH);
Button b2 =new Button("Button 2 (WEST)");
f.add(b2,BorderLayout.WEST);
Button b3 =new Button("Button 3 (CENTER)");
f.add(b3,BorderLayout.CENTER);
Button b4 =new Button("Button 4 (EAST)");
f.add(b4,BorderLayout.EAST);
Button b5 =new Button("Button 5 (SOUTH)");
f.add(b5,BorderLayout.SOUTH);
f.pack();                     
f.setVisible(true);   
}
}    