package eventos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListenerTest extends WindowAdapter {
	
	public void windowsClosing(WindowEvent ev)
	{
		System.exit(0);
	}
}
