package eventos;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest implements ActionListener {

	public void actionPerformed(ActionEvent ev)
	{
		if(((Button)ev.getSource()).getLabel().equals("Aceptar"))
			System.out.println("Has pulsado Aceptar.");
		else
			System.out.println("Has pulsado Cancelar.");
	}
}
