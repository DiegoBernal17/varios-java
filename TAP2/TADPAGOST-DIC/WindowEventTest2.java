
import java.awt.*;
import java.awt.event.*;
/**
 * Yuseth Alberto Martinez Praga
 * Clase WindowEventTest2 
 * Esta clase sirve para crear una ventana que se puede cerrar.
 */
public class WindowEventTest2 implements WindowListener{
public static void main(String[] args){
WindowEventTest2 w =new WindowEventTest2();}
public WindowEventTest2(){
Frame f = new Frame();
f.setTitle("FrameTest");
f.setSize(200,150);
f.addWindowListener(this);
f.setVisible(true);
}
public void windowActivated(WindowEvent ev) {}
public void windowClosed(WindowEvent ev) {}
public void windowClosing(WindowEvent ev) { System.exit(0); }
public void windowDeactivated(WindowEvent ev) {}
public void windowDeiconified(WindowEvent ev) {}
public void windowIconified(WindowEvent ev) {}
public void windowOpened(WindowEvent ev) {}
}