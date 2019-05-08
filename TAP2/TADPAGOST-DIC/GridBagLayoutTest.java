
import java.awt.*;
/**
 * Angela Cecilia Flores Duran
 * Clase GridBagLayoutTest
 * Esta clase sirve para crear botones en las ventanas acomodados deseadamente y de diferentes tamaños.
 */
public class GridBagLayoutTest
{
public static void main(String[] args) {
Frame frame = new Frame("GridBagLayoutTest");
frame.setLayout(new GridBagLayout());
Button button = new Button("Button 1");
GridBagConstraints c = new
GridBagConstraints();
c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 0;
c.gridy = 0;
frame.add(button, c);
button = new Button("Button 2");
c.gridx = 1;
c.gridy = 0;
frame.add(button, c);
button = new Button("Button 3");
c.gridx = 2;
c.gridy = 0;
frame.add(button, c);
button = new Button("Button 4");
c.ipady = 40;
c.weightx = 0.0;
c.gridwidth = 3;
c.gridx = 0;
c.gridy = 1;
frame.add(button, c);
button = new Button("Button 5");
c.ipady = 0;
c.weighty = 1.0;
c.anchor = GridBagConstraints.PAGE_END;
c.insets = new Insets(10,0,0,0);
c.gridx = 1;
c.gridwidth = 2;
c.gridy = 2;
frame.add(button, c);
frame.pack();
frame.setVisible(true);
}
}