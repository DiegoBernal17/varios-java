package practicasu4;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class FileDialogDemo extends Frame implements ActionListener, WindowListener {

	private Button cargarBoton;
	private FileDialog obtenerNombreCuadro;
	private TextField nombreCampo;
	
	public static void main(String[] args) {
		FileDialogDemo demo = new FileDialogDemo();
		demo.setSize(500,400);
		demo.crearGui();
		demo.setVisible(true);
	}
	
	public void crearGui() {
		setLayout(new FlowLayout());
		cargarBoton = new Button("cargar");
		add(cargarBoton);
		cargarBoton.addActionListener(this);
		nombreCampo = new TextField(30);
		add(nombreCampo);
		addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		String nombreArchivo;
		if(evt.getSource() == cargarBoton) {
			obtenerNombreCuadro = new FileDialog(this, "obtener nombre", FileDialog.LOAD);
			obtenerNombreCuadro.show();
			
			// mostrar el nombre
			nombreArchivo = obtenerNombreCuadro.getFile();
			nombreCampo.setText(nombreArchivo);
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	// Métodos de WindowListener vacíos
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
