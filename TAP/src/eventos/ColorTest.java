package eventos;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ColorTest {

	Frame f = null;
	
	public static void main(String[] args)
	{
		new ColorTest();
	}
	
	public ColorTest()
	{
		f = new Frame();
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
