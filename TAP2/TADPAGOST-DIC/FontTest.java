
/**
 * Yuseth Alberto Martinez Praga
 * Clase FontTest
 * Esta clase sirve para crear una ventana en la cual se presentan distintos tipos de letras.
 */

import java.awt.*;
public class FontTest
{
public static void main(String[] args){
Frame f = new Frame();
f.setTitle("FontTest");
f.setSize(200,200);
f.setLayout(new FlowLayout());
Label l1 = new Label("Serif");
l1.setFont(new Font("Serif", Font.PLAIN, 20));
Label l2 = new Label("SansSerif");
l2.setFont(new Font("SansSerif", Font.PLAIN, 20));
Label l3 = new Label("Monospaced");
l3.setFont(new Font("Monospaced", Font.ITALIC, 20));
Label l4 = new Label("Dialog");
l4.setFont(new Font("Dialog", Font.BOLD,20));
Label l5 = new Label("DialogInput");
l5.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 20));
f.add(l1);  f.add(l2);  f.add(l3);  f.add(l4);  f.add(l5);
f.setVisible(true);
}
}
