
import java.awt.Frame;
/**
 * Angela Cecilia Flores Duran
 * Clase WindowEventTest
 * Esta clase sirve para crear una ventana expandible hacia los lados y se cierra con la x.
 */
public class WindowEventTest1{
public static void main(String[] args){
Frame f = new Frame();
f.setTitle("FrameTest");
f.setSize(200,150);
f.addWindowListener(new WindowListenerTest());
f.setVisible(true);
}
}
