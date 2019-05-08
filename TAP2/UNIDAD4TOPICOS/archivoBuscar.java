


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class archivoBuscar extends Frame implements ActionListener, WindowListener {
	private BufferedReader archivoEntrada;
	private Button buscarBoton;
	private TextField resultado1Campo, resultado2Campo, nombreArchivoCampo, errorCampo, personaCampo;
	private String nombreArchivo;
	
	
	public static void main(String[] args) {
		archivoBuscar buscar = new archivoBuscar();
		buscar.setSize(400, 400);
		buscar.crearGui();
		buscar.setVisible(true);
		

	}
	private void crearGui() {
		setLayout(new FlowLayout());
		errorCampo = new TextField("Introduzca el nombre del archivo");
		errorCampo.setEditable(false);
		add(errorCampo);
		nombreArchivoCampo = new TextField(20);
		nombreArchivoCampo.setText("");
		add(nombreArchivoCampo);
		buscarBoton = new Button("buscar");
		add(buscarBoton);
		buscarBoton.addActionListener(this);
		add(new Label("Introduzca nombre: "));
		personaCampo = new TextField(20);
		personaCampo.setText("");
		add(personaCampo);
		add(new Label("Resultado 1: "));
		resultado1Campo = new TextField(5);
		resultado1Campo.setEditable(false);
		add(resultado1Campo);
		add(new Label("Resultado 2: "));
		resultado2Campo = new TextField(5);
		resultado2Campo.setEditable(false);
		add(resultado2Campo);
		this.addWindowListener(this);
		
		
	}
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==buscarBoton)
		{
			nombreArchivo = nombreArchivoCampo.getText();
			try{
				archivoEntrada = new BufferedReader(new FileReader(nombreArchivo));
			}catch(IOException e)
			{
				errorCampo.setText("No se encuentra el archivo");
				return;
			}
			errorCampo.setText("Introduzca el nombre del archivo");
			try{
				String linea;
				boolean encontrado = false;
				while(((linea=archivoEntrada.readLine())!=null) && (!encontrado))
				{
					StringTokenizer tokens = new StringTokenizer(linea, ",");
					String nombreArchEnt= tokens.nextToken();
					if(personaCampo.getText().equals(nombreArchEnt)){
						encontrado = true;
						resultado1Campo.setText(tokens.nextToken());
						resultado2Campo.setText(tokens.nextToken());
					}
				}
				archivoEntrada.close();
			}catch(IOException e)
			{
				System.err.println("Error al leer archivo " + nombreArchivo + ": " + e.toString());
				System.exit(1);
			}
		}
		
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}