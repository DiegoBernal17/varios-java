package ejemplo;


/**
 * Write a description of class WindowListenerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListenerTest extends WindowAdapter{

	public void windowClosing(WindowEvent ev)
	{
	System.exit(0);
	}

}
