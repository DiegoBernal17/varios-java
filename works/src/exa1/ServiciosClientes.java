package exa1;

import java.util.Scanner;

public class ServiciosClientes {

    private Scanner entrada;

    public ServiciosClientes() {
        entrada = new Scanner(System.in);
    }

    public int habitacionPorNoche() {
        int habitacion;
        do {
            System.out.println(
                    "TIPO DE HABITACIÓN:\n" +
                            "1) Presidencial: $5000 (4 PERSONAS)\n" +
                            "2) Deluxe: $3000 (4 PERSONAS)\n" +
                            "3) Doble: $1500 (2 PERSONAS)\n" +
                            "4) Sencilla: $700 (1 PERSONAS)\n" +
                            "Ingresa el número de la opción a seleccionar: ");
            habitacion = entrada.nextInt();
        } while(habitacion < 1 || habitacion > 4);

        return habitacion;
    }

    public int personaExtra() {
        System.out.println("SERVICIOS EXTRAS:\nHuesped extra (0-1): ");
        if(entrada.nextInt() > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int desayuno() {
        int desayuno;
        do {
            System.out.println("SERVICIOS EXTRAS:\n" +
                    "1) Desayuno Americano\n" +
                    "2) Desayuno Bufete\n" +
                    "3) Ninguno");
            desayuno = entrada.nextInt();
        } while(desayuno < 1 || desayuno > 3);
        return desayuno;
    }

    public int formaDePago() {
        int pago;
        do {
            System.out.println(
                    "FORMA DE PAGO: \n" +
                    "1) Efectivo (sin cargo extra)\n" +
                    "2) Tarjeta de credito (3% de comisión)\n" +
                    "Ingresa el número de la opción a seleccionar: ");
            pago = entrada.nextInt();
        } while(pago < 1 || pago > 2);
        return pago;
    }
}
