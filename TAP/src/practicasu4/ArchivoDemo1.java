package practicasu4;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ArchivoDemo1 extends Frame implements WindowListener, ActionListener
{
	private TextArea areaTextoEntrada;
	private Button guardarBoton;
	private PrintWriter archivoSalida;
	
	public static void main(String[] args) {
		ArchivoDemo1 demo = new ArchivoDemo1();
		demo.crearGui();
		demo.setVisible(true);
	}
	
	public void crearGui() {
		setSize(500,500);
		guardarBoton = new Button("guardar");
		add("North", guardarBoton);
		guardarBoton.addActionListener(this);
		areaTextoEntrada = new TextArea(10,50);
		add("Center", areaTextoEntrada);
		addWindowListener(this); // Para windowClosing
	}
	
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == guardarBoton) {
			try {
				archivoSalida = new PrintWriter(new FileWriter("textosalida.txt"), true);
				archivoSalida.println(areaTextoEntrada.getText());
				archivoSalida.close();
				System.out.println("¡Archivo guardado con exito!");
			}
			catch(IOException e) {
				System.err.println("Error en archivo: "+e.toString());
				System.exit(1);
			}
		}
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}
	
}
