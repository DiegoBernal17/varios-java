import java.awt.*;

public class ImageTest extends Frame
{
    public static void main(String[] args)
    {
        new ImageTest().setVisible(true);
    }
    public ImageTest()
    {
        
        this.setTitle("ImageTest");
        this.setSize(150,110);
    }
    
    public void paint(Graphics g)
    {
        Image img = Toolkit.getDefaultToolkit().getImage("/Imagen/niños.jpq");
        g.drawImage(img,640,480,this);
    }
}