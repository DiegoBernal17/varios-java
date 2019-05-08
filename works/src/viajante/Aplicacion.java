package viajante;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        int objetosTotales, pesoMaximo;
        int[] valores, pesos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Peso máximo de la maleta: ");
        pesoMaximo = sc.nextInt();
        System.out.println("Total de objetos en la maleta: ");
        objetosTotales = sc.nextInt();
        valores = new int[objetosTotales];
        pesos = new int[objetosTotales];
        for(int i =0; i<objetosTotales; i++) {
            System.out.println("Datos del objeto "+(i+1)+"");
            System.out.println("Valor: ");
            valores[i] = sc.nextInt();
            System.out.println("Peso: ");
            pesos[i] = sc.nextInt();
            System.out.println();
        }
        new Optima(valores, pesos, pesoMaximo, objetosTotales);
    }
}
