
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;


public class PanelImagen extends JPanel
{
    
    
 public void paintComponent(Graphics g)
 {
 Dimension tam = getSize();
        
 ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagen/mar.jpe")).getImage());
 g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height,null);
		
		
              
    


		
                





  
}
}