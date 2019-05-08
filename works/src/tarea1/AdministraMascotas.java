package tarea1;

import java.util.Scanner;

public class AdministraMascotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, tamanio=0, ultimaPosicion=0, posicion;
        String[] mascotas = new String[0];
        String menu = "1) Inicializar DB\n2) Agregar Mascota\n3) Modificar Mascota\n4) Salir\nSelecciona el numero de una opción: ";

        do {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("- Tamaño del arreglo: ");
                    tamanio = sc.nextInt();
                    mascotas = new String[tamanio];
                    break;
                case 2:
                    if(tamanio == 0) {
                        System.out.println(">> Primero inicializa el arreglo.");
                    } else if(ultimaPosicion < tamanio) {
                        System.out.println("- Nombre de la mascota: ");
                        mascotas[ultimaPosicion] = sc.next();
                        ultimaPosicion++;
                    } else {
                        System.out.println(">> La capacidad del arreglo llegó a su límite.");
                    }
                    break;
                case 3:
                    if(tamanio == 0) {
                        System.out.println("- Posición de la mascota");
                        posicion = sc.nextInt();
                        if (posicion >= 0 && posicion < ultimaPosicion) {
                            System.out.println("- Nuevo nombre de la mascota: ");
                            mascotas[posicion] = sc.next();
                        } else {
                            System.out.println(">> Esa mascota no existe.");
                        }
                    }
                    break;
            }
        } while(opcion != 4);
    }
}
