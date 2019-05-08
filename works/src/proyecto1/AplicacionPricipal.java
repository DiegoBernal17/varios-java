package proyecto1;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *Proyecto Final de topicos la cual es una aplicacion para ver todo lo que hicimos en Recursividad
 *
 * @author 
 * @version (ABRIL 2018)
 */
public class AplicacionPricipal
{

    public static void main(String[] args) {
        int opcion, opcion2, opcion3, opcion4, opcion5;
        int[] arreglo = new int[0];
        String caso = "";
        int tamano = 0;
        boolean datosGenerados = false;

        do {
            opcion = mensajeMenu("Menú Principal\n1. Recursividad\n2. Ordenamiento\n3. Busqueda\n4. Salir");
            switch (opcion) {
                case 1:
                    do {
                        opcion2 = mensajeMenu("1.Torres de Hanoi\n2.N-Reinas\n3.Salir");
                        int n = 0;
                        switch (opcion2) {
                            case 1:
                                n = Integer.parseInt(JOptionPane.showInputDialog("Torres de Hanoi\nIngrese n:"));

                                String inicio = JOptionPane.showInputDialog("Primera Torre");
                                String aux = JOptionPane.showInputDialog("Segunda Torre");
                                String destino = JOptionPane.showInputDialog("Tercera Torre");
                                torresDeHanoiRecursivo.hanoi(n, inicio, aux, destino);

                                JOptionPane.showMessageDialog(null, "Torres de Hanoi: Hecho.");
                                break;
                            case 2:
                                n = Integer.parseInt(JOptionPane.showInputDialog("N-Reina\nIngrese n:"));
                                NReinas queen = new NReinas();
                                queen.queen(n);
                                JOptionPane.showMessageDialog(null, "N-Reina: Hecho.");
                                break;
                        }
                    } while (opcion2 != 3);
                    break;
                case 2:
                    do {
                        opcion2 = mensajeMenu("1.Generar datos\n2.Ordenamiento\n3.Salir");
                        switch (opcion2) {
                            case 1:
                                do {
                                    opcion3 = mensajeMenu("1.Mejor caso\n2.Peor caso\n3.Caso promedio\n4.Caso Mixto\n5.Salir");
                                    switch (opcion3) {
                                        case 1:
                                            caso = "Mejor caso";
                                            tamano = Integer.parseInt(JOptionPane.showInputDialog("Mejor caso\nIngrese Tamaño:"));
                                            arreglo = new int[tamano];
                                            generadorDeDatos.mejorCaso(arreglo);
                                            break;
                                        case 2:
                                            caso = "Peor caso";
                                            tamano = Integer.parseInt(JOptionPane.showInputDialog("Peor caso\nIngrese tamaño:"));
                                            arreglo = new int[tamano];
                                            generadorDeDatos.peorCaso(arreglo);
                                            break;
                                        case 3:
                                            caso = "Caso promedio";
                                            tamano = Integer.parseInt(JOptionPane.showInputDialog("Caso promedio\nIngrese tamaño:"));
                                            arreglo = new int[tamano];
                                            generadorDeDatos.casoPromedio(arreglo);
                                            break;
                                        case 4:
                                            caso = "Caso mixto";
                                            tamano = Integer.parseInt(JOptionPane.showInputDialog("Caso mixto\nIngrese tamaño:"));
                                            int porcentaje = Integer.parseInt(JOptionPane.showInputDialog("porcentaje"));
                                            arreglo = new int[tamano];
                                            generadorDeDatos.casoMixto(arreglo, porcentaje);
                                            break;
                                    }
                                    if (opcion3 != 5) {
                                        JOptionPane.showMessageDialog(null, caso + ":\n" + Arrays.toString(arreglo));
                                        datosGenerados = true;
                                    }
                                } while (opcion3 != 5);
                                break;
                            case 2:
                                do {
                                    if (!datosGenerados) {
                                        JOptionPane.showMessageDialog(null, "Genera primero datos");

                                        break;
                                    }
                                    opcion3 = mensajeMenu("1.Directos\n2.Salir");
                                    if (opcion3 == 1) {
                                        do {
                                            opcion4 = mensajeMenu("1.Intercambio Directo\n2.Seleccion Directa\n3.Inserccion Directa\n4.MergeSort\n5.RadixSort\n6.HeapSort\n7.Salir");
                                            switch (opcion4) {
                                                case 1:
                                                    do {
                                                        opcion5 = mensajeMenu("1.Burbuja\n2.Burbuja con señal\n3.Shaker Sort\n4.Salir");
                                                        switch (opcion5) {
                                                            case 1:
                                                                caso = "Burbuja";
                                                                metodosDeOrdenamiento.burbuja(arreglo);
                                                                break;
                                                            case 2:
                                                                caso = "Burbuja con señal";
                                                                metodosDeOrdenamiento.burbujaConSenal(arreglo);
                                                                break;
                                                            case 3:
                                                                caso = "Shaker Sort";
                                                                metodosDeOrdenamiento.shakerSort(arreglo);
                                                                break;
                                                        }
                                                        if (opcion5 == 1 || opcion5 == 2 || opcion5 == 3)
                                                            JOptionPane.showMessageDialog(null, caso + ":\n" + Arrays.toString(arreglo));
                                                    } while (opcion5 != 4);
                                                case 2:
                                                    caso = "Selección Directa";
                                                    metodosDeOrdenamiento.seleccionDirecta(arreglo);
                                                    break;
                                                case 3:
                                                    caso = "Insercción Directa";
                                                    metodosDeOrdenamiento.Insercion(arreglo);
                                                    break;
                                                case 4:
                                                    caso = "MergeSort";
                                                    metodosDeOrdenamiento.shakerSort(arreglo);
                                                    break;
                                                case 5:
                                                    caso = "RadixSort";
                                                    metodosDeOrdenamiento.shakerSort(arreglo);
                                                    break;
                                                case 6:
                                                    caso = "HeapSort";
                                                    metodosDeOrdenamiento.ordenacionMonticulos(arreglo);
                                                    break;
                                            }
                                            if (opcion4 == 2 || opcion4 == 3 || opcion4 == 4 || opcion4 == 5 || opcion4 == 6)
                                                JOptionPane.showMessageDialog(null, caso + ":\n" + Arrays.toString(arreglo));
                                        } while (opcion4 != 7);
                                    }
                                } while (opcion3 != 2);
                                break;
                        }
                    } while (opcion2 != 3);
                    break;
                case 3:
                    do {
                        if (!datosGenerados) {
                            JOptionPane.showMessageDialog(null, "Genera primero datos");
                            break;
                        }
                        int dato, resultado;
                        opcion2 = mensajeMenu("1.Busqueda Secuencial\n2.Busqueda Binaria\n3.Busqueda Hash\n4.Salir");
                        switch (opcion2) {
                            case 1:
                                caso = "Busqueda Secuencial";
                                dato = Integer.parseInt(JOptionPane.showInputDialog(null, caso + "Dato a buscar"));
                                resultado = metodosDeBusqueda.busquedaSecuencial(arreglo, dato);

                                if (resultado != -1)
                                    JOptionPane.showMessageDialog(null, caso + ":\nDato encontrado en el índice " + resultado);
                                else
                                    JOptionPane.showMessageDialog(null, caso + ":\nDato No encontrado");
                                break;
                            case 2:
                                caso = "Busqueda Binaria";
                                dato = Integer.parseInt(JOptionPane.showInputDialog(null, caso + "Dato a buscar"));
                                resultado = metodosDeBusqueda.busquedaBinaria(arreglo, dato);

                                if (resultado != -1)
                                    JOptionPane.showMessageDialog(null, caso + ":\nDato encontrado en el índice " + resultado);
                                else
                                    JOptionPane.showMessageDialog(null, caso + ":\nDato No encontrado");
                                break;
                            case 3:
                                caso = "Hash";
                                dato = Integer.parseInt(JOptionPane.showInputDialog(null,caso+"Dato a buscar"));
                                resultado = metodosDeBusqueda.busquedaBinaria(arreglo, dato);
                                if (resultado != -1)
                                    JOptionPane.showMessageDialog(null, caso + ":\nDato encontrado en el índice " + resultado);
                                else
                                    JOptionPane.showMessageDialog(null, caso + ":\nDato No encontrado");

                                break;
                        }
                    } while(opcion2 != 4);
                    break;
            }
        } while(opcion != 4);
    }

    public static int mensajeMenu(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
}
