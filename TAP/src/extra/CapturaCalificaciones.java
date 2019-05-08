package extra;

import java.io.*;
import javax.swing.JOptionPane;

/*
 * Captura de calificaciones de alumnos que incluya: Nombre, Carreara
 * No. Contro, 3 materias con sus calificaciones y su promedio
 */
public class CapturaCalificaciones {

	public void agregar(String nombre, String apellido_paterno, String apellido_materno, String carrera, String noControl, String m1, String m2, String m3)
	{
		double materia1 = Double.parseDouble(m1),
				materia2 = Double.parseDouble(m2),
				materia3 = Double.parseDouble(m3);
		double promedio = (materia1+materia2+materia3)/3;
		PrintWriter archivoSalida;
		try {
			archivoSalida = new PrintWriter(new FileWriter("alumnos/"+nombre+" "+apellido_paterno+" "+apellido_materno), true);
			archivoSalida.println(nombre+","+apellido_paterno+","+apellido_materno+","+carrera+","+noControl+","+materia1+","+materia2+","+materia3+","+promedio);
			archivoSalida.close();
			JOptionPane.showMessageDialog(null, "¡Alumno agregado con exito!");
		}
		catch(IOException e) {
			System.err.println("Error en archivo: "+e.toString());
			System.exit(1);
		}
	}
	
	public void eliminar(String nombre)
	{
		if(nombre == null || nombre == "" || nombre.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Selecciona un alumno");
			return;
		}
		
		File file = new File("alumnos/"+nombre);
		if(file.delete())
			JOptionPane.showMessageDialog(null, "El archivo del alumno se ha borrado.");
		else
			JOptionPane.showMessageDialog(null, "El archivo del alumno no puede ser borrado");
	}
	
	public void info(String nombre)
	{
		try 
		{
			String[] info;
			BufferedReader file = new BufferedReader(new FileReader("alumnos/"+nombre));
			String linea;
			linea = file.readLine();
			info = linea.split(",");
			for(int i=0; i<info.length; i++)
				System.out.println(info[i]);
			
			file.close();
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Selecciona un alumno");
		}
	}
	
	public String[][] getAlumnos()
	{
		File f = new File("alumnos/");
		File[] ficheros = f.listFiles();
		String[][] alumnos = new String[ficheros.length][9];
		BufferedReader file;
		for (int x=0; x<ficheros.length; x++){
			try 
			{
				String[] info;
			    file = new BufferedReader(new FileReader("alumnos/"+ficheros[x].getName()));
				String linea;
				linea = file.readLine();
				info = linea.split(",");
				for(int i=0; i<info.length; i++)
					alumnos[x][i] = info[i];
				
				file.close();
			}
			catch (IOException e) {
				System.err.println("Error en archivo "+ficheros[x].getName()+": "+e.toString());
				System.exit(1);
			}
		}
		return alumnos;
	}
	
	public int count()
	{
		File f = new File("alumnos/");
		File[] ficheros = f.listFiles();
		return ficheros.length;
	}
}
