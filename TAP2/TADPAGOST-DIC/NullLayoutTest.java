
import java.awt.Button;
import java.awt.Frame;
/**
 * Angela Cecilia Flores Duran
 * Clase NullLayoutTest 
 * Esta clase sirve para crear dos botones colocados de la manera deseada
 */
public class NullLayoutTest{
public static void main(String[] args){
Frame f =new Frame();
f.setTitle("NullLayoutTest");
f.setSize(300,150);
f.setLayout(null);
Button b1 =new Button("Button 1");
b1.setBounds(50,25,100,50);
f.add(b1);
Button b2 =new Button("Button 2");
b2.setBounds(125,85,100,50);
f.add(b2);
f.setVisible(true);
}
}
