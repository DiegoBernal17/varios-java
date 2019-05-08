package practicasu4;
import java.io.*;

class Buscador {
	
	private String linea1, linea2, linea3;
	private BufferedReader teclado, flujoEntrada;
	
	public static void main(String[] args) {
		Buscador unBusc = new Buscador();
		unBusc.hacerBusqueda(args[0]);
	}
	
	public void hacerBusqueda(String nombreArchivo) {
		teclado = new BufferedReader(new InputStreamReader(System.in),1);
		String buscado = indicador("Introduzca cadena a buscar:");
		linea1 = "";
		linea2 = "";
		try {
			flujoEntrada = new BufferedReader(new FileReader(nombreArchivo));
			while((linea3 = flujoEntrada.readLine()) != null) {
				if(linea2.indexOf(buscado) >= 0)
					mostrarLinea();
				
				// Avanzar el siguiente grupo de 3
				linea1 = linea2;
				linea2 = linea3;
				// y obtener nueva linea3 del archivo...
			}
			
			// revisar la última línea
			linea3 = ""; 		// eliminar valor eof nulo
			if(linea2.indexOf(buscado) >= 0)
				mostrarLinea();
			flujoEntrada.close();
		}
		catch(IOException e) {
			System.err.println("Error en Buscador: "+e.toString());
			System.exit(1);
		}
	}
	
	private void mostrarLinea() {
		System.out.println("<<------------ contexto:");
		System.out.println(linea1);
		System.out.println(linea2);
		System.out.println(linea3);
		System.out.println("                         ------------>> ");
		System.out.println("");
	}
	
	private String indicador(String mensaje) {
		String respuesta = "";
		try {
			System.out.println(mensaje);
			System.out.flush();
			respuesta = teclado.readLine();
		}
		catch(IOException e) {
			System.out.println("Entrada de teclado "+e.toString());
			System.exit(2);
		}
		return respuesta;
	}
}
