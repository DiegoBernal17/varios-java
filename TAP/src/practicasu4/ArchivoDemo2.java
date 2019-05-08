package practicasu4;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ArchivoDemo2 extends Frame implements WindowListener, ActionListener {

	private TextArea areaTextoEntrada;
	private Button cargarBoton;
	private BufferedReader archivoEntrada;
	private TextField nombreCampo;
	
	public static void main(String[] args) {
		ArchivoDemo2 demo = new ArchivoDemo2();
		demo.setSize(300, 400);
		demo.crearGui();
		demo.setVisible(true);
	}
	
	public void crearGui() {
		Panel superior = new Panel();
		cargarBoton = new Button("cargar");
		superior.add(cargarBoton);
		cargarBoton.addActionListener(this);
		nombreCampo = new TextField(20);
		superior.add(nombreCampo);
		nombreCampo.addActionListener(this);
		add("North", superior);
		areaTextoEntrada = new TextArea("",10,50);
		add("Center", areaTextoEntrada);
		addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == cargarBoton) {
			String nombreArchivo;
			nombreArchivo = nombreCampo.getText();
			try {
				archivoEntrada = new BufferedReader(new FileReader(nombreArchivo));
				areaTextoEntrada.setText(""); // Limpiar el área de entrada
				String linea;
				while((linea = archivoEntrada.readLine()) != null) {
					areaTextoEntrada.append(linea+"\n");
				}
				archivoEntrada.close();
			}
			catch (IOException e) {
				System.err.println("Error en archivo "+nombreArchivo+": "+e.toString());
				System.exit(1);
			}
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	// métodos de WindowListener vacíos
	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}
}
