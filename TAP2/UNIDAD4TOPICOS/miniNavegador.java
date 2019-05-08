import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class miniNavegador {
	private BufferedReader flujoEntrada, teclado;
	
	public static void main(String[] args) {
		miniNavegador nav = new miniNavegador();
			nav.buscar();

	}
	private void buscar()
	{
		String cadenaURL="";
		String linea;
		teclado = new BufferedReader(new InputStreamReader(System.in),1);
		try{
			cadenaURL = "https://www.google.com.mx/?gfe_rd=cr&ei=bJAqWO3SJY_D8gf65rzABQ";
			
			URL direccionURL = new URL(cadenaURL);
			URLConnection vinculo = direccionURL.openConnection();
			
			flujoEntrada = new BufferedReader(new InputStreamReader(vinculo.getInputStream()));
			
			while((linea = flujoEntrada.readLine())!=null)
			{
				System.out.print(linea);
			}
		}catch(MalformedURLException e)
		{
			System.err.println(cadenaURL + e.toString());
			System.exit(2);
		}
		catch(IOException e)
	{
		System.err.println("Error en acceso a URL:" + e.toString());
		System.exit(1);
	}

	}
}
