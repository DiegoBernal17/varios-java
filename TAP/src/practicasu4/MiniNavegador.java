package practicasu4;
import java.io.*;
import java.net.*;

public class MiniNavegador {

	private BufferedReader flujoEntrada, teclado;
	
	public static void  main(String[] args) {
		MiniNavegador unNavegador = new MiniNavegador();
		unNavegador.buscar();
	}
	
	private void buscar() {
		String cadenaURL = "";
		String linea;
		teclado = new BufferedReader(new InputStreamReader(System.in),1);
		try {
			cadenaURL = indicador("Introduzca una dirección de URL (ej. http://java.sun.com/) :");
			
			// crear un vínculo hacía un URL
			URL direccionURL = new URL(cadenaURL);
			URLConnection vinculo = direccionURL.openConnection();
			
			flujoEntrada = new BufferedReader(new InputStreamReader(vinculo.getInputStream()));
			
			while((linea = flujoEntrada.readLine()) != null) {
				System.out.println(linea);
			}
		}
		catch(MalformedURLException e) {
			System.err.println(cadenaURL + e.toString());
			System.exit(2);
		}
		catch(IOException e) {
			System.err.println("Error en acceso a URL: "+e.toString());
			System.exit(1);
		}
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
		}
		return respuesta;
	}
}
