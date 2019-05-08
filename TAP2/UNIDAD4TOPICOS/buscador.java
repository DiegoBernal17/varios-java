
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buscador {
	
	private String linea1,linea2,linea3;
	private BufferedReader teclado, flujoEntrada;
	
	public static void main(String[] args)
	{
		buscador unBusc = new buscador();
		unBusc.hacerBusqueda("textosalida.txt");
		
	}
	private void hacerBusqueda(String nombreArchivo)
	{
		teclado = new BufferedReader(new InputStreamReader(System.in),1);
		String buscado = indicador ("Introduzca cadena a buscar");
		linea1 = "";
		linea2 = "";
		try{
			flujoEntrada = new BufferedReader(new FileReader(nombreArchivo));
			
			while((linea3 = flujoEntrada.readLine())!= null)
			{
				if(linea2.indexOf(buscado)>=0)
					mostrarLinea();
				
				linea1=linea2;
				linea2=linea3;
			}
			linea3 = "";
			if(linea2.indexOf(buscado)>=0)
				mostrarLinea();
			flujoEntrada.close();
		}catch(IOException e)
		{
			System.err.println("Error en Buscador : " + e.toString());
			System.exit(1);
		}
	}
	private void mostrarLinea()
	{
		System.out.println("<<------- contexto");
		System.out.println(linea1);
		System.out.println(linea2);
		System.out.println(linea3);
		System.out.println("         -------------->>");
		System.out.println("");
	}
	public String indicador(String mensaje)
	{
		String respuesta = "";
		try{
			System.out.println(mensaje);
			System.out.flush();
			respuesta = teclado.readLine();
		}catch(IOException e)
		{
			System.out.println("Entrada de teclado" + e.toString());
			System.exit(2);
		}
		return respuesta;
	}

}
