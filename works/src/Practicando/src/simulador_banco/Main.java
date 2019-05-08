package simulador_banco;

public class Main {

	public static void main(String[] args) {
		Banco Banamex = new Banco();
		Banamex.abrirBanco(20, 3);
		
		System.out.println("Hecho.");
	}
}
