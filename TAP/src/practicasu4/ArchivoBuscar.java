package practicasu4;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ArchivoBuscar extends Frame implements ActionListener, WindowListener
{
	private BufferedReader archivoEntrada; 
	private Button buscarBoton;
	private TextField resultado1Campo;
	private TextField resultado2Campo;
	private TextField personaCampo;
	private TextField nombreArchivoCampo;
	private TextField errorCampo;
	private String nombreArchivo;
	
	public static void main(String[] args) {
		ArchivoBuscar buscar = new ArchivoBuscar();
		buscar.setSize(400,400);
		buscar.crearGui();
		buscar.setVisible(true);
	}
	
	public void crearGui()
	{
		setLayout(new FlowLayout());
		errorCampo = new TextField("Introduzca el nombre del archivo:");
		errorCampo.setEditable(false);
		add(errorCampo);
		nombreArchivoCampo = new TextField(20);
		nombreArchivoCampo.setText("");
		add(nombreArchivoCampo);
		buscarBoton = new Button("Buscar");
		add(buscarBoton);
		buscarBoton.addActionListener(this);
		add(new Label("Introduzca nombre:"));
		personaCampo = new TextField(20);
		personaCampo.setText("");
		add(personaCampo);
		add(new Label("Resultado1:"));
		resultado1Campo = new TextField(5);
		resultado1Campo.setEditable(false);
		add(resultado1Campo);
		add(new Label("Resultado2:"));
		resultado2Campo = new TextField(5);
		resultado2Campo.setEditable(false);
		add(resultado2Campo);
		this.addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == buscarBoton) {
			nombreArchivo = nombreArchivoCampo.getText();
			try {
				archivoEntrada = new BufferedReader(new FileReader(nombreArchivo));
			}
			catch(IOException e) {
				errorCampo.setText("No se encuentra el archivo");
				return;
			}
			errorCampo.setText("Introduzca el nombre del archivo:");
			// ahora leer el archivo
			try {
				String linea;
				boolean encontrado = false;
				while( ((linea = archivoEntrada.readLine()) != null) && (!encontrado) ) {
					// los tokens se dividen mediante coma, espacios
					StringTokenizer tokens = new StringTokenizer(linea, " ,");
					String nombreArchEnt = tokens.nextToken();
					if(personaCampo.getText().equals(nombreArchEnt)) {
						encontrado = true;
						resultado1Campo.setText(tokens.nextToken());
						resultado2Campo.setText(tokens.nextToken());
					}
				}
				archivoEntrada.close();
			}
			catch(IOException e) {
				System.err.println("Error al leer el archivo "+ nombreArchivo+": "+e.toString());
				System.exit(1);
			}
		}
	}
	
	// Métodos de WindowListener - ¡se necesitan todos!
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	// Métodos de WindowLstener vacíos
	public void windowIconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}
	
}
