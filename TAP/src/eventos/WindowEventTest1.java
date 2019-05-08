package eventos;
import java.awt.Frame;

public class WindowEventTest1 {
	
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setTitle("FrameTest");
		f.setSize(200,150);
		f.addWindowListener(new WindowListenerTest());
		f.setVisible(true);
	}
}
