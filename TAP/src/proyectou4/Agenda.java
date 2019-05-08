package proyectou4;

import java.io.*;
import javax.swing.JOptionPane;

public class Agenda {

	private String description;
	private static int sizeMaximun = 200;
	private int size;
	
	public Agenda()  {
		description = "Sin descripción";
		size = 0;
	}
	
	public Agenda(String desc)
	{
		description = desc;
		size = 0;
	}
	
	public void add(String nombre, String numero)
	{
		PrintWriter archivoSalida;
		try {
			archivoSalida = new PrintWriter(new FileWriter("contactos/"+numero), true);
			archivoSalida.println(nombre);
			archivoSalida.close();
			JOptionPane.showMessageDialog(null, "¡Contacto guardado con exito!");
		}
		catch(IOException e) {
			System.err.println("Error en archivo: "+e.toString());
			System.exit(1);
		}
	}
	
	public void remove(String numero)
	{
		if(numero == null || numero == "" || numero.isEmpty())
			JOptionPane.showMessageDialog(null, "Selecciona un contacto");
		
		File file = new File("contactos/"+numero);
		if(file.delete())
			JOptionPane.showMessageDialog(null, "El contacto se ha borrado.");
		else
			JOptionPane.showMessageDialog(null, "El contacto no puede ser borrado");
	}
	
	public String[][] getContacts()
	{
		File f = new File("contactos");
		File[] ficheros = f.listFiles();
		String[][] contacts = new String[ficheros.length][2];
		BufferedReader file;
		for (int x=0; x<ficheros.length; x++){
			contacts[x][0] = ficheros[x].getName();
			try 
			{
			  file = new BufferedReader(new FileReader("contactos/"+contacts[x][0]));
				String linea;
				while((linea = file.readLine()) != null) {
					contacts[x][1] = linea;
				}
				file.close();
			}
			catch (IOException e) {
				System.err.println("Error en archivo "+contacts[x][0]+": "+e.toString());
				System.exit(1);
			}
		}
		return contacts;
	}
	
	public String show(String numero)
	{
		return "";
	}
	
	public int count()
	{
		File f = new File("contactos");
		File[] ficheros = f.listFiles();
		return ficheros.length;
	}
}
