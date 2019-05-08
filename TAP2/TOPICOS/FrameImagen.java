import javax.swing.JFrame;


public class FrameImagen extends JFrame
{
    public FrameImagen()
    {
        add(new PanelImagen());
        setSize(500,500);
        setVisible(true);
        
        
    }
    public static void main(String[] args)
    {
        FrameImagen f = new FrameImagen();
     
      
    }
}
