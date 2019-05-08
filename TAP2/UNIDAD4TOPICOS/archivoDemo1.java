import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class archivoDemo1 extends Frame implements WindowListener, ActionListener{
	private TextArea areaTextoEntrada;
	private Button guardarBoton;
	private PrintWriter archivoSalida;

	public static void main(String[] args) {
		archivoDemo1 demo = new archivoDemo1();
		demo.crearGui();
		demo.setSize(300, 400);
		demo.setVisible(true);

	}
	public void crearGui()
	{
		guardarBoton = new Button("Guardar");
		add("North", guardarBoton);
		guardarBoton.addActionListener(this);
		areaTextoEntrada = new TextArea(10,50);
		add("Center", areaTextoEntrada);
		addWindowListener(this);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==guardarBoton)
		{
			try{
				archivoSalida = new PrintWriter(new FileWriter("textosalida.txt"),true);
				archivoSalida.print(areaTextoEntrada.getText());
				archivoSalida.close();
			}catch(IOException e)
			{
				System.err.println("Error en archivo: " + e.toString());
				System.exit(1);
			}
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.exit(0);
		
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

}
