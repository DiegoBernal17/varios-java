package practicas;

class Ahorcado {

	public static void main(String[] args) {
		int numero = 0;
		String palabra="", secuencia="", resultado = ""; 
		boolean[] verificarPalabra;

		for(int i=0; i<args.length; i+=3) {
			int numCuentaAux=0,error=0;
			numero = Integer.parseInt(args[i]);
			palabra = args[i+1];
			secuencia = args[i+2];
			verificarPalabra = new boolean[palabra.length()];

			System.out.print("Ronda "+numero);
			for(int s=0; s<secuencia.length(); s++) {
				int errorAux=0;
				for (int p=0; p<palabra.length(); p++) {
					if(secuencia.charAt(s) == palabra.charAt(p)) {
						verificarPalabra[p] = true;
					} else {
						errorAux++;
					}
				}
				if(errorAux >= palabra.length()) {
					error++;
				}
			}

			if( error > 6 ) {
				System.out.print(" Perdiste!");
			} else {
				for(int w=0; w<verificarPalabra.length; w++) {
					if(verificarPalabra[w]) {
						numCuentaAux++;
					}
				}		
				if(palabra.length() == numCuentaAux) {
					System.out.print(" Ganaste!");
				} else if(secuencia.length() < 6) {
					System.out.print(" Te rajaste!");
				} else {
					System.out.print(" Perdiste!");
				}
			}
			System.out.println();
		}
	}
}
