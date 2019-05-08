
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Angela Cecilia Flores Duran
 * Clase ActionListenerTest
 * Esta clase sirve para
 */
public class ActionListenerTest implements ActionListener{
public void actionPerformed(ActionEvent ev){
if(((Button)ev.getSource()).getLabel().equals("Aceptar"))
System.out.println("Has pulsado Aceptar.");
else
System.out.println("Has pulsado Cancelar.");
}
}
