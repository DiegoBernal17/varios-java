package eventos;
import java.awt.*;
import java.awt.event.*;

public class WindowEventTest3 {
	
	public static void main(String[] args)
	{
		WindowEventTest3 w = new WindowEventTest3();
	}
	
	public WindowEventTest3()
	{
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200, 150);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);
			}
		});	
		f.setVisible(true);
	}
}
