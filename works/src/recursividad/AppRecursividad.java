package recursividad;

import java.util.ArrayList;
import java.util.Arrays;
import javax.print.attribute.standard.NumberUp;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AppRecursividad {

    public static void main(String[] args) {
        int opcion;
        Integer[] numeros;
        String menu =
                "1. Cuenta negativos en el arreglo\n" +
                "2. Suma los múltiplos de 3 en el arreglo\n" +
                "3. Encuentra el elemento menor del arreglo\n" +
                "4. Terminar\n" +
                "Dame el número de la opción a seleccionar: ";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            // Aquí se agrega la ruta del archivo
            numeros = cargarContenido("src/recursividad/P1R-Enteros.txt");
            int val;
            switch (opcion) {
                case 1:
                    val = cuentaNegativos(numeros);
                    mostrarResultado(numeros, val);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "EN CONSTRUCCIÓN");
                    // val = sumaMultiplos3(numeros);
                    // mostrarResultado(numeros, val);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "EN CONSTRUCCIÓN");
                    // val = elementoMenor(numeros);
                    // mostrarResultado(numeros, val);
                    break;
            }
        } while(opcion != 4);
    }

    public static int cuentaNegativos(Integer[] enteros) {
        if(enteros.length > 1) {
            Integer[] enteros2 = Arrays.copyOf(enteros, enteros.length-1);
            int val = cuentaNegativos(enteros2);
            if(enteros[enteros.length-1] < 0)
                return val+1;
            return val;
        } else {
            if (enteros[0] < 0)
                return 1;
            return 0;
        }
    }

    public static int sumaMultiplos3(Integer[] enteros) {
        int val = 0;
        if(enteros.length > 1) {
            Integer[] enteros2 = Arrays.copyOf(enteros, enteros.length-1);
            val = sumaMultiplos3(enteros2);
            int num = enteros[enteros.length-1];
            if(num % 3 == 0)
                return val+num;
        } else {
            int num = enteros[0];
            if(num % 3 == 0)
                return num;
        }
        return val;
    }

    public static int elementoMenor(Integer[] enteros) {
        if(enteros.length > 1) {
            Integer[] enteros2 = Arrays.copyOf(enteros, enteros.length-1);
            int val = elementoMenor(enteros2);
            int num = enteros[enteros.length-1];
            if(val < num)
                return val;
            return num;
        } else {
            return enteros[0];
        }
    }

    public static Integer[] cargarContenido(String archivo) {
        String linea;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        try {
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while ((linea = b.readLine()) != null) {
                numeros.add(Integer.parseInt(linea));
            }
            b.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Archivo no encontrado.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR con el archivo.\n"+e.getMessage());
        }
        Integer[] enteros = new Integer[numeros.size()];
        for(int i=0; i<enteros.length; i++) {
            enteros[i] = (Integer)numeros.toArray()[i];
        }
        return enteros;
    }

    public static void mostrarResultado(Integer[] numeros, int valor) {
        String mensaje = "Números: \n";
        for(Integer n : numeros) {
            mensaje += n+"\n";
        }
        mensaje += "Resultado: "+valor;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
