import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintWriter;
import java.awt.Frame;

public class archivoDemo2 extends Frame implements ActionListener, WindowListener {
	private TextArea areaTextoEntrada;
	private Button guardarBoton;
	private PrintWriter archivoSalida;
	public static void main(String[] args) {
		archivoDemo2 demo = new archivoDemo2();
		demo.crearGui();
	}
	public void crearGui()
	{
		guardarBoton = new Button("Guardar");
		add("North", guardarBoton);
		guardarBoton.addActionListener(this);
		areaTextoEntrada= new TextArea(10,50);
		add("Center", areaTextoEntrada);
		addWindowListener(this);
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
