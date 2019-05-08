 import java.awt.*;
 import java.awt.event.MouseAdapter;
 import java.awt.event.MouseEvent;
 
 public class CursorTest
 {
     Frame f = null;
     
     public static void main(String [] args)
     {
         new CursorTest();
     }
     public CursorTest()
     {
         
         f= new Frame();
         f.setTitle("CursorTest");
         f.setSize(300,150);
         f.setLayout(new FlowLayout());
         Button b1= new Button("Aceptar");
         
        b1.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent ev)
            {
                f.setCursor(Cursor.HAND_CURSOR);
            }
            
            public void mouseExited(MouseEvent ev)
            {
                f.setCursor(Cursor.DEFAULT_CURSOR);
            }
        });
        f.add(b1);
        f.setVisible(true);
    }
}
     