package otro;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Vector;

public class ExamenUnidad3 {

    public static void main(String[] args) {
        int opcion = 0, total = 0;
        String[] palabras = new String[0];
        int[] numeros = new int[0];
        boolean hayNumeros = false;
        boolean hayPalabras = false;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Número de la acción a realizar\n" +
                    "1.- Capturar palabras\n" +
                    "2.- Capturar números\n" +
                    "3.- Ordenar con Inserción Binaria ALFABETICAMENTE (A-Z) las palabras\n" +
                    "4.- Ordenar con Quicksort Directa DESCENDENTE los números\n" +
                    "5.- Ordenar con Selección ALFABÉTICAMENTE INVERSO (Z-A) las palabras\n" +
                    "6.- Salir"));
            switch (opcion) {
                case 1:
                    total = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras agregarás?"));
                    palabras = new String[total];
                    for(int i=0; i<total; i++) {
                        palabras[i] = JOptionPane.showInputDialog("Dame la palabra "+(i+1)+":");
                    }
                    hayPalabras = true;
                    break;
                case 2:
                    total = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números agregarás?"));
                    numeros = new int[total];
                    for(int i=0; i<total; i++) {
                        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame el número entero "+(i+1)+":"));
                    }
                    hayNumeros = true;
                    break;
                case 3:
                    if(hayPalabras)
                        insercionBinaria(palabras);
                    else
                        JOptionPane.showMessageDialog(null, "Captura palabras primero");
                    break;
                case 4:
                    if(hayNumeros) {
                        System.out.println("Números ingresados: \n"+Arrays.toString(numeros));
                        quickSort(numeros, 0, numeros.length - 1);
                        System.out.println("Números por ordernamiento quickSort:\n"+Arrays.toString(numeros));
                    } else
                        JOptionPane.showMessageDialog(null, "Captura números primero");
                    break;
                case 5:
                    if(hayPalabras)
                        seleccion(palabras);
                    else
                        JOptionPane.showMessageDialog(null, "Captura palabras primero");
                    break;
            }

        } while(opcion !=  6);
    }

    static void insercionBinaria(String[] palabras)
    {
        System.out.println("Palabras ingresadas: \n"+Arrays.toString(palabras));
        int i, j, izq, der, m;
        String aux, elemento;
        for(i=1; i<palabras.length; i++)
        {
            aux = palabras[i];
            izq = 0;
            der = i-1;
            while(izq <= der)
            {
                m = (izq + der)/2;
                elemento = palabras[m];
                if(aux.charAt(0) == elemento.charAt(0)) {
                    if(aux.charAt(1) < elemento.charAt(1))
                        der = m - 1;
                    else
                        izq = m+1;
                } else if (aux.charAt(0) < elemento.charAt(0))
                    der = m - 1;
                else
                    izq = m+1;
            }
            j = i-1;
            while(j >= izq)
            {
                palabras[j+1] = palabras[j];
                j = j-1;
            }
            palabras[izq] = aux;
        }
        System.out.println("Palabras ordenadas por Inserción Binaria\n"+Arrays.toString(palabras));
    }

    public static void quickSort(int[] numeros, int izquierda, int derecha) {
        int pivote = numeros[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (numeros[i] <= pivote && i < j) {
                i++;
            }
            while (numeros[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = auxIntercambio;
            }
        }
        numeros[izquierda] = numeros[j];
        numeros[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(numeros, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(numeros, j + 1, derecha);
        }
    }

    public static void seleccion(String[] palabras) {
        System.out.println("Palabras ingresadas:\n"+Arrays.toString(palabras));
        for (int i = 0; i < palabras.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < palabras.length; j++)
            {
                if (palabras[j].charAt(0) == palabras[min].charAt(0)) {
                    if (palabras[j].charAt(1) > palabras[min].charAt(1))
                        min = j;
                } else if (palabras[j].charAt(0) > palabras[min].charAt(0))
                    min = j;
            }
            if (i != min)
            {
                String aux= palabras[i];
                palabras[i] = palabras[min];
                palabras[min] = aux;
            }
        }
        System.out.println("Palabras por seleccion inversa:\n"+Arrays.toString(palabras));
    }
}
