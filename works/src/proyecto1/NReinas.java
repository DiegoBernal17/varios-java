package proyecto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class NReinas {
	public static Vector<Vector<Vector<Integer>>> tableros = new Vector(8,10);
	// encuentra todas las posiciones usando vuelta atras
	
	public  void queen(int N) {
		int[] a = new int[N];
		queenRecursivo(a, 0);
	}

	private  void queenRecursivo(int[] q, int n) {
		int N = q.length;
		if (n == N) {
			tableros.add(printQueens(q));
		}
		else {
			for (int i = 0; i < N; i++) {
				q[n] = i;
				if (isValid(q, n))
					queenRecursivo(q, n + 1);
			}
		}
	}
	
	public  boolean isValid(int[] q, int n) {
		for (int i = 0; i < n; i++) {
			if (q[i] == q[n])
				return false; // columna
			if ((q[i] - q[n]) == (n - i))
				return false; // diagonal superior
			if ((q[n] - q[i]) == (n - i))
				return false; // diagonal inferior
		}
		return true;
	}

	// imprime q donde va la reina y forma el tablero con los asteriscos
	public  Vector printQueens(int[] q) {
		int N = q.length;
		Vector ejes = new Vector(2);
		Vector ejesi = new Vector(8,10);
		Vector ejesj = new Vector(8,10);
		ejes.add(ejesi);
		ejes.add(ejesj);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (q[i] == j) {
					System.out.print("Q ");
					ejesi.add(i);
					ejesj.add(j);
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		return ejes;
	}
	

}// Class