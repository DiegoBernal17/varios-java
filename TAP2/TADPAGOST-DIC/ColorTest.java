 
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
/**
 * Angela Cecilia Flores Duran
 * Clase ColorTest
 * Esta clase sirve para
 */

public class ColorTest 
{
Frame f = null;
public static void main(String[] args)
{
new ColorTest();
}
public ColorTest()
{
Frame f = new Frame();
f.setTitle("ColorTest");
f.setSize(300,150);
f.setBackground(Color.BLACK);
f.setVisible(true);
f.addMouseMotionListener(new MouseMotionAdapter()
{
    
public void mouseMoved(MouseEvent ev)
{
int r = f.getBackground().getRed();
if(r < 255)
f.setBackground(new Color(r+1,0,0));
else
f.setBackground(Color.BLACK);
}
});

}
}


