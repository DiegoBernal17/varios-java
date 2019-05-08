 
import java.awt.*;
/**
 * Angela Cecilia Flores Duran
 * Clase ButtonEventTest
 * Esta clase sirve para
 */
public class ButtonEventTest{
public static void main(String[] args){
Frame f =new Frame();
f.setTitle("ButtonEventTest");
f.setSize(200,150);
f.setLayout(new FlowLayout());
Button b1 =new Button("Aceptar");
b1.addActionListener(new ActionListenerTest());
f.add(b1);
Button b2 =new Button("Cancelar");
b2.addActionListener(new ActionListenerTest());
f.add(b2);
f.setVisible(true);
}
}
